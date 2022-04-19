package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int sides = Getinput("number of sides of polygon");
        int length = Getinput("length of a side");
        double aop= (sides * (length * length ))/ (4 * Math.tan(Math.PI / sides));
        System.out.println("Area of polygon is " + aop);

    }
    public static int Getinput(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }
}
