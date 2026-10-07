public class TrappingRainWater {

    static int getWater(int arr[], int n) {

        int lmax[] = new int[n];
        int rmax[] = new int[n];

        // Left Max
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        // Right Max
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        int res = 0;

        // Water Calculation
        for (int i = 0; i < n; i++) {
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = {3, 0, 1, 2, 5};

        System.out.println(getWater(arr, arr.length));
    }
}