import java.util.Scanner;

class sumNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int remainder,sum=0;
        while(num>0){

            // sum+= num%10;
            // num=num/10;

            remainder = num % 10;
            sum = sum + remainder;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}

