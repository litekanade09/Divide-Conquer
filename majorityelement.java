import java.util.Scanner;
public class majorityelement {
    public static int magority(int arr[]){
        int numbers = arr.length/2;

        for(int i = 0;i< arr.length ;i++){
            int count = 0;
            for(int j = 0 ;j<arr.length;j++){
                if(arr[i] == arr[j]){
                   count += 1;
                }
            }
            if(count > numbers){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.print(magority(arr));
    }
}
