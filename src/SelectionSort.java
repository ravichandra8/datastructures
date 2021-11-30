public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = new int[7];
        ar[0] = 20;
        ar[1] = 35;
        ar[2] = -15;
        ar[3] = 7;
        ar[4] = 55;
        ar[5] = 1;
        ar[6] = -22;

        int largerItemIndex = -1;
        for (int iter = (ar.length - 1); iter >= 0; iter--) {
            largerItemIndex = 0;
            for (int i = 1; i < iter; i++) {
                if (ar[largerItemIndex] < ar[i]) {
                    largerItemIndex = i;
                }
            }
            swap(ar, largerItemIndex, iter);
        }
        for (int j : ar) {
            System.out.println(j);
        }

    }

    private static void swap(int ar[], int i, int j) {
        int temp;
        temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
