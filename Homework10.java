package homework;

public class Homework10 {
    public static void main(String[] args) {
        int[] arr1 = {10, 12, 45, 90};
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        int addNum = 23;
        arr2[arr2.length - 1] = addNum;
        arr1 = arr2;
        for (int i = 0; i < arr1.length - 1; i++){
            for (int j = 0; j < arr1.length - i - 1; j++){
                if (arr1[j] > arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
