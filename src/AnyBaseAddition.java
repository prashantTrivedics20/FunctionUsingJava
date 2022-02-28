// any base addition b=base and n1,n2 is number of base b
import java.util.Scanner;
public class AnyBaseAddition {
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
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int b=readme.nextInt();
        int n1=readme.nextInt();
        int n2=readme.nextInt();
        int d=getSum(b,n1,n2);
        System.out.println(d);
    }
}
