// any base multiplication.....
import java.util.Scanner;
public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int b=readme.nextInt();
        int n1=readme.nextInt();
        int n2=readme.nextInt();
        int d=getProduct(b,n1,n2);
        System.out.println(d);
    }
    // any base product with all digit of n2..
    public static int getProduct(int b,int n1,int n2)
    {
        int rv=0,p=1;
        while(n2>0)
        {
            int d2=n2%10;
            n2=n2/10;
            int sprd=getProductWithASingleDigit(b,n1,d2);
            rv=getSum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }
    // any base product with one digit
    public static int getProductWithASingleDigit(int b,int n1,int d2)
    {
        int rev=0,c=0,p=1;
        while(n1>0||c>0)
        {
            int d1=n1%10;
            n1=n1/10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            rev=rev+d*p;
            p=p*10;
        }
        return rev;
    }
    // any base addition
    public static int getSum(int b,int n1,int n2)
    {
        int c=0,rev=0,p=1;
        while(n1>0||n2>0||c>0)
        {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rev=rev+d*p;
            p=p*10;
        }
        return rev;
    }
}
