## 5. 플로이드의 삼각형
이번 과제에서도 파라미터로 정수형 `height`를 받고, 높이가 height인 '직각 이등변 삼각형'을 출력할텐데요. 이번에는 * 대신 숫자가 순서대로 출력되는 [플로이드의 삼각형](https://ko.wikipedia.org/wiki/%ED%94%8C%EB%A1%9C%EC%9D%B4%EB%93%9C%EC%9D%98_%EC%82%BC%EA%B0%81%ED%98%95)입니다!

- `Main.java`: 테스트용 파일
- `ShapePrinter.java`: 작성해야 할 파일

### 패딩 (Padding)
`height`가 5인 경우 가장 큰 값인 15는 두 자리 수입니다. 그러면 한 자리 수 값들을 출력할 때 앞에 띄어쓰기(" ")를 한 칸씩 해줘야 합니다.

이렇게 나오면 안 되고:
```shell
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```
이렇게 나와야 합니다:
```shell
 1 
 2  3 
 4  5  6 
 7  8  9 10 
11 12 13 14 15
```

마찬가지로 `height`가 `15`인 경우 가장 큰 값인 `120`은 세 자리 수입니다. 따라서 한 자리 수 값들 앞에는 띄어쓰기 두 칸을 해줘야 하고, 두 자리 수 값들 앞에는 띄어쓰기 한 칸을 해줘야 합니다.

이렇게 나오면 안 되고:
```shell
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
37 38 39 40 41 42 43 44 45 
46 47 48 49 50 51 52 53 54 55 
56 57 58 59 60 61 62 63 64 65 66 
67 68 69 70 71 72 73 74 75 76 77 78 
79 80 81 82 83 84 85 86 87 88 89 90 91 
92 93 94 95 96 97 98 99 100 101 102 103 104 105 
106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 
```
이렇게 나와야 합니다:
```shell
  1 
  2   3 
  4   5   6 
  7   8   9  10 
 11  12  13  14  15 
 16  17  18  19  20  21 
 22  23  24  25  26  27  28 
 29  30  31  32  33  34  35  36 
 37  38  39  40  41  42  43  44  45 
 46  47  48  49  50  51  52  53  54  55 
 56  57  58  59  60  61  62  63  64  65  66 
 67  68  69  70  71  72  73  74  75  76  77  78 
 79  80  81  82  83  84  85  86  87  88  89  90  91 
 92  93  94  95  96  97  98  99 100 101 102 103 104 105 
106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 
```

### 힌트
앞에 패딩을 넣는 게 이 과제의 가장 어려운 부분일 수 있습니다. 패딩을 넣기 위해서 먼저 알아야할 것은 가장 큰 값입니다. 가장 큰 값은 `1`부터 `height`까지의 합인데, 이를 구하기 위해서는 이 공식을 따르면 됩니다: `height * (height + 1) / 2`

예를 들어서 `height`가 `5`인 경우에 `5 * (1 + 5) / 2`는 `15`가 나오죠?

결과값을 문자열로 변환시키고, `length` 속성을 보면 최대값의 길이를 알 수 있습니다.
```shell
1 
2 3 
4 5 6 
----------
 1 
 2  3 
 4  5  6 
 7  8  9 10 
11 12 13 14 15 
----------
  1 
  2   3 
  4   5   6 
  7   8   9  10 
 11  12  13  14  15 
 16  17  18  19  20  21 
 22  23  24  25  26  27  28 
 29  30  31  32  33  34  35  36 
 37  38  39  40  41  42  43  44  45 
 46  47  48  49  50  51  52  53  54  55 
 56  57  58  59  60  61  62  63  64  65  66 
 67  68  69  70  71  72  73  74  75  76  77  78 
 79  80  81  82  83  84  85  86  87  88  89  90  91 
 92  93  94  95  96  97  98  99 100 101 102 103 104 105 
106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 
```
