package Number51_75;

public class Class0 {
    public static void main(String[] args) {
        String[] name = new String[]{"학생1", "학생2"};
        int[] age = new int[]{15,16};
        int[] grade = new int[]{90, 80};
        for (int i = 0; i < age.length; i++) {
            System.out.println("이름: "+name[i]+" 나이: "+ age[i]+" 성적: "+grade[i]);
        }
    }
}
