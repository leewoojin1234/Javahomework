package Number51_75;

public class Student0 {
    String name;
    int age;
    int grade;

    //생성자
    public Student0(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //메서드
    public void introduce() {
        System.out.printf("저는 %d살 성적은 %d점인 %s입니다\n", age, grade, name);
    }
}
