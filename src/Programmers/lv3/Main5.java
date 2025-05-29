package Programmers.lv3;

// 시저 암호
public class Main5 {
    public String solution(String s, int n) {
        String answer = "";
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : charArray) {
            if (ch == ' ') {
                sb.append(" ");
                continue;
            }

            char c = (char) (ch + n);

            if (Character.toUpperCase(ch) == ch) {
                if (c > 90) {
                    c = (char) (c - 26);
                }
            } else {
                if (c > 122) {
                    c = (char) (c - 26);
                }
            }
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String str = " A b E";
        System.out.println(str.toCharArray());
    }
}
