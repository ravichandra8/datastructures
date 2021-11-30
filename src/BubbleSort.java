public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = new int[7];
        ar[0] = 20;
        ar[1] = 35;
        ar[2] = -15;
        ar[3] = 7;
        ar[4] = 55;
        ar[5] = 1;
        ar[6] = -22;

        for (int iter = ar.length - 1; iter >= 0; iter--) {
            for (int i = 0; i < iter; i++) {
                swap(ar, i, i + 1);
            }
        }

        for (int i : ar) {
            System.out.println(i);
        }

    }

    private static void swap(int[] ar, int i, int j) {
        if (ar[i] == ar[j]) {
            return;
        }
        if (ar[j] < ar[i]) {
            int temp;
            temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
}
