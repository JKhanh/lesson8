package com.k001.exam10;

import java.util.Scanner;

public class Human {
    protected String name;
    protected String address;

    protected void getHuman(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = input.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = input.nextLine();
    }
}
