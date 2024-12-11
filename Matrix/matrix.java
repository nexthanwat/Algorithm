package Matrix;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3]; // สร้าง Matrix ขนาด 3x3
        for (int i = 0; i < 3; i++) { // รับค่า Matrix ขนาด 3x3
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Matrix index of [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nNormal Matrix is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[3][3]; // สร้าง Matrix
        for (int i = 0; i < 3; i++) { // คำนวณ Transpose ของ Matrix
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("\nMatrix Transpose is"); // แสดงผล Matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}