package Programmers.lv3;

// 푸드 파이터 대회
public class Main11 {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int i1 = food[i] / 2;
            String repeat = String.valueOf(i).repeat(i1);
            sb.append(repeat);
        }
        answer = sb.toString().concat("0").concat(sb.reverse().toString());

        return answer;
    }
}
