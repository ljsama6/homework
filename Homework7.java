package homework;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args){
        //判断数字范围
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num1 = myScanner.nextInt();
        if (num1 < 0){
            System.out.println("小于0");
        } else if (num1 == 0) {
            System.out.println("等于0");
        } else {
            System.out.println("大于0");
        }

        //判断是否闰年
        System.out.println("请输入您心中想要的年份");
        int years = myScanner.nextInt();
        if (years % 4 == 0){
            System.out.println(years + "年是闰年");
        } else {
            System.out.println(years + "年不是闰年");
        }

        //判断是否是水仙花数
        System.out.println("请输入一个三位数的数字:");
        int num2 = myScanner.nextInt();
        int num3 = num2 / 100;
        int num4 = num2 % 100 / 10;
        int num5 = num2 % 10;
        if (num3 * num3 * num3 + num4 * num4 * num4 + num5 * num5 * num5 == num2){
            System.out.println(num2 + "是水仙花数");
        } else {
            System.out.println(num2 + "该数字不是水仙花数");
        }
    }
}
