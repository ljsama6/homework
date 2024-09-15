package homework;

public class Homework6 {
    public static void main(String[] args){
        double money = 100000;
        int times = 0;
        while(true){
            if (money > 50000){
                //money = money - (money * 0.05);
                money *= 0.95;
                times++;
            } else if (money >= 1000 && money <=50000) {
                money -= 1000;
                times++;
            } else {
                break;
            }
        }
        System.out.println("该人携带10w可以经过" + times + "次路口");
    }
}
