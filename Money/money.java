package Money;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;

        // รับจำนวนเงินจากผู้ใช้
        while (true) {
            System.out.print("Enter amount of money: ");
            amount = scanner.nextInt();

            // ตรวจสอบว่าเงินต้องมากกว่า 100 บาท และไม่เป็นเศษ 1-99 บาท
            if (amount > 100 && amount % 100 == 0) {
                break;  // ออกจากลูปหากจำนวนเงินถูกต้อง
            } else {
                System.out.println("Please enter amount of money more than 100 Baht (ห้ามกรอกจำนวนเงินที่ได้เศษ 0-99 บาท)");
            }
        }

        // คำนวณจำนวนธนบัตรที่ต้องการ
        int thousandBills = amount / 1000;
        amount %= 1000;  // หักจำนวนที่เป็น 1000 บาท

        int fiveHundredBills = amount / 500;
        amount %= 500;  // หักจำนวนที่เป็น 500 บาท

        int hundredBills = amount / 100;
        amount %= 100;  // หักจำนวนที่เป็น 100 บาท

        // แสดงผลลัพธ์
        System.out.println(amount + " Baht can be separated into");
        System.out.println("1000-Baht " + thousandBills + " bills");
        System.out.println("500-Baht " + fiveHundredBills + " bills");
        System.out.println("100-Baht " + hundredBills + " bills");
    }
}