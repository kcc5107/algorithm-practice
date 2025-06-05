package Programmers.lv3;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 마음대로 정렬하기
public class Main7 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, Comparator.comparing((String str) -> str.charAt(n)).thenComparing(str -> str));

        return strings;

//        int l = strings.length;
//        for(int i=0;i<l;i+=1){
//            strings[i] = strings[i].substring(n,n+1)+strings[i];
//        }
//        Arrays.sort(strings);
//        for(int i=0;i<l;i+=1){
//            strings[i] = strings[i].substring(1);
//        }
//        return strings;
    }
}
