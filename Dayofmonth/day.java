package Dayofmonth;

import java.util.Scanner;

public class day {
    public static void checkInput(int day, int month, int year) {
        // ตรวจสอบปี
        if (year < 2500 || year > 2565) {
            System.out.println("Wrong value(s)");
            return;
        }

        // ตรวจสอบเดือน
        if (month < 1 || month > 12) {
            System.out.println("Wrong value(s)");
            return;
        }

        // ตรวจสอบวันที่
        int maxDays = 31; // กำหนดวันสูงสุดเริ่มต้นที่ 31
        if (month == 2) {
            maxDays = 28; // กุมภาพันธ์จะมี 28 วัน
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30; // เดือนที่มี 30 วัน
        }

        if (day < 1 || day > maxDays) {
            System.out.println("Wrong value(s)");
        } else {
            System.out.println("Correct!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        while (true) {
            System.out.print("Enter day: ");
            day = scanner.nextInt();
            System.out.print("Enter month: ");
            month = scanner.nextInt();
            System.out.print("Enter year: ");
            year = scanner.nextInt();

            checkInput(day, month, year);
            if (year >= 2500 && year <= 2565 && month >= 1 && month <= 12) {
                int maxDays = 31;
                if (month == 2) {
                    maxDays = 28;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    maxDays = 30;
                }
                if (day >= 1 && day <= maxDays) {
                    break;
                }
            }
            scanner.close();
        }
    }
}