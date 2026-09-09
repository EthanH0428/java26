package Programming;

public class Car {
    private String color;
    private static int numOfCar = 0;    // 전체 자동차 수
    private static int numOfRedCar = 0; // 빨간색 자동차 수

    public Car(String color) {
        this.color = color;
        numOfCar++; // 차가 생성될 때마다 전체 수 증가

        // 대소문자 구분 없이 "red"인지 확인
        if (color.equalsIgnoreCase("red")) {
            numOfRedCar++;
        }
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}