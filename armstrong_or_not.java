package assignment_question;
import java.util.Scanner;
public class armstrong_or_not {
    static void main() {
        int n, rem, arm=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;

        }
        if (c==arm)
            System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}


