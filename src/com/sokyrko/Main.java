package com.sokyrko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

//Checking if the word is Palindrome

class PalindromeString {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam"));
    }

    public static Boolean isPalindrome(String word) {
        StringBuilder palindrome = new StringBuilder(word);
        String str = palindrome.reverse().toString();
        if (word.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}

//Checking if two words are Anagramms

class AnagrammClass {

    public static void main(String[] args) {
        System.out.println(isAnagramm("hEllo", "lohel"));
    }

    public static Boolean isAnagramm(String firstWord, String secordWord) {

        if (firstWord.length() != secordWord.length()) {
            return false;
        } else {

            firstWord.toLowerCase();
            secordWord.toLowerCase();

            char[] char1 = firstWord.toCharArray();
            char[] char2 = secordWord.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            String firstString = new String(char1);
            String secondString = new String(char2);

            if (firstString.equals(secondString)) {
                return true;
            } else {
                return false;
            }

        }
    }
}

//Removing numbers from String 

class DeleteNumbers {

    static String str = new String("Hello, I am 24, I am from Ukraine");

    public static void main(String[] args){

        System.out.println(removeNumbers(str));
    }

    public static String removeNumbers(String args){
        return str.replaceAll("[0-9]+","");
    }
}
