package homework;

public class Homework9 {
    public static void main(String[] args){
        //采用直接找下标，将数值插入数组当中
        int[] arr = {10, 12, 48, 90};
        int insertNum = 23;
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (insertNum < arr[i]){
                index = i;
                break;
            }
        }
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++){
            if (i != index){
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
