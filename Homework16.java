package homework;

import java.util.Scanner;

class Tower {
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            move(num - 1, a, b, c);
            System.out.println(a + "->" + c);
            move(num - 1, b, a, c);
            System.out.println(b + "->" + c);
        }
    }
}

public class Homework16 {
    public static void main(String[] args) {
        Tower hano = new Tower();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入初始的盘数:");
        int num = myScanner.nextInt();
        hano.move(num,'A', 'B', 'C');
    }
}
