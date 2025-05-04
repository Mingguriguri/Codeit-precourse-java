package Midterm.scanner;

import java.util.Scanner;

/*
* 코드잇 소개 프로그램
* */
public class Introduction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // inMainMenu를 true로 설정한 후 E(exit)를 눌렀을 때 false로 재설정.
        boolean inMainMenu = true;

        while (inMainMenu) {
            // Main Menu
            System.out.println("(I)ntro (C)ourses (E)xit");

            switch (scanner.next()) {
                case "I":
                case "i":
                    System.out.println("안녕하세요! 우리는 코드잇입니다.\n" +
                            "함께 공부합시다!");
                    break;
                case "C":
                case "c":
                    System.out.println("코드잇 수업을 소개합니다.\n" +
                            "(P)ython (J)ava (i)OS (B)ack");
                    boolean inClass = true;
                    while (inClass) {
                        String codeitClass = scanner.next();
                        switch (codeitClass) {
                            case "P":
                            case "p":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                        "강사: 강영훈\n" +
                                        "추천 선수과목: 없음");
                                break;
                            case "J":
                            case "j":
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                        "강사: 김신의\n" +
                                        "추천 선수과목: Python");
                                break;
                            case "I":
                            case "i":
                                System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                        "강사: 성태호\n" +
                                        "추천 선수과목: Python, Java\"");
                                break;
                            case "B":
                            case "b":
                                inClass = false;
                                break;
                            default:
                                System.out.println("다시 입력해주세요.");
                                break;
                        }
                    }
                    break;
                case "E":
                case "e":
                    System.out.println("안녕히 가세요.");
                    inMainMenu = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        }

    }
}