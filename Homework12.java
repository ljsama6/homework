package homework;

public class Homework12 {
    public static void main(String[] args){
        int[] arr = {20, -1, 89, 2, 890, 7};
        //排序前
        System.out.println("冒泡排序前的数组情况:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
        //冒牌排序
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //排序后
        System.out.println("冒泡排序后的数组情况:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
