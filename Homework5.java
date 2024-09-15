package homework;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args){
        System.out.println("=====出票系统=====");
        //输入月份
        System.out.println("请输入月份:");
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();
        //输入年龄
        System.out.println("请输入您的年龄:");
        int age = myScanner.nextInt();
        //判断为旺季
        if (month >= 4 && month <= 10){
            if (age > 18 && age < 60){
                System.out.println("当月为旺季,成人票为60元");
            } else if (age < 18) {
                System.out.println("当月为旺季,儿童票为30元（半价）");
            } else {
                System.out.println("当月为旺季,老人票为20元");
            }
        //判断为淡季
        } else {
            if (age > 18 && age < 60) {
                System.out.println("当月为淡季,成人票为40元");
            } else {
                System.out.println("当月为淡季,其他票为20元");
            }
        }
    }
}
