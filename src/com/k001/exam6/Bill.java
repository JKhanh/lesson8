package com.k001.exam6;

import java.util.Scanner;

public class Bill {
    protected int billID = 100;
    protected String date;
    private String customerName;
    private int roomID;
    protected int price;

    protected void getBill() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        this.date = input.nextLine();
        System.out.print("Nhap ten khach hang: ");
        this.customerName = input.nextLine();
        System.out.print("Nhap so phong: ");
        this.roomID = input.nextInt();
        System.out.print("Nhap don gia ($): ");
        this.price = input.nextInt();
    }

    protected void printBill() {
        System.out.println("So hoa don: " + billID);
        System.out.println("Ngay tao hoa don: " + date);
        System.out.println("Ten khach hang: " + customerName);
        System.out.println("So phong: " + roomID);
    }

    static int chooseType(Scanner input) {
        System.out.println("1.Hoa don gio.\n2.Hoa don ngay.");
        int choose = input.nextInt();
        while (choose < 1 || choose > 2) {
            System.out.println("Loi du lieu!!!\n Xin nhap lai.");
            choose = input.nextInt();
        }
        return choose;
    }

    public static void main(String[] args) {
        System.out.println("1.Nhap hoa don.\n2.Xuat hoa don.\n3.Tong so luong hoa don.\n4.Tinh TB thanh tien hoa don thue phong thang 9/2013\n5.Thoat");
        System.out.print("Chon yeu cau: ");
        Scanner input = new Scanner(System.in);
        HourBill[] HB = new HourBill[100];
        DayBill[] DB = new DayBill[100];
        int countHour = 0, countDay = 0, countBill = 0;
        int choose;
        do {
            choose = input.nextInt();
            while (choose < 1 || choose > 6) {
                System.out.println("Loi du lieu!\nXin nhap lai.");
                choose = input.nextInt();
            }
            switch (choose) {
                case 1:
                    if (chooseType(input) == 1) {
                        HourBill tmp = new HourBill();
                        countBill++;
                        tmp.billID += countBill;
                        tmp.getInfo();
                        HB[countHour++] = tmp;
                    } else {
                        DayBill tmp = new DayBill();
                        countBill++;
                        tmp.billID += countBill;
                        tmp.getInfo();
                        DB[countDay++] = tmp;
                    }
                    break;
                case 2:
                    if (chooseType(input) == 1) {
                        for (int i = 0; i < countHour; i++) {
                            HB[i].print();
                        }
                    } else {
                        for (int i = 0; i < countDay; i++) {
                            DB[i].print();
                        }
                    }
                    break;
                case 3:
                    if (chooseType(input) == 1) System.out.println("Tong so hoa don gio la: " + countHour);
                    else System.out.println("Tong so hoa don ngay la: " + countDay);
                    break;
                case 4:
                    double sum = 0, count = 0;
                    for (int i = 0; i < countDay; i++) {
                        String year = DB[i].date.substring(6);
                        String day = DB[i].date.substring(4, 5);
                        int cmp = year.compareTo("2013") + day.compareTo("9");
                        if (cmp == 0) {
                            sum += DB[i].cost();
                            count++;
                        }
                    }
                    for (int i = 0; i < countHour; i++) {
                        String year = HB[i].date.substring(6);
                        String day = HB[i].date.substring(4, 5);
                        int cmp = year.compareTo("2013") + day.compareTo("9");
                        if (cmp == 0) {
                            sum += HB[i].cost();
                            count++;
                        }
                    }
                    System.out.println("Tong thanh tien TB la: " + sum / count);
                    break;
                case 5:
                    break;
            }
            System.out.println("1.Nhap hoa don.\n2.Xuat hoa don.\n3.Tong so luong hoa don.\n4.Tinh TB thanh tien hoa don thue phong thang 9/2013\n5.Thoat");
            System.out.print("Chon yeu cau: ");
        }
        while (choose < 5);
    }
}
