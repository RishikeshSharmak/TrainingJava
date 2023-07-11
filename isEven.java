import java.util.Scanner;

public class isEven
{
    static int Cal(int n){
        if(n%2==0 && n>0){
            return 2;
        }
        else {
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=Cal(n);
        System.out.println(s);

    }

}
