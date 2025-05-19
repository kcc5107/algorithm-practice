package Programmers.lv2;

import java.util.Scanner;

// 직사각형 별찍기
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //짧지만 속도 매우 느림
        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }

        //성능 최적화(효율적)
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < a; i++) {
//            sb.append('*');
//        }
//
//        for (int i = 0; i < b; i++) {
//            System.out.println(sb.toString());
//        }
    }
}
