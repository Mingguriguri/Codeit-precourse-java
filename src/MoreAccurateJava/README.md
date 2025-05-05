`# JAVA, 더 정확하게
>[!NOTE]
> 전체 내용 정리한 것이 아닌, 필요하고 리마인드하고 싶은 내용 위주로 정리했습니다.

---
## 01. 기본형 vs 참조형
> **기본형(Primitive Type)**
- int, boolean, char, double 등
- 변수가 값 자체를 보관하고 있음

> **참조형(Reference Type)**
- Person, String, int[] 등 클래스 기반 자료형 (객체, 배열)
- 변수가 값 자체를 보관하는 것이 아닌, 값을 "가리킴" 메모리의 주소를 참조함

- **퀴즈**
    ```java
    int[] a = new int[2];
    System.out.println(a[0]);
    ```
  이 경우, a[0]의 출력값은 null이 아닌 0이다. int의 기본형은 0이기 때문
    ```java
    Person[] people = new Person[2];
    System.out.println(people[0]);
    ```
  하지만 이처럼 "참조형"인 경우에는 null이 출력됨

## 02. Null
> null: 비어있음

- null은 참조형 변수만 가질 수 있음
- null을 보관하고 이는 변수의 메소드를 호출하려고 하면 `NullPointerException` 오류 발생
    ```java
    Person p1 = null;
    p1.getName();
    // 결과
    // Exception in thread "main" java.lang.NullPointerException
    ```
  - 이를 해결하기 위해서는 `if (p != null)`과 같은 방식으로 null인지 아닌지 먼저 확인해준 후 처리하면 된다.

- **퀴즈2**
    ```java
    String s = null;
    if (s != null || !s.isEmpty()) {
        System.out.println("Answer A");
    } else {
        System.out.println("Answer B");
    }
    ```
    여기서 `s`가 `null`이기 때문에 `!s.isEmpty()`에서 `NullPointerException`이 발생함
    - 참고로 `str.isEmpty()`는 빈 문자열(`""`)도 포함임

## 03. 숏서킷 연산 (Short-Circuit Evaluation)
- 자바는 효율성을 위해서 `m1()`이 `false`를 리턴하면 `m2()`와 `m3()`를 실행하지 않음. 
- 이렇게 **식의 결과값이 이미 결정된 경우 미리 멈추는 것**을 '**숏서킷 연산(Short-circuit evaluation)** 이라 함

- 예시
  - And (`&&`)
    ```java
    boolean newBoolean = m1() && m2() && m3();
    ```
  - Or (`||`)
    ```java
    boolean newBoolean = m1() || m2() || m3();
    ````
    
## 04. 변수 안전하게 만들기: `final`
> **final: 상수**
> - 한 번 정의하고 다시 바꿀 수 없음

- 기본형: `π(pi)`처럼 바꾸지 않는, 바꾸지 말아야 할 값이 있으면 `final`을 쓰면 됨
- 참조형
  ```java
  public static void main(String[] args) {
    final Person p1 = new Person("김신의");
    p1.setName("문종모");
    System.out.println(p1.getName());
    // 결과: 문종모
  }
  ```
  - 이렇게 할 경우, `final`은 `p1`에 해당하는 것고, `p1`의 인스턴스 변수에 해당하는 것이 아니기 때문에 문종모가 출력됨
  - 이름도 못 바꾸게 하려면, `Person` 클래스 내 인스턴스에 `name`을 `final`로 정의해야 함
  ```java
  public class Person {
      private final String name;
    ...
  }
  ```
  
- 예시: 배열의 `length` 변수
  - `final` 변수임
  - 처음에 배열의 크기가 주어질 때 값이 정해지고 그 후에 값을 바꿀 수가 없음
  - 새로운 값을 지정해주려고 하면 오류남