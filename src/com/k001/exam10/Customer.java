package com.k001.exam10;

import java.util.Scanner;

public class Customer extends Human {
    protected String carType;

    protected void getCar(){
        Scanner input = new Scanner(System.in);
        getHuman();
        this.carType = input.nextLine();
    }


}
