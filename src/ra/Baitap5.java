package ra;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        // định dạng của chuỗi nhập vào dd/MM/yyyy
        System.out.println("Hãy nhập vào ngày tháng bất kì theo định dạng dd/MM/yyyy");
        String date = new Scanner(System.in).nextLine();
        try {
            checkDateFormat(date);
            System.out.println("Ngày "+date+ " là một ngày hợp lệ");
        }catch (IllegalTriangleException e){
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
    public static void checkDateFormat(String date){
        String[] arr = date.split("/");
        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);
        if(year<0){
                throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");
        }
        boolean isLeap = isLeapYear(year);

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // có 31 ngày
                if(day<1||day>31){
                    throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // có 30 ngày
                if(day<1||day>30){
                    throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");
                }
                break;
            case 2:
                // kiểm tra xem năm nhuận
                if(isLeap){
                    if(day<1||day>29){
                        throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");
                    }
                }else {
                    if(day<1||day>28){
                        throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");
                    }
                }
                break;
            default:
                // không phải là tháng trong năm
                throw new IllegalArgumentException("Ngày"+date+ " không hợp lệ");

        }
    }
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }
}
