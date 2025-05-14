package Programmers.lv2;

// 수박수박수
public class Main1 {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb = i % 2 == 0 ? sb.append("박") : sb.append("수");
//            sb.append(i % 2 == 0 ? "박" : "수");
        }

        answer = sb.toString();
        return answer;
    }
}
