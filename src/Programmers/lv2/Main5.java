package Programmers.lv2;

// 부족한 금액 계산하기
public class Main5 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = (long) price * (count + 1) * count / 2;
        answer = totalPrice - money;

        if (answer <= 0)
                return 0;

        return answer;
    }
}
