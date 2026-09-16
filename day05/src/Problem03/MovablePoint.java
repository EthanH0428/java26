package Problem03; 

public class MovablePoint extends Point {
    private int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getXSpeed() { return xSpeed; }
    public void setXSpeed(int xSpeed) { this.xSpeed = xSpeed; }
    public int getYSpeed() { return ySpeed; }
    public void setYSpeed(int ySpeed) { this.ySpeed = ySpeed; }
    @Override
    public String toString() {
        return super.toString() + ", 이동 속도: (" + xSpeed + ", " + ySpeed + ")";
    }
}