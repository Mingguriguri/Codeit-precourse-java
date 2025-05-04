package Midterm.scanner;

import java.util.Scanner;

/*
* Scanner를 이용하여 입력받기
* */
public class InputAge {
    public static void main(String[] args) {
        System.out.println("당신의 나이는?");
        Scanner scanner = new Scanner(System.in); // 입력받기
        int age = scanner.nextInt(); // 스캐너를 통해 입력받은 값을 age 변수에 저장
        System.out.println("나이는 " + age + "살");

        System.out.println("당신의 이름은?");
        String name = scanner.next(); // 문자열 값을 받아올 때는 next(). 입력받는 자료형에 맞춰주면 됨
        System.out.println("이름은 " + name);

    }
}
