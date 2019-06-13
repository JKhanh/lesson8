package com.k001.exam6;

import java.util.Scanner;

public class DayBill extends Bill {
    private int day;

    void getInfo(){
        Scanner input = new Scanner(System.in);
        getBill();
        System.out.print("Nhap so ngay thue: ");
        this.day = input.nextInt();
    }

    protected double cost(){
        if(this.day<7) return this.day*this.price;
        return 7*this.price + (this.day-7)*this.price*0.8;
    }

    protected void print(){
        printBill();
        System.out.println("Thanh tien: " + cost());
    }
}
