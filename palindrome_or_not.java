package assignment_question;
import java.util.Scanner;
public class palindrome_or_not {
    static void main() {
        int n, s=0, c ,r;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a palindrome number");
        n=sc.nextInt();
        c=n;

        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
            System.out.println("Palindrome number");
        else System.out.println("not");
    }
}




