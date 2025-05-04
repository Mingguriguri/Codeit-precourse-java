package Midterm.No5;

public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 가장 큰 수 구하기
        int max = height * (height + 1) / 2;
        // 숫자 자리 구하기
        int length = String.valueOf(max).length();
        // 인쇄할 수
        int num = 1;

        // 반복문 1: 행을 바꾸는 반복문
        for (int i = 1; i <= height; i++) {
            // 한 행에서 인쇄될 내용을 담는 문자열
            String line = "";

            // 반복문 2: 한 행에서 열을 바꾸는 반복문
            for (int j = 1; j <= i; j++) {
                // 반복문3: 패딩을 주는 반복문
                // 가장 큰 수의 자릿수와 현재 출력하려는 수의 자릿수의 차이만큼 주기
                for (int k = 1; k <= length - String.valueOf(num).length() ; k++) {
                    line += " ";
                }
                // 실제 인쇄될 수를 문자열에 더하고 한칸 띄워주기
                line += (num + " ");

                num++;
            }
            System.out.println(line);
        }
    }
}