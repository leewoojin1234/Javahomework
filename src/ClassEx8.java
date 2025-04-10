class MemberInit1 {
    private String name;
    private int age;
    private int grade;

    public MemberInit1(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberInit1(int age) {
        this("", age, 0);
    }
    MemberInit1() {
        this("", 0, 0);
    }

    public void print() {
        System.out.println("Name: " + name+", Age: " + age+", Grade: " + grade);
    }
}

public class ClassEx8 {
    public static void main(String[] args) {
        MemberInit1[] members = new MemberInit1[]  {
                new MemberInit1("이우진", 18, 2),
                new MemberInit1("최장우", 18, 2),
                new MemberInit1(500),
                new MemberInit1()
        };

        for (MemberInit1 member : members) {
            member.print();
        }
    }
}
