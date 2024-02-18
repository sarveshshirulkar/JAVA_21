import java.util.Scanner;

public class primeNumber {
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt;
    if(num == 0 || num == 1){
        System.out.println("Not a prime Number");
    }
    for(int i=2;i<num;i++){ 
            if(num % i == 0){
                System.out.println("Prime Number");
            }
    sc.close();
    }
}
