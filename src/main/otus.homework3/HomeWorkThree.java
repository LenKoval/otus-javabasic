package otus.homework3;

public class HomeWorkThree {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 2}, {3, 4}};
        int[][] arr2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] arr3 = {{2, 0, 27}, {2, 1, 8}, {32, 0, 7}};
        int[][] arr4 = {{1}, {0}};
        int number = 5;
        System.out.println("Сумма элементов массива: " + sumOfPositiveElements(arr1));
        System.out.println();
        printSquare(number);
        zeroDiagonal(arr2);
        System.out.println("Максимальный элемент массива: " + findMax(arr3));
        System.out.println(sumElementStr(arr3));
        System.out.println(sumElementClm(arr3));

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] zeroDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i || j == arr.length - 1 - i) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    public static int findMax(int[][] arr) {
        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxElement < arr[i][j]) {
                    maxElement = arr[i][j];
                }
            }
        }
        return maxElement;
    }

    public static int sumElementStr(int[][] arr) {
        int sumElementStr = 0;
        if (arr.length < 2) {
            return -1;
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumElementStr += arr[1][j];
            }
        }
        return sumElementStr;
    }



    public static int sumElementClm(int[][] arr) {
        int sumElementClm = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[0].length < 2) {
                return -1;
            }
             sumElementClm += arr[i][1];
        }
        return sumElementClm;
    }
}
