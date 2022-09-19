public class homework3 {
    public static void main(String[] args) {
        int count = 1, j = 0, i = 0;
        for (i = 2; i <= 20000; i++) {
            int k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == k + 1) {
                count++;
                System.out.println(i + " ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println(count);
    }
}
