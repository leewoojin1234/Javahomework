class Book1 {
    private String title;
    private String author;
    private int pages;

    public Book1(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public Book1() {
        this("","",0);
    }
    public Book1(String title, String author) {
        this(title,author,0);
    }

    public void displayInfo() {
        System.out.println("제목: "+ this.title + ", 저자: "+this.author + ", 페이지: "+this.pages);
    }
}

public class ClassElementEx3 {
    public static void main(String[] args) {
        Book1[] books = new Book1[]{
                new Book1(),
                new Book1("Hello Java", "Seo"),
                new Book1("JPA 프로그래밍", "KIM", 700)
        };

        for (Book1 book : books) {
            book.displayInfo();
        }
    }
}
