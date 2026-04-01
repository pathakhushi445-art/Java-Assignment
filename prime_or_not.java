package assignment_question;
import java.util.Scanner;
public class prime_or_not {
    static void main() {
        int n, count=0;
        System.out.println("Enter any number");
        Scanner sc=new Scanner (System.in);

        n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if(count ==2)
            System.out.println("Prime number");
        else System.out.println("Not");
    }
}


