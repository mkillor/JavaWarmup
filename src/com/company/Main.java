package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 25;
        double gpa = 1.0;
        boolean isFoggy = true;
        System.out.println(age + "|"+ gpa + "|" + isFoggy);
        String city = "Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());
        //comment
        /*comment*/
        float pi = 3.1415926781f;
        System.out.println(pi);

        int primes[] = {5,7,11,17,19};

        for(int i=0;i<5;i++){
            System.out.println(primes[i]);
        }

        int twoDarray[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(twoDarray[1][1]);
        System.out.println(twoDarray[2][2]);

        int sum = 3+2;
        System.out.println(sum);
        double quotient= 10.0/4.0;
        System.out.println(quotient);

        int i=5;
        System.out.println(++i);
        System.out.println(i);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("hello, " + name);

        
    }
}
