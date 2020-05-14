package com.hieudv.javaco_coban.show20LeapYears;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        int year;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam");
        year = scanner.nextInt();
        while (count < 20) {
            if(isLeapYears(year)){
                System.out.println("nam" + year + " la nam nhuan");
                count++;
            }
            year++;
        }

    }
    public static boolean isLeapYears(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
