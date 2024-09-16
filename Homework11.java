package homework;

public class Homework11 {
    public static void main(String[] args){
        int sum = 0; //总和
        int avaNum = 0; //平均值
        int max = 0; //最大值
        int maxIndex = 0; //最大值的下标
        int findNum = 8; //查找数组中是否有8
        int index = -1; //如果找到就把下标记录到index里
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("数组情况:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            //查询是否有8,并将下标记录到index下
            if (findNum == arr[i]){
                index = i;
            }
        }
        System.out.println();
        //平均值
        avaNum = sum / arr.length;
        System.out.println("数组的平均值:" + avaNum);
        //最大值及其下标
        System.out.println("最大值:" + max);
        System.out.println("最大值的下标:" + maxIndex);
        //查找是否有8
        if (index != -1){
            System.out.println("找到数:" + findNum + "下标:" + index);
        } else {
            System.out.println("没找到数:" + findNum);
        }
    }
}
