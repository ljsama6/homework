package homework;

public class Homework8 {
    public static void main(String[] args){
        //输入1-100之间不能被5整除的数,每五个一行
        int j = 0;
        for (int i = 1; i < 100; i++){
                if (i % 5 != 0){
                    System.out.print(i + " ");
                    j++;
                    if (j % 5 == 0){
                        System.out.println( );
                    }
                }
        }

        //输出小写的a-z以及大写的Z-A
        for(char word = 'a'; word <= 'z'; word++){
            System.out.println(word);
        }
        for(char word = 'Z'; word >= 'A'; word--){
            System.out.println(word);
        }

        //求出1-1/2+1/3-1/4...1/100的和
        double sum1 = 0;
        for (int i = 1; i <= 100; i++){
            //奇位数
            if (i % 2 != 0){
                sum1 += 1.0 / i;
            //偶位数
            } else {
              sum1 -= 1.0 / i;
            }
        }
        System.out.println(sum1);

        //求1+（1+2）+（1+2+3）+（1+2+3+4+..+100）的结果
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            for (int k = 1; k <= i; k++){
                sum2 += k;
            }
        }
        System.out.println(sum2);
    }
}
