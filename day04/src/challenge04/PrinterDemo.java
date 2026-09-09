package challenge04;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer3 p = new Printer3(20, true); // 용지 20장, 양면 출력 설정
        
        p.print(25);
        
        p.setDuplex(false); // 단면 출력으로 설정 변경
        p.print(10);
    }
}