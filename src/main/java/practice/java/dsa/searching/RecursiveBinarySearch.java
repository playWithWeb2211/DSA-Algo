package practice.java.dsa.searching;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class RecursiveBinarySearch {

    private static boolean binarySearch(int[] arr,int low,int high,int key){

        try {
            sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(low > high) return false;

        int mid = (low + (high - low)/2);
        System.out.println("Mid Element : " + mid);

        if (key == arr[mid]){
            return true;
        }
        else if (key > arr[mid]){
            return binarySearch(arr,mid + 1, high, key);
        }else{
            return binarySearch(arr,low,mid - 1, key);
        }

    }

    public static void main(String[] args) {
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
        int low = 0,high = lenArray - 1, mid = (low + (high- low)/2 ) ;

        boolean isPresentInArray = binarySearch(arr,low,high,key);
        System.out.println("Is element preset in Array : " + isPresentInArray);
    }
}
