package challenge04;

public class Printer2 {
    private int numOfPapers;

    public Printer2(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    public void print(int amount) {
        if (this.numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        } else if (this.numOfPapers < amount) {
            int shortage = amount - this.numOfPapers;
            System.out.println("모두 출력하려면 용지가 " + shortage + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
            this.numOfPapers = 0; // 남은 용지를 모두 사용했으므로 0으로 설정
        } else {
            this.numOfPapers -= amount;
            System.out.println(amount + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");
        }
    }
}