package com.k001.exam6;

import java.util.Scanner;

public class HourBill extends Bill {
    private int time;

    void getInfo(){
        Scanner input = new Scanner(System.in);
        getBill();
        System.out.print("Nhap so gio thue: ");
        this.time = input.nextInt();
    }

    private Boolean checkBill(){
        if(time<24) return true;
        else if(time<=30){
            time=24;
            return true;
        }
        else return false;
    }

    protected int cost(){
        return time*price;
    }

    protected void print(){
        printBill();
        System.out.println("Thanh tien: " + cost());
    }
}
