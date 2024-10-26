import java.util.Scanner;
public class sortString {
    public static String[] sort(String[] arr,int lo, int hi){
        //basecase
        if(lo == hi){
            String[] A = {
                    arr[lo]
            };
            return A;
        }
        int mid = lo + (hi - lo)/2;
        String[] arr1 =  sort(arr,lo,mid);
        String[] arr2 =  sort(arr,mid + 1,hi);
        String[] arr3 = merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];
        int idx= 0;
        int i = 0;
        int j = 0;

        while(i < m && j< n){
            if(AlphabaticallySmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while(i < m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while( j < n){
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    public static boolean AlphabaticallySmaller(String str1,String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"sun", "earth","mercury","mars"};
        String[] a = sort(arr,0, arr.length -1);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
