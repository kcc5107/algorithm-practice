package Programmers.lv3;

// 가장 가까운 같은 글자
public class Main10 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] charArray = s.toCharArray();

        for (int i = 1; i < charArray.length; i++) {
            answer[i] = -1;
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    answer[i] = i - j;
                }
            }
        }
        answer[0] = -1;

        return answer;

//        int[] result = new int[s.length()];
//
//        for(int i=0;i<s.length();i++){
//
//            String subStr = s.substring(0,i);
//            if(subStr.indexOf(s.charAt(i))==-1) {
//                result[i] = -1;
//            }else {
//                result[i] = i-subStr.lastIndexOf(s.charAt(i));
//            }
//        }
//        return result;
    }
}
