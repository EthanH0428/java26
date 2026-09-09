package Programming;

public class Triangle {
    private double base;
    private double height;

    // 생성자
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 넓이 구하기 메서드
    public double findArea() {
        return base * height / 2.0;
    }

    // 넓이가 동일한지 비교하는 메서드 
    public boolean isSameArea(Triangle t) {
        return this.findArea() == t.findArea();
    }

    // 접근자 (Getter)
    public double getBase() { return base; }
    public double getHeight() { return height; }
}