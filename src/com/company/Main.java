package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter year to chak:");
        int year=scanner.nextInt();
        if(year %4==0)
            System.out.println("thus is a leep year\n29 days in feb");
        else
            System.out.println("regular year 28 days");
    }
}
