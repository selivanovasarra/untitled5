package com.company;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 != 0)
            System.out.println("odd value");
        else
            System.out.println("even value");
    }
}
