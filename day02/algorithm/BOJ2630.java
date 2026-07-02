package algorithm;

//Brute Force Algorithm

public class BOJ2630{
    static int numWhite = 0;
    static int numBlue = 0;
    public static void main(String[] args) {
        //int[][] paper = new int[size][size];
        int[][] paper = {
                {1,1,0,0,0,0,1,1},
                {1,1,0,0,0,0,1,1},
                {0,0,0,0,1,1,0,0},
                {0,0,0,0,1,1,0,0},
                {1,0,0,0,1,1,1,1},
                {0,1,0,0,1,1,1,1},
                {0,0,1,1,1,1,1,1},
                {0,0,1,1,1,1,1,1}
            };
        countOneColorPaper(paper, 0, 0, paper.length);

        System.out.println(numWhite);
        System.out.println(numBlue);
        }
    public static void countOneColorPaper(int[][]paper, int row, int col, int size) {
        //하나의 색으로 된 색종이인지 확인, 다른 색이 있으면 4등분하여 각 조각별로 색종이 수를 센다
        if (isOneColor(paper, row, col, size)) {
            if (paper[row][col] == 0) numWhite++;
            else numBlue++;
            return;
        }
        countOneColorPaper(paper, row, col, size/2);
        countOneColorPaper(paper, row+size/2, col, size/2);
        countOneColorPaper(paper, row, col+size/2, size/2);
        countOneColorPaper(paper, row+size/2, col+size/2, size/2);
    }
    public static boolean isOneColor(int[][] paper, int row, int col, int size) {
        int color = paper[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) { 
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
} 

