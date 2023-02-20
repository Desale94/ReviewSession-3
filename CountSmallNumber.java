package com.bridgelabz.Example;

public class CountSmallNumber {

    public static void main(String[] args) {

        // The array elements
        int[] arr = {3, 22, 7, 5, 3, 8, 11, 6, 3};
        int i;
        System.out.println("The array elements are-");

        // Print the array elements
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        int min = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("Min number is: " +min);
        int count=0;
        for (i=0; i< arr.length; i++){
            if (arr[i] == min){
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("Count of smaller number is: "+count);
    }
}