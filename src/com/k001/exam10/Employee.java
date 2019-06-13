package com.k001.exam10;

import java.util.Scanner;

public class Employee extends Human{
    protected int salary;
    protected String position;

    protected void getInfo(){
        Scanner input = new Scanner(System.in);
        getHuman();
        System.out.print("Nhap luong: ");
        this.salary = input.nextInt();
        input.nextLine();
        System.out.print("Nhap chuc vu: ");
        this.position = input.nextLine();
    }


}
