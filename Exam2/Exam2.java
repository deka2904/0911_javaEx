package Exam2;

public class Exam2 {
    public static void main(String[] args) {
        // 높이를 입력해주세요 : 3
        // 출력
        int num = 3;
        for (int i = 1; i <= num; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 높이를 입력해주세요 : 5
        // 출력
        num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 높이를 입력해주세요 : 7
        // 출력
        num = 7;
        for (int i = 1; i <= num; i++) {
            for (int j = 7 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}