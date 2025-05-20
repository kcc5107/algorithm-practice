package Programmers.lv2;

// 최대공약수와 최소공배수
public class Main9 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = greatestCommonDivisor(n, m);
        answer[1] = leastCommonMultiple(n, m);

        return answer;
    }

    private int greatestCommonDivisor(int n, int m) {
        int greater = Math.max(n, m);
        int smaller = Math.min(n, m);
        int gcd = 0;

        if (greater % smaller == 0) {
            return smaller;
        }

        for (int i = 1; i <= greater / 3; i++) {
            if (greater % i == 0 && smaller % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    private int leastCommonMultiple(int n, int m) {
        int greater = Math.max(n, m);
        int smaller = Math.min(n, m);
        int lcm = 0;

        if (greater % smaller == 0) {
            return greater;
        }

        int gcd = greatestCommonDivisor(greater, smaller);
        lcm = gcd * (greater / gcd) * (smaller / gcd);

        return lcm;
    }
}
