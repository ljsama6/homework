package homework;

class A01 {
    public double max(double[] arr) {
        double maxNum = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            } else {
                maxNum = arr[i + 1];
            }
        }
        return maxNum;
    }
}

public class Homework17 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println("该数组的最大值为：" + a01.max(arr));
    }
}
