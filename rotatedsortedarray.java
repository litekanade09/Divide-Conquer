import java.util.Scanner;
public class rotatedsortedarray {
    public static int seacrh(int arr[],int tar,int si,int ei){
        //base case
        if(si >= ei){
            return -1;
        }

        //kaaam
        int mid =si + (ei - si)/2;

        //casefound
        if(arr[mid] == tar){
            return mid;
        }
        //mid on l1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar<= arr[mid]){
                return seacrh(arr,tar,si,mid);
            }
            //case b: right
            else{
                //case b:right
                return seacrh(arr,tar,mid +1,ei);
            }
        }
        //mid on l2
        else{
            //case a : right
            if(arr[mid] <=  tar && tar<= arr[ei]){
                return seacrh(arr,tar,mid +1, ei);
            }
            //case b : left
            else{
               return seacrh(arr,tar,si,mid -1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.print(seacrh(arr,tar,0,arr.length -1));
    }
}
