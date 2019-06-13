package com.k001.exam10;

import java.util.Scanner;

public class Student extends Human {
    protected int grade1, grade2;

    protected void getGrade(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        this.grade1 = input.nextInt();
        System.out.print("Nhap diem 2: ");
        this.grade2 = input.nextInt();
    }

    protected void changeGrade1(int grade1){
        this.grade1 = grade1;
    }

    protected void changeGrade1(int grade2){
        this.grade2 = grade2;
    }
}
