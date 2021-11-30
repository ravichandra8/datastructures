public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = new int[7];
        ar[0] = 20;
        ar[1] = 35;
        ar[2] = -15;
        ar[3] = 7;
        ar[4] = 55;
        ar[5] = 1;
        ar[6] = -22;

        int newElement;
        int position = -1;

        for (int i = 1; i < ar.length; i++) {
            newElement = ar[i];

            for (int j = (i - 1); j >= 0; j--) {
                if (newElement < ar[j]) {
                    position = j;
                    ar[j + 1] = ar[j];

                }

            }
            if (position > -1) {
                ar[position] = newElement;
                position = -1;
            }
        }

        for (int j : ar) {
            System.out.println(j);
        }
    }
}
