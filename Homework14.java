package homework;

class MyTools {
        public void arr(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println( );
            }
        }
        public Person copyPerson(Person p) {
            Person p2 = new Person();
            p2.name = p.name;
            p2.age = p.age;
            return p2;
        }
}

class Person {
    String name;
    int age;
}

public class Homework14 {
        public static void main(String[] args) {
            int[][] arr1 = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
            MyTools printarr = new MyTools();
            printarr.arr(arr1);
            Person p = new Person(); //创建了独立的对象p
            p.age = 19;
            p.name = "Tom";
            MyTools tools = new MyTools();
            Person p2 = tools.copyPerson(p); //对象p克隆p2.但是空间独立
            System.out.println("p的属性:" + "age=" + p.age + " name=" +p.name);
            System.out.println("p2的属性:" + "age=" + p2.age + " name=" +p2.name);
            p.name = "Jerry";
            p2.age = 20;
            System.out.println("p的属性:" + "age=" + p.age + " name=" +p.name);
            System.out.println("p2的属性:" + "age=" + p2.age + " name=" +p2.name);
        }
}
