package Programmers.lv1;

// 핸드폰 번호 가리기
public class Main17 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        sb.append(phone_number);
        int i = sb.length() - 4;
        sb.replace(0, i, "*".repeat(i));

        answer = sb.toString();
        return answer;
    }
}
