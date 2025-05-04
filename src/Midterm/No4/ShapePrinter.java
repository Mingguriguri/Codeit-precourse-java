package Midterm.No4;

public class ShapePrinter {
    public void printPyramid(int height) {
        for (int i = 0; i < height ; i++){
            // 공백
            for (int j = 1; j < height - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = height - i; k <= height + i; k++) { // (int k = 1; j <= 2 * i - 1; k++)로 해도 됨
                System.out.print("*");
            }
            System.out.println();
        }
    }
}