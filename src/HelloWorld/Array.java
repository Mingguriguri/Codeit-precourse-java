package HelloWorld;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i*10;
        }
        for (int k: intArray) {
            System.out.println(k);
        }

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

    }
}
