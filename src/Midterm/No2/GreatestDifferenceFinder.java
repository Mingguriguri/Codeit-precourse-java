package Midterm.No2;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 원소 개수가 2 이하이면 0 리턴
        if (intArray.length < 2 ) {
            return 0;
        }

        // Max값과 Min값 찾기
        int maxNum = intArray[0];
        int minNum = intArray[0];
        for (int num : intArray) {
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }
        // Max와 Min 값의 차이 반
        return maxNum - minNum;
    }
}