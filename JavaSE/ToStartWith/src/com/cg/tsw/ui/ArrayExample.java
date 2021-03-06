package com.cg.tsw.ui;

import java.util.Scanner;

class ArrayExample {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter no. of cells : ");
        int n = scan.nextInt();
        
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	System.out.println("Enter value : ");
        	arr[i] = scan.nextInt();
        }
        
        int big = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
//        for(int i = 0; i < n; i++) {
//        	if (arr[i] > big) {
//        		big = arr[i];
//        	}
//        	if (arr[i] < small) {
//        		small = arr[i];
//        	}
//        }
        
        for(int val : arr) {
        	if (val > big) {
        		big = val;
        	}
        	if (val < small) {
        		small = val;
        	}
        }
        
        System.out.println("Big : " + big);
        System.out.println("Small : " + small);
        
        scan.close();
    }
}