package sequence;

public class sequence {
    public static void main(String[] args) {
        int sum1 = 0;
        int i = 10;
        System.out.print("Sequence 8.1: ");
        while (i >= 1) {
            System.out.print(i + " ");
            sum1 += i;
            i--;
        }
        System.out.println("\nSum = " + sum1);
        int sum2 = 0;
        i = 1;
        System.out.print("Sequence 8.2: ");
        while (i <= 19) {
            System.out.print(i + " ");
            sum2 += i;
            i += 2;
        }
        System.out.println("\nSum = " + sum2);
        int sum3 = 0;
        i = 1;
        System.out.print("Sequence 8.3: ");
        while (i <= 19) {
            System.out.print(i + " ");
            sum3 += i;
            i = -i + (i > 0 ? -2 : 2);
        }
        System.out.println("\nSum = " + sum3);
    }
}