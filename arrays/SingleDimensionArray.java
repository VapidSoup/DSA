package arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[];

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted " + value + " at location " + location);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public void accessCell(int cellNumber) {
        try {
            System.out.println(arr[cellNumber]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void delete(int cellNumber) {
        try {
            arr[cellNumber] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void deleteAll() {
        try {
            arr = null;
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);
        sda.insert(3, 40);
        sda.insert(4, 50);
        sda.insert(5, 60);
        sda.insert(6, 70);
        sda.insert(1, 100);
        sda.traverseArray();
        sda.accessCell(1);
        sda.delete(1);
        sda.traverseArray();
        sda.accessCell(1);
        System.out.println(Arrays.toString(sda.arr));
    }
}
