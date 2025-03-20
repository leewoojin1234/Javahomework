package Number26_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문자열을 입력하세요: ");
        String s = br.readLine();
        System.out.println("입력한 문자열: " + s);

        System.out.println("정수를 입력하세요: ");
        int intValue = Integer.parseInt(br.readLine());
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요");
        double doubleValue = Double.parseDouble(br.readLine());
        System.out.println("입력한 실수: " + doubleValue);
    }
}
