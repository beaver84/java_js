package java_basic.construct.ex;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this.title = "";
        this.author = "";
        this.page = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

    //    //TODO 코드를 완성하세요
//    Book() {
//        System.out.println("제목: , 저자: , 페이지: 0");
//    }
//
//    Book(String title, String author) {
//        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: 0");
//    }
//
//    Book(String title, String author, int page) {
//        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
//    }
}
