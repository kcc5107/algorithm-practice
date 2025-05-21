package Programmers.lv2;

// 3진법 뒤집기
public class Main10 {
    public static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

//        answer = Integer.parseInt(sb.toString(), 3);

//        for (int i = sb.length(); i > 0; i--) {
//            answer += Integer.parseInt(String.valueOf(sb.charAt(i - 1))) * (int) Math.pow(3, sb.length() - i);
//        }

        for (int i = sb.length(); i > 0; i--) {
            answer += (sb.charAt(i - 1) - '0') * (int) Math.pow(3, sb.length() - i);
        }


        return answer;
    }
}
