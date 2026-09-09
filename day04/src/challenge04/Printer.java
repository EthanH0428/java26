package challenge04;

public class Printer {
    int numOfPapers = 0; // 남은 용지 매수

    public void print(int amount) {
        // 출력할 때마다 남은 용지 매수에서 출력할 양을 뺌
        this.numOfPapers -= amount;
    }
}