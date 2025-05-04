>[!NOTE]
> 전체 내용 정리한 것이 아닌, 필요하고 리마인드하고 싶은 내용 위주로 정리했습니다.

---

# 📘 예제: BankAccount
## 1. 객체 만들기
### 객체 지향
- **객체**: 속성들과 동작들의 묶음
- **변수**: 속성
- **메소드(함수)**: 동작
- 예시
  - 사람 객체: 속성(이름, 나이, 보유현금, 소유계좌)
  - 은행 계좌 객체: 속성(잔액, 소유인), 동작(입금, 출금, 이체)

### 클래스
- 객체들에 대한 설계도/설명서

### 메소드

### 인스턴스
- **인스턴스**: 클래스(설계도)를 따르는 '객체'

---
## 2. 객체 설계하기
### 접근제어자
> 권한 제어
- `private`: 해당 변수/메소드는 해당 클래스 내에서만 접근 가능
- 변수를 private으로 하고 **`setter`와 `getter` 메소드**를 이용해 변수를 바꿔주거나 받아올 수 있음

### 메소드 오버로딩 (Method Overloading)
- 클래스 내에 같은 이름의 메소드를 2개 이상 정의할 수 있게 해주는 기능. 
- 단 파라미터의 구성이 다름.
    ```java
    public class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    
        int add(int a, int b, int c) {
            return a + b + c;
        }
    
        double add(double a, double b) {
            return a + b;
        }
    }
    ```
- 대표적인 예시: `System.out.println`
    ```java
    System.out.println(5);        // 정수 파라미터
    System.out.println(3.14);     // 소수 파라미터
    System.out.println("hello");  // 문자열 파라미터
    System.out.println(true);     // 불린 파라미터
    ```
> [!TIP]
> "계좌이체" 예제
> - 나는 4개의 메소드의 내용을 각각 다 정의를 해주었다.
> - 하지만 해설처럼 하나의 메소드를 정의한 후, **오버로딩된 다른 메소드에서 이미 정의한 메소드를 호출**함으로써 간단하게 해결할 수 있다는 것을 알게 되었다.

### 생성자

### this