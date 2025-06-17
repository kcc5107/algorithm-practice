package Programmers.lv3;

import java.util.HashSet;

// 두 개 뽑아서 더하기
public class Main9 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> sums = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }

        answer = sums.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }
}
