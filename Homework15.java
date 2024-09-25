package homework;

class T {
    //思路
    //1.findWay方法是专门来找迷宫的路径
    //2.如果找到，就返回true，否则返回false
    //3.map就是二维数组，即表示迷宫
    //4.i，j就是老鼠的位置，初始化位置为(1,1)
    //5.因为我们是递归的找路，所以我先规定map数组的各个值的含义
    //0表示可以走，1表示障碍物，2表示可以走，3表示走过，但是走不通的死路
    //6.当map[6][5] = 2 就说明找到出口，否则就得继续找
    //7.确定老鼠找路的策略，下-右-上-左
    public boolean findWay (int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //假定可以走通（暴力拆解）
                map[i][j] = 2;
                //找路
                //往下,往右，往上，往左
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)){
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}

public class Homework15 {
    public static void main(String[] args) {
        //制定迷宫
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        T find = new T();
        find.findWay(map, 1, 1);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
