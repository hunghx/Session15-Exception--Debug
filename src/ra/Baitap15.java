package ra;

import java.util.Scanner;

public class Baitap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            input3SideTriangle(sc);
            System.out.println("3 cạnh vừa nhập là 3 cạnh của 1 tam giác");
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
    public static void input3SideTriangle(Scanner sc){
        double a,b,c;
        System.out.println("Nhập cạnh a");
        a = sc.nextDouble();
        System.out.println("Nhập cạnh b");
        b= sc.nextDouble();
        System.out.println("Nhập cạnh c");
        c = sc.nextDouble();

        if(a<=0||b<=0||c<=0){
            throw  new IllegalTriangleException("Các cạnh nhập vào không thỏa mãn vì có cạnh <= 0");
        }
        if(a+b<=c || a+c <=b||b+c <=a){
            throw  new IllegalTriangleException("Các cạnh nhập vào không thỏa mãn vì 2 cạnh không lớn hơn cạnh còn lại");
        }

    }
}
