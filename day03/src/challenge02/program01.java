package challenge02;

public class program01 {

    // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드
    static int countChar(String s, char c) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String testString = "programming makes me happy";
        char targetChar = 'm';
        
        int result = countChar(testString, targetChar);
        
        System.out.println("대상 문자열: \"" + testString + "\"");
        System.out.println("찾을 문자: '" + targetChar + "'");
        System.out.println("문자가 포함된 횟수: " + result + "번");
    }
}