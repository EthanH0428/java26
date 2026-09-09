package challenge04;

public class PrinterTest {
    public static void main(String[] args) {
        // 1. Printer 객체를 생성한다.
        Printer p = new Printer();
        
        // 2. 프린터에 용지 100장을 추가한다.
        p.numOfPapers += 100;
        
        // 3. 프린터로 70장을 출력한다.
        p.print(70);
        
        // 4. 프린터에 남아 있는 용지를 조사한다.
        System.out.println("남아있는 용지: " + p.numOfPapers + "장");
    }
}