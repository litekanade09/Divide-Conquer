public class inversion {



    public static int countInversions(int[] arr, int si, int ei) {
            int count = 0;
            if (ei > si) {
                int mid = si + (ei - si) / 2;
                count = countInversions(arr, si, mid);
                count += countInversions(arr, mid + 1, ei);
                count += mergeAndCount(arr, si, mid + 1, ei);
            }
            return count;
        }
        public static int mergeAndCount(int arr[], int si, int mid, int ei) {
            int i = si;
            int j = mid;
            int k = 0;
            int count = 0;
            int temp[] = new int[ei - si + 1];

            while (i < mid && j <= ei) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                    count += (mid - i); // Number of elements remaining in the left subarray
                }
            }

            while (i < mid) {
                temp[k++] = arr[i++];
            }

            while (j <= ei) {
                temp[k++] = arr[j++];
            }

            for (i = si, k = 0; k < temp.length; i++, k++) {
                arr[i] = temp[k];
            }

            return count;
        }

        public static void main(String[] args) {
            int arr[] = {2, 4, 1, 3, 5};
            System.out.print("Number of inversions: " + countInversions(arr, 0, arr.length - 1));
        }
    
}
