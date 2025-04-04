class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void info() {
        System.out.println("도서명: "+title + "\t" +"작가: "+ author + "\t" +"가격: "+ price+"원");
    }
}

class MovieReview {
    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public void showMovieReview() {
        System.out.println("영화 제목: "+title+", 리뷰: "+review);
    }
}

class ProductOrder {
    private String title;
    private int price;
    private int count;

    public ProductOrder(String title, int price, int count) {
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void showProductOrder() {
        System.out.println("상품명: "+title+", 가격: "+price+", 수량: "+count);
    }
    public int getTotalPrice() {
        return price * count;
    }
}

class Student3 {
    private String  name;
    private int age;
    private String gender;

    public Student3(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public void show() {
        System.out.println("이름: "+ this.getName() +", 나이: "+ this.getAge() +", 성별: "+ this.getGender());
    }
}

public class ClassEx3 {
    public static void main(String[] args) {
//        Student3 s1 = new Student3("최해성", 18, "m");
//        Student3 s2 = new Student3("이우진", 18, "m");
//        s1.setName("최해성");
//        s1.setAge(18);
//        s1.setGender("m");
//        s2.setName("이우진");
//        s2.setAge(18);
//        s2.setGender("m");

//        Student3[] s = new Student3[2];
//        s[0] = s1;
//        s[1] = s2;
//
//        for (Student3 i : s) {
//            i.show();
//        }

//        for (int i = 0; i < s.length; i++) {
//            System.out.println("이름: "+ s[i].getName() +", 나이: "+ s[i].getAge() +", 성별: "+ s[i].getGender());
//        }

//        for (Student3 i : s) {
//            System.out.println("이름: "+ i.getName() +", 나이: "+ i.getAge() +", 성별: "+ i.getGender());
//        }


//        Book book = new Book("흰", "한강", 15000);
//        book.info();

//        MovieReview mr1 = new MovieReview("인셉션", "인생은 무한 루프");
//        MovieReview mr2 = new MovieReview("어바웃 타임", "인생 시간 영화!");
//        MovieReview[] mrs = {
//                mr1, mr2
//        };
//
//        for (MovieReview mr : mrs) {
//            mr.showMovieReview();
//        }

        ProductOrder po1 = new ProductOrder("두부", 2000, 2);
        ProductOrder po2 = new ProductOrder("김치", 5000, 1);
        ProductOrder po3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] pos = {po1, po2, po3};

        int sum = 0;

        for (ProductOrder po : pos) {
            po.showProductOrder();
            sum += po.getTotalPrice();
        }
        System.out.println("총 결제 금액: "+ sum);

    }
}
