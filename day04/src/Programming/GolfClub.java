package Programming;

public class GolfClub {
    private int number;
    private String name;

    // 7번 아이언
    public GolfClub() {
        this.number = 7;
        this.name = "아이언";
    }

    // 번호를 받는 생성자
    public GolfClub(int number) {
        this.number = number;
        this.name = "아이언";
    }

    // 이름을 받는 생성자 
    public GolfClub(String name) {
        this.number = 0; // 번호가 없음을 의미하는 임의의 값 설정
        this.name = name;
    }

    public void print() {
        if (this.number > 0) {
            System.out.println(number + "번 " + name + "입니다.");
        } else {
            System.out.println(name + "입니다.");
        }
    }
}