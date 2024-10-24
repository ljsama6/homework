package homework;

class A03 {
    public int[] copyArr(int oldArr[]) {
        int newArr[] = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}

public class Homework20 {
    public static void main(String[] args) {
        int oldArr[] = {1,2,3,4,5};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("=====复制的数组=====");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
