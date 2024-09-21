package homework;

import java.util.Scanner;

class AA {
    public boolean or(int a) {
//        boolean b = false;
//        if (a % 2 == 0) {
//            b = true;
//        }
//        return b;
        return a % 2 != 0;
    }
}

class BB {
    public void arr(int row, int col, char c) {
        int[][] arrList = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("=======判断奇数=======");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个你心目中的数字：");
        int n1 = myScanner.nextInt();
        AA aa = new AA();
        System.out.println(aa.or(n1));
        System.out.println("========打印字符========");
        System.out.println("你想要打印的行数：");
        int col = myScanner.nextInt();
        System.out.println("你想要打印的列数：");
        int row = myScanner.nextInt();
        System.out.println("你想要打印的字符：");
        char c = myScanner.next().charAt(0);
        BB reArr = new BB();
        reArr.arr(row,col,c);
    }
}
