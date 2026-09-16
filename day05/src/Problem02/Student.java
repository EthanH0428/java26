package Problem02; 

public class Student extends Person {
    int studentNum;
    public Student(String name, int age, int studentNum) {
        super(name, age);
        this.studentNum = studentNum;
    }
    @Override
    public String show() {
        return "학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentNum + "]";
    }
}