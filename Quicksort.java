import java.util.Scanner;
public class Quicksort {
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei){
        //lastelement
        if(si >= ei){
            return;
        }
        int pidx = partion(arr,si,ei);
        quickSort(arr,si,pidx - 1);
        quickSort(arr,pidx +1,ei);
    }
    public static int partion(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si -1;
        for(int j = si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,4,7,9,2};
        quickSort(arr,0,arr.length -1);
        printarr(arr);
    }
}
