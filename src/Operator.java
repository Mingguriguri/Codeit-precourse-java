public class Operator {
    public static void main(String[] args){
        // 1. 문자열 연산
        // 문자열 합치기.
        System.out.println("=== 문자열 연산 ===");
        String myString = "Hello" + "Codeit";
        System.out.println(myString);

        // 문자와 숫자를 합치면 숫자가 자동으로 문자로 변환됨
        System.out.println("I am " + 27 + " years old.");
        System.out.println("The result is " + false + ".");

        // 이스케이프 문자
        System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\"라고 말했다.");

        // 숫자 연산자 (다른 거는 알기 때문에 단항연산자만)
        System.out.println("=== 숫자 연산 ===");
        int a = 3;

        System.out.println(-a);  // 양, 음 부호가 바뀜
        System.out.println(++a); // a에 1을 추가
        System.out.println(--a); // a에 1을 감소


        // 비교 연산자 (알고 있기 때문에 넘어감)

        // 불린 연산자
        // AND
        System.out.println("=== 불린 연산 ===");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // NOT
        System.out.println(!true);
        System.out.println(!false);



    }
}
