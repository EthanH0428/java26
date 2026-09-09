package Programming;

public class Dice {
    private int face = 6; // 6개의 면

    public int roll() {
        // Math.random()은 0.0 이상 1.0 미만의 실수를 반환
        return (int) (Math.random() * face) + 1;
    }
}