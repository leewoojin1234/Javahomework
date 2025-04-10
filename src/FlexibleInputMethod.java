public class FlexibleInputMethod {
    public static void main(String[] args) {
        printStringData("이우진", "삼디", "18세");
    }

    public static void printStringData(String...values) {
        System.out.println("Input String data length " + values.length);
        for (String value : values) {
            System.out.print(value+", ");
        }
    }
}
