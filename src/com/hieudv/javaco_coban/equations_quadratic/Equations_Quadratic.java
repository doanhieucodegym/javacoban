package com.hieudv.javaco_coban.equations_quadratic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Equations_Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("giai phuong trinh bac 2");
        System.out.println("Nhap cac phan tu");
        System.out.println("nhap phan tu a");
        double a =sc.nextDouble();
        System.out.println("nhap phan tu b");
        double b =sc.nextDouble();
        System.out.println("nhap phan tu c");
        double c =sc.nextDouble();
        if(a == 0){
            System.out.println("a =0 Giai phuong trinh bac 1");
            double x = -c/b;
            System.out.println(" Nghiem X =" +x );
        }
        if(a != 0){
            System.out.println("Giải phương trình");
            double deta = b*b -4*a*c;
            if(deta >0){
                System.out.println("Phương trình có 2 nghiệm ");
                double x1 = (-b + Math.sqrt(deta))/2*a;
                double x2 = (-b - Math.sqrt(deta))/ 2*a;
                System.out.println("Nghiệm X1 ="+x1);
                System.out.println("nghiệm X2 =" + x2);
                if(deta<0){
                    System.out.println("phuong trinh vo nghiem");
                }
                if(deta ==0){
                    System.out.println("phương trình có 1 nghiệm kép");
                    double x = -b/2*a;
                    System.out.println("Nghiệm X =" +x);
                }
            }
        }
    }
}
