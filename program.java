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
    }
}
