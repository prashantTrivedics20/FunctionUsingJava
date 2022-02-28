import java.util.Scanner;
// find the  npr...( by using function...
public class Funcrion1 {
    public static void dispaly(int n,int r)
    {
        System.out.println(n/r);
    }
    public static int factorial(int nfact)
    {   int rev=1;
        for (int i = 1; i <=nfact; i++) {
           rev=rev*i;
       }
        return rev;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int r=readme.nextInt();
       int n1=factorial( n);
       int n2=factorial(n-r);
       int npr=n1/n2;
       dispaly(n1,n2);
    }
}
