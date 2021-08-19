package com.azcodehouse.upskills.core.dynamic.set01;

import java.util.Scanner;

/**
 * Largest Sum Contiguous Subarray
 * @author r0s0anr
 */

public class S0101LargestSumContiguousArray {
    public static void main(String[] args){
        System.out.println("https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array");
        Integer num = scanner.nextInt();
        System.out.println("Enter the Elements of the Array");
        Integer arr[] = new Integer[num];
        for (int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }
        Integer largestContiguousSum = largestContiguousSum(arr);
        System.out.println("Largest Contiguous Sum in the Array :"  + largestContiguousSum);
    }

    public static Integer largestContiguousSum(Integer arr[]){
        Integer localMaxSum = 0;
        Integer globalMaxSum = 0;
        for (int i = 0; i < arr.length; i++){
            localMaxSum += arr[i];
            if (localMaxSum < 0){
                localMaxSum = 0;
            }else if(localMaxSum > globalMaxSum){
                globalMaxSum = localMaxSum;
            }
        }
        return globalMaxSum;
    }
}
