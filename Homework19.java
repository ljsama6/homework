package homework;

class Book {
    String name;
    double bookPrice;
    public Book(String name, double bookPrice) {
       this.name = name;
       this.bookPrice = bookPrice;
    }
    public void updatePrice() {
        if (this.bookPrice > 150) {
            this.bookPrice = 150;
        } else if (this.bookPrice > 100) {
            this.bookPrice = 100;
        }
    }
    //显示书籍情况
    public void info() {
        System.out.println("书名 = " + this.name + "  价格 = " + this.bookPrice + "元");
    }
}

public class Homework19 {
    public static void main(String[] args) {
        Book book = new Book("朝花夕拾", 120.5);
        book.info();
        book.updatePrice(); //更新价格
        book.info();
    }
}
