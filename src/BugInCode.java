public class BugInCode {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println("The sum of numbers in the array is : " + calcSumArray(array));
    }

    public static int calcSumArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
