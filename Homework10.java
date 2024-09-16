package homework;

public class Homework10 {
    public static void main(String[] args) {
        //采用建立数组，添加数值，进行冒泡排序.
        int[] arr = {10, 12, 45, 90};
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            arrNew[i] = arr[i];
        }
        int addNum = 23;
        arrNew[arrNew.length - 1] = addNum;
        arr = arrNew;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
