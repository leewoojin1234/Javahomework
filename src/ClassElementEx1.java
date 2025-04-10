class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * width + 2 * height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
public class ClassElementEx1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("넓이: "+rectangle.area());
        System.out.println("둘레 길이: "+rectangle.perimeter());
        System.out.println("정사각형 여부: "+rectangle.isSquare());
    }
}
