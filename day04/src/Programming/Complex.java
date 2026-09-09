package Programming;

public class Complex {
    private double real; // 실수
    private double imag; // 허수

    // 실수만 받는 생성자 
    public Complex(double real) {
        this.real = real;
        this.imag = 0.0;
    }

    // 실수와 허수 모두 받는 생성자
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void print() {
        System.out.println(real + " + " + imag + "i");
    }
}