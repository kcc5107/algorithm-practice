package Programmers.lv3;

// 최소 직사각형
public class Main4 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0, h = 0;

        for (int[] size : sizes) {
            for (int a : size) {
                if (Math.max(size[0], size[1]) > w) {
                    w = Math.max(size[0], size[1]);
                }

                if (Math.min(size[0], size[1]) > h) {
                    h = Math.min(size[0], size[1]);
                }
            }
        }

        answer = w * h;
        return answer;
    }
}
