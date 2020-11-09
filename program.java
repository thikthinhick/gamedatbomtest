package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void insertion(int n , int [] arr) {
        int number = arr[n - 1];
        int i;
        for( i = n - 2; i >= 0 ; i--) {
            if(arr[i] > number) {
                arr[i + 1] = arr[i];
                for(int j = 0; j < n; j++) {
                    System.out.println(arr[j] + " ");
                }
            }
            else
                break;
        }
        S
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertion(n, arr);
    }
}
