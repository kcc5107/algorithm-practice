package Programmers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

// 제일 작은 수 제거하기
public class Main19 {
    public int[] solution(int[] arr) {
        OptionalInt first = Arrays.stream(arr).sorted().findFirst();

        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        arrList.remove((Integer) first.getAsInt());

        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();

        if (answer.length == 0) {
            return new int[] {-1};
        }

        return answer;

//        if (arr.length <= 1) return new int[]{ -1 };
//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
