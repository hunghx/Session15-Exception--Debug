package ra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = getInt(sc);
        System.out.println("Nhap so b");
        int b = getInt(sc);
        System.out.println("Tong cua 2 so ban vua nhap la : "+(a+b));
    }

    public static int getInt(Scanner sc) {
        int so;
        // nhập 1 số nguyên hợp lệ
        while (true) {
            try {
                so = Integer.parseInt(sc.nextLine());
                return so;
            } catch (NumberFormatException im) {
                System.err.println("Xin vui lòng nhập 1 số");
            }
        }
    }
}
