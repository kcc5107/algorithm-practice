package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 서울에서 김서방 찾기
public class Main14 {
    public String solution(String[] seoul) {
        String answer = "";
//        List<String> list = Arrays.stream(seoul).toList();
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        int kimIndex = list.indexOf("Kim");
        answer = "김서방은 " + kimIndex + "에 있다";
        return answer;
    }
}
