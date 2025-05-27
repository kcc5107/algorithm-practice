package Programmers.lv3;

// 크기가 작은 부분문자열
public class Main3 {
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= pNumber) {
                answer++;
            }

        }
        return answer;
    }
}
