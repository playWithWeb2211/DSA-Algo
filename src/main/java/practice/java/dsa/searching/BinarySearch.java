package practice.java.dsa.searching;

import java.util.Scanner;

public class BinarySearch {

    private static boolean binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length -1;
        while(low <= high){
            int mid = (low + (high - low)/2);
            System.out.println("Mid Element " + mid);
            if(key == arr[mid]){
                return true;
            }
            else if(key > arr[mid]){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int lenArray = sc.nextInt();
        System.out.println("Enter the array elements ..");
        int[] arr = new int[lenArray];
        for(int i = 0; i < lenArray; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(" [ ");
        for(int j = 0; j < lenArray; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.print(" ] ");
        System.out.println();

        System.out.println("Check Array elements above and enter the element to be searched in array");
        int key = sc.nextInt();
        sc.close();
        boolean isPresentInArray = binarySearch(arr,key);
        System.out.println("Is element preset in Array : " + isPresentInArray);
    }
}
