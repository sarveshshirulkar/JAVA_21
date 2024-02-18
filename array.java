import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            // System.out.print(arr[i]);
        }
        for(int hfh : arr){
            System.out.print(hfh);

        }
    }
}
