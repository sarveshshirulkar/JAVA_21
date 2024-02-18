import java.util.Scanner;

class countNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int countofnum = 0;
        while(num>0){
            num = num/10;
            countofnum++;
        }
        System.out.println(countofnum);
        sc.close();
    }
    
}