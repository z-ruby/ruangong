import java.util.Scanner;

public class homework2 {
    public static int findMaxArray(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentSum < 0) {
                currentSum = array[i];
            } else {
                currentSum += array[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        // number表示数组的长度
        int[] array = new int[number];
        // 对数组元素循环赋值
        for (int i = 0; i < number; i++) {
            array[i] = (int) sc.nextInt();
        }
        System.out.println(findMaxArray(array));
    }
}
