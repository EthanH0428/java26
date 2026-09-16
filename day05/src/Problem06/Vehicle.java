package Problem06; 

public class Vehicle {
    String color;
    int speed;
    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    public void show() {
        System.out.println("색상: " + color + ", 속도: " + speed);
    }
}