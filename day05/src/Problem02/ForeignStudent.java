package Problem02; 

public class ForeignStudent extends Student {
    String nationality;
    public ForeignStudent(String name, int age, int studentNum, String nationality) {
        super(name, age, studentNum);
        this.nationality = nationality;
    }
    @Override
    public String show() {
        return "외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNum + ", 국적 : " + nationality + "]";
    }
}