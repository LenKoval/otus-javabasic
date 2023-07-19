package homework3.ElenaKovaleva;
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
        //System.out.println(Arrays.toString(array));
        sumHalfAndPrint(array);

        //      *HWTwo
        int[] array1 = {1, 4, 6, 8, 3};
        int[] array2 = {3, 2, 1};
        int[] array3 = {1, 2, 2, 4};
        //sumArraysAndPrint(array1, array2, array3);
        checkArr(array1);
        //askUserAndCheckNumbers(array3);
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
            arr[i] = arr[i] + number;
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

    /*public static void sumArraysAndPrint(int[] arr1, int[] arr2, int[] arr3) {
        int[] sumArr;
        if(arr1.length > arr2.length && arr1.length > arr3.length) {
            sumArr = new int[arr1.length];
            for(int i = 0; i < sumArr.length; i++) {
                sumArr[i] = arr1[i] + arr2[i] + arr3[i];
            }
        } else if (arr2.length > arr1.length && arr2.length > arr3.length) {
            sumArr = new int[arr2.length];
            for(int i = 0; i < sumArr.length; i++) {
                sumArr[i] = arr1[i] + arr2[i] + arr3[i];
            }
        } else {
            sumArr = new int[arr3.length];
            for(int i = 0; i < sumArr.length; i++) {
                sumArr[i] = arr1[i] + arr2[i] + arr3[i];
            }
        }
        System.out.println(Arrays.toString(sumArr));
    }*/

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
            }
            right = 0;
        }
    }

    //добавить boolean для проверки?

    /*public static void askUserAndCheckNumbers(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию для проверки: 1 - проверить, что все элементы массива идут в порядке убывания; " +
                "2 - проверить, что все элементы массива идут в порядке возрастания.");
        int result = scanner.nextInt();
        if (result == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (i >= i - 1) {
                    System.out.println("Элементы массива идут в порядке убывания.");
                } else {
                    System.out.println("Элементы массива не идут в порядке убывания.");
                }
            }
        } else if (result == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (i <= i + 1) {
                    System.out.println("Элементы массива идут в порядке возрастания.");
                } else {
                    System.out.println("Элементы массива не идут в порядке возрастания.");
                }
            }
        }
    }*/

    public static void flipArray(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);;
        }
    }
}
