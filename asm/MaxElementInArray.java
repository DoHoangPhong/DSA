package DSA.asm;
import java.util.Scanner;

public class MaxElementInArray {
    public static int findMaxElement(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = findMaxElement(array);
        System.out.println("The maximum element in the array is: " + max);
    }
}
