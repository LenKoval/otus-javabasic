package homework2.ElenaKovaleva;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //       Main HWTwo
        int[] array = {1, 4, 6, 8, 4, 3};
        printString(5, "Hello world!");
        sumAndPrint(array);
        fillArray(3, array);
        //System.out.println(Arrays.toString(array));
        incrementElement(2, array);
        System.out.println(Arrays.toString(array));
        sumHalfAndPrint(array);

        //      *HWTwo
        int[] array1 = {1, 4, 6, 8, 3};
        int[] array2 = {3, 2, 1};
        int[] array3 = {1, 2, 2, 4};
        sumArraysAndPrint(array1, array2, array3);
        checkArr(array1);
        askUserAndCheckNumbers(array3);
        flipArray(array1);

    }

    //           MAIN HOMEWORK-TWO

    public static void printString(int number, String str) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static void sumAndPrint(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
    }

    public static void incrementElement(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
    }

    public static void sumHalfAndPrint(int[] arr) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumOne += arr[i];
        }
        //System.out.println(sumOne);

        for (int i = arr.length / 2; i < arr.length; i++) {
            sumTwo += arr[i];
        }
        //System.out.println(sumTwo);

        if (sumOne == sumTwo) {
            System.out.println("Суммы равны.");
        } else if (sumOne > sumTwo) {
            System.out.println("Сумма элементов первой половины массива больше второй.");
        } else {
            System.out.println("Сумма элементов второй половины массива больше первой.");
        }
    }

    //                 *HOMEWORK-TWO

    public static void sumArraysAndPrint(int[] arr1, int[] arr2, int[] arr3) {
        int[] sumArr;
        int[] resultArr;

        if(arr1.length >= arr2.length) {
            sumArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                sumArr[i] = arr1[i];
            }
            for(int i = 0; i < arr2.length; i++) {
                sumArr[i] += arr2[i];
            }
        } else {
            sumArr = new int[arr2.length];
            for (int i = 0; i < arr2.length; i++) {
                sumArr[i] = arr2[i];
            }
            for (int i = 0; i < arr1.length; i++) {
                sumArr[i] += arr1[i];
            }
        }

        if(sumArr.length >= arr3.length) {
            resultArr = new int[sumArr.length];
            for (int i = 0; i < sumArr.length; i++) {
                resultArr[i] = sumArr[i];
            }
            for (int i = 0; i < arr3.length; i++) {
                resultArr[i] += arr3[i];
            }
        } else {
            resultArr = new int[arr3.length];
            for (int i = 0; i < arr3.length; i++) {
                resultArr[i] = arr3[i];
            }
            for (int i = 0; i < sumArr.length; i++) {
                resultArr[i] += sumArr[i];
            }
        }
        System.out.println(Arrays.toString(resultArr));
    }

    public static void checkArr(int[] arr) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            for (int e = i + 1; e < arr.length; e++) {
                right += arr[e];
            }
            if (left == right) {
                System.out.println("Равенство между элементами массива найдено.");
                break;
            }
            right = 0;
        }
    }

    public static void askUserAndCheckNumbers(int[] arr) {
        boolean checkOne = false;
        boolean checkTwo = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию для проверки: 1 - проверить, что все элементы массива идут в порядке убывания; " +
                "2 - проверить, что все элементы массива идут в порядке возрастания.");
        int result = scanner.nextInt();
        if (result == 1) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i - 1]) {
                    checkOne = true;
                } else {
                    checkOne = false;
                }
            }

            if(checkOne == true && arr[0] >= arr [1]) {
                System.out.println("Элементы в массиве расположены в порядке убывания.");
            } else {
                System.out.println("Массив не упорядочен.");
            }
        }

        if (result == 2) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i - 1]) {
                    checkTwo = true;
                } else {
                    checkTwo = false;
                }
            }

            if(checkTwo == true && arr[0] <= arr[1]) {
                System.out.println("Элементы в массиве расположены в порядке возрастания.");
            } else {
                System.out.println("Массив не упорядочен.");
            }
        }
    }

    public static void flipArray(int[] arr) {
        int[] flipArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            flipArr[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = flipArr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
