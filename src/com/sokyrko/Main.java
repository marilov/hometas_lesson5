package com.sokyrko;

public class Main {

    public static void main(String[] args) {

        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        findRepeatedNumbers(arrayNumbers);
        findSum(arrayNumbers);
        deleteElement(arrayNumbers);
        findAverage(arrayNumbers);
        diagonalElements(arrayNumbers);

    }

    //Task_1: Program finds array sum

    public static int findSum(int[] arrayNumbers) {
        int sum = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            sum = sum + arrayNumbers[i];
        }
        return sum;
    }

    //Task_2: Program deletes preset element from array

    public static void deleteElement(int[] arrayNumbers) {
        int deletedNumber = 3;
        int i = 0;
        boolean isPresent = false;
        int arraySize = arrayNumbers.length;

        for (i = 0; i < arraySize; i++) {
            if (arrayNumbers[i] == deletedNumber) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            for (int j = i; j < arraySize - 1; j++) {
                arrayNumbers[j] = arrayNumbers[j + 1];
            }
            arraySize--;

            for (i = 0; i < arraySize; i++) {
                System.out.print(arrayNumbers[i] + " ");
                System.out.println();
            }
        } else {
            System.out.println("Нечего удалять");
        }
    }


    //Task_3: Program finds repeated numbers in the array

    public static void findRepeatedNumbers(int[] arrayNumbers) {
        int sum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++)
                if (arrayNumbers[i] == arrayNumbers[j]) {
                    System.out.println("Все повторяющиеся значения: " + arrayNumbers[j]);
                    if (arrayNumbers[j] != arrayNumbers[i]) {
                        System.out.println("Повторяющихся значений нет.");
                    }
                }
        }
    }

    //Task_4: Program finds average number in the array

    public static void findAverage(int[] arrayNumbers) {
        double average = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            average = findSum(arrayNumbers) / arrayNumbers.length;
        }
        System.out.println("Среднее арифметическое: " + average);
    }


    //Task_5: Program shows all array elements diagonally

    public static void diagonalElements(int[] arrayNumbers) {
        outer:
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + arrayNumbers[j]);
            }
        }
    }
}
