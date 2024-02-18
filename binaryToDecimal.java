import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);{
            int num = sc.nextInt();
            int sum=0,pow=1;
            while(num>0){
                int digit = num % 10;
                sum += (digit*pow); 
                num /= 10;
                pow*=2;

            }
            System.out.println(sum);
        }
        sc.close();
    }
    
}
