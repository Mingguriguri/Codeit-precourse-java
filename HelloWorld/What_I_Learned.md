>[!NOTE] **참고**
> 전체 내용 정리한 것이 아닌, 필요하고 리마인드하고 싶은 내용 위주로 정리했습니다.

## 2. Hello, Java!
### 02. 자바와 가상머신
- 자바의 특징: "한 번만 작성하면, 어디서든 동작한다. (Write Once, Run Anywhere.)"
  > 어디서든 동작하게 하기 위해서는 "호환성" 문제가 해결되어야 함.

- **JVM(Javva Virtual Machine)**: 자바 기반 호환성 문제 해결. 어느 운영체제이든, 어느 디바이스이든, 동일하게 동작
- **JRE (Java Runtime Environment)**: JVM을 사용해서 마음껏 개발할 수 있는 환경
- **JDK (Java Development Kit)**: 내 컴퓨터에 이런 환경을 만들기 위해 설치해야 하는 키트

## 3. 변수와 연산
### 03. 자료형
- `int`: 기본 정수형
- `long`: 범위가 넓은 정수형
  - `L`을 뒤에 붙여줘야 함
    ```java
    long x = 12345678910L;
    ```
- `float`: 소수형
- `double`: 더 정밀한 값 보관. 소수형 기본.
- 문자열 `String`: 기본 자로형이 아닌 클래스.

## 4. 조건문과 반복문
### 05. switch
- break 문 까먹지 말기
- 기본 코드 구조
    ```java
      switch (score / 10) {
        case 10:
            grade = "A+";
            break;
        case 9:
            grade = "A";
            break;
        case 8:
            grade = "B";
            break;
        case 7:
            grade = "C";
            break;
        case 6:
            grade = "D";
            break;
        default:
            grade = "F";
            break;
    }
    ```

## 5. 배열
### 01. 배열
> **배열 생성**
1. 선언과 동시에 빈 배열 생성
    ```java
    int[] intArray = new int[5]; // 크기 5의 빈 배열
    ```
2. 선언 후, 배열 생성
    ```java
    int[] intArray;
    intArray = new int[5]; // 크기 5의 빈 배열
    ```
3. 리터럴로 생성
    ```java
    int[] intArray = {1, 2, 3, 4, 5};
    ```

> [!IMPORTANT]
> 변수를 정의할 때에만 쓸 수 있음. 아래 코드처럼 할 경우 오류 발생
```java
int[] intArray;
intArray = {1, 2, 3, 4, 5}; // 오류
```
---
> **앨리어싱 (Aliasing)**
- 배열 통째로 넘기기. 
  - 아래 두 변수는 같은 주소를 가리키기 때문에 같은 값 (`arr2`를 `arr1`의 Alias(가명)이라고 함)
    ```java
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = arr1;
    arr1[0] = 100;
    System.out.println(arr2[0]);
    // 결과: 100
    ```
- 새롭게 복사: `clone` 메소드 사용
  - 이렇게 할 경우, `arr1` != `arr2`. 서로 다른 배열임
      ```java
      int[] arr1 = {1, 2, 3, 4, 5};
      int[] arr2 = arr1.clone();
    
      arr1[0] = 100;
      System.out.println(arr1[0]);
      System.out.println(arr2[0]);
    
      // 결과
      // 100
      // 1
      ```
---
> **for-each**
```java
for (int i : intArray) {
    System.out.println(i);
}
```
```java
for (double i : intArray) {
    System.out.println(i);
}
```
- 마치 파이썬에서 리스트로 for 순회하는 것처럼 `for-each` 문도 배열의 인덱스가 아닌 배열의 '값'으로 순회함