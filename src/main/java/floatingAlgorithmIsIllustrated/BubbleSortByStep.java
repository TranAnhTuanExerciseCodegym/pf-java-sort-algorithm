package floatingAlgorithmIsIllustrated;


import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a value " + (i + 1));
            array[i] = scanner.nextInt();
        }
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("------------");

        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void print(int[] array) {
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] array) {
        boolean check = true;
        for (int i = array.length - 1; i > 0 && check; i--) {
            check = false;
            for (int j = 0; j < i; j++) {
                print(array);
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
        }
    }
}

