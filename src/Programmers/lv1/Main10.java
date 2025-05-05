package Programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;

// 정수 내림차순으로 배치하기
public class Main10 {
    public long solution(long n) {
//        long answer = 0;
//        String s = String.valueOf(n);
//        String[] strArr = s.split("");
//        int[] arr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int num : arr) {
//            sb.append(num);
//        }
//
//        answer = Long.parseLong(sb.toString());
//        return answer;
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return Long.parseLong(sb.toString());
    }
}
