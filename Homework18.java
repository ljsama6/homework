package homework;

import java.util.Scanner;

class A02 {
    public float find(String[] arr, String toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (toFind.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}

public class Homework18 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您想要查找的字符串:");
        String toFind = myScanner.next();
        A02 a02 = new A02();
        String[] arr = {"aaa", "bbb", "ccc", "ddd"};
        int index = (int) a02.find(arr, toFind);
        if (index != -1) {
            System.out.println("找到了元素,在第" + index + "个下标");
        } else {
            System.out.println("未找到您想查找的元素");
        }
    }
}
