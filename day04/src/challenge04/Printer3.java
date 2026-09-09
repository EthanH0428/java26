package challenge04;

public class Printer3 {
    private int numOfPapers;
    private boolean duplex; // 양면 출력 여부

    public Printer3(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        // 양면 출력일 경우 실제 필요한 용지 수 계산 
        int requiredPages = (this.duplex) ? (amount / 2) + (amount % 2) : amount;
        String printMode = this.duplex ? "양면으로" : "단면으로";

        if (this.numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        } else if (this.numOfPapers < requiredPages) {
            int shortage = requiredPages - this.numOfPapers;
            System.out.println(printMode + " 모두 출력하려면 용지가 " + shortage + "매 부족합니다. " + this.numOfPapers + "장만 출력합니다.");
            this.numOfPapers = 0;
        } else {
            this.numOfPapers -= requiredPages;
            System.out.println(printMode + " " + requiredPages + "장 출력했습니다. 현재 " + this.numOfPapers + "장 남아 있습니다.");
        }
    }

    // 접근자 (Getter)
    public boolean getDuplex() {
        return duplex;
    }

    // 설정자 (Setter)
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}