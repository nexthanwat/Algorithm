package Money;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        while (true) {
            System.out.print("Enter amount of money: ");
            amount = scanner.nextInt();
            if (amount > 100 && amount % 100 == 0) {
                break;
            } else {
                System.out.println("Please enter amount of money more than 100 Baht (ห้ามกรอกจำนวนเงินที่ได้เศษ 0-99 บาท)");
            }
        }
        int thousandBills = amount / 1000;
        amount %= 1000;
        int fiveHundredBills = amount / 500;
        amount %= 500;
        int hundredBills = amount / 100;
        amount %= 100;
        System.out.println(amount + " Baht can be separated into");
        System.out.println("1000-Baht " + thousandBills + " bills");
        System.out.println("500-Baht " + fiveHundredBills + " bills");
        System.out.println("100-Baht " + hundredBills + " bills");
    }
}