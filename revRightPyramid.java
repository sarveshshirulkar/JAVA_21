import java.util.Scanner;

public class revRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        
        int r = sc.nextInt();

        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=(r+1-i);j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        for(int i=r;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    }  
}
