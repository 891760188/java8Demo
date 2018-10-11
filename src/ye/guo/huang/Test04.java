package ye.guo.huang;

@FunctionalInterface
interface Message<T> {// 普通方法引用
    public T creat(String s, double d);
}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:" + this.title + "价格:" + this.price+"元";
    }
}

public class Test04 {// 引用构造方法
    public static void main(String[] args) {
        Message<Book> msg = Book::new;
        Book book = msg.creat("《Java从入门到放弃》", 99.9);
        System.out.println(book);
    }
}
