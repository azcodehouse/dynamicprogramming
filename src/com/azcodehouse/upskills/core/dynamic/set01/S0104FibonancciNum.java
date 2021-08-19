package com.azcodehouse.upskills.core.dynamic.set01;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * @author : azcodehouse
 * @date : 11/06/21 10:55
 * -Program for Fibonacci numbers
 */
public class S0104FibonancciNum {
    public static void main(String[] args){
        System.out.println("Program for Fibonacci numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :" );
        Integer num = scanner.nextInt();
        Long start = System.currentTimeMillis();
        Instant beg = Instant.now();
        Integer fibNum = fibonacci(num);
        Long end = System.currentTimeMillis();
        Instant fin = Instant.now();
        Long timeElapsed = end - start;
        Long te = Duration.between(beg, fin).toMillis();
        System.out.println("Fibonacci Number : " + fibNum + " : Time Taken : " + timeElapsed + " Duration : " + te);

        Instant st = Instant.now();
        fibNum = fibonacciDyna(num);
        Instant en = Instant.now();
        Long timeTaken = Duration.between(st, en).toMillis();
        System.out.println("Fibonacci Number : " + fibNum + " : Time Taken : " + timeTaken);


    }

    public static Integer fibonacci(Integer num){
        if (num == 0 || num == 1) return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static Integer fibonacciDyna(Integer num){
        Integer fib[] = new Integer[num+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= num; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[num];
    }

}
