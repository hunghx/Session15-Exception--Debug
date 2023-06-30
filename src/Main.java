import ra.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Xử lí lỗi , ngoại lệ
        // try ... catch ... finally
//        int [] arr = {1,2,3,4};
//        System.out.println("Nhập vào 1 số");
//        int c = new Scanner(System.in).nextInt();
//        try{
//            // kiểm thử 1 đoạn code có thể phát sinh ngoại lệ
//            int a = 5/c;
//            System.out.println("giá trị phần tử có index = "+c +" là "+ arr[c]);
//        }catch(ArithmeticException e){ // tên của ngoại lệ muốn xử lí
//            // khối code xử lí ngoại lệ đó
//            System.out.println(e.getMessage());
//        }catch (ArrayIndexOutOfBoundsException a){
//            System.err.println("Chỉ số không phù hợp");
//        } finally {
//            // dù có lỗi hay ko có lỗi thì finally luôn được thực thi
//            System.out.println("kết thúc quá trình xử lí lỗi");
//        }


        // gọi phương thức

        // xử lí ngoại lệ
//        while (true){
//            try {
//                getInt();
//                break;
//            }catch (IllegalArgumentException e){
//                e.printStackTrace();
//            }
//        }

        int a= new Scanner(System.in).nextInt();
        // gọi và xử lí
        try {
            div(5,0);
        }catch (ArithmeticException sd){
            // xử lí
            System.err.println("Không thể chia cho 0");
        }


        // khối code sinh ra lỗi khi chạy
        String[]  arrString = new String[10];
        arrString[0] = "Đi học";
        arrString[1] = "Đi chơi";
        arrString[2] = "Đi ngủ";
        for (String str : arrString) {
            // đưa râ hướng giải quyết
            if(str!=null) {
                System.out.println(str.length());
            }
        }
    }
    // có 1 phương thức cho phép người dùng nhập vào 1 số > 0
    public static int getInt() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        int so = sc.nextInt();
        if(so<=0){
            throw new IllegalTriangleException("Khong the nhap 1 so < = 0");
        }else {
            return so;
        }

    }
    public static int div(int a,int b) throws ArithmeticException{
        return a/b;
    }
}