package com.sokyrko;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    }
}

//Validate {1,2} array


class TestTaskAll {

    public ArrayList<String> format(ArrayList<String> src) {

        //new array
        ArrayList<String> formatted = new ArrayList<>();

        //loop
        for (String currentElement : src) {
            //check: isValid
            if (isValid(currentElement)) {
                formatted.add(currentElement);
            }
        }
        return formatted;
    }

    private Boolean isValid(String element) {


        if (element.startsWith("{") && element.endsWith("}")) {
            element = element.substring(1, element.length() - 1);
            String[] numbers = element.split(",");
            if (numbers.length != 2) {
                return false;
            }

            int left = Integer.parseInt(numbers[0]);
            int right = Integer.parseInt(numbers[1]);

            return left < right;

        }
        return false;
    }
}

//Remove spaces from sentence

class SentenceTask {

    public static void main(String[] args) {

        int wordNumber = countWords("Hello, this is an interesting functions, parse it");
        System.out.println(wordNumber);

    }

    public static int countWords(String sentence) {

        String[] words = sentence.split(" ");

        return words.length;
    }
}

// Validate phone number

class NumbersTask {

    public static void main(String[] args) {
        System.out.println(validFormat("+380935202020"));
    }

    public static Boolean validFormat(String number) {

        boolean isContainFormat = false;
        boolean isNumberSize = false;
        boolean isWithoutSpaces = false;
        boolean isWithoutChars = false;

        if (number.startsWith("+380")) {
            isContainFormat = true;
        }

        if (number.length() == 13) {
            isNumberSize = true;
        }

        if (!number.contains(" ")) {
            isWithoutSpaces = true;
        }

        if (number.substring(1).matches("[0-9]+")) {
            isWithoutChars = true;
        }

        return isContainFormat & isNumberSize & isWithoutSpaces & isWithoutChars;
    }

}



