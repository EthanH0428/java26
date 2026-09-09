package challenge04;

public class PrinterTest2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2(10); // 용지 10장으로 초기화
        
        p.print(2);
        p.print(20);
        p.print(10);
    }
}