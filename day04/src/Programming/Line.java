package Programming;

public class Line {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    public boolean isSameLine(Line l) {
        return this.length == l.length; // 길이 비교
    }
}