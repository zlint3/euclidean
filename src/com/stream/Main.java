package com.stream;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int a = scanner.nextInt();
        System.out.print("enter the mod: ");
        int b = scanner.nextInt();
        int x = b;
        int q = 0;
        int r = 1;
        int t1 = 0;
        int t2 = 1;
        int t = 0;
        while (r != 0){
            q = b / a;
            r = b - (a * q);
            t = t1 - (q*t2);
            b = a;
            a = r;
            t1 = t2;
            t2 = t;
        }
        x += t1;

        System.out.println("The answer is " + x);
    }
}
