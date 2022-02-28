import java.util.Scanner;

// any base to any base....
public class AnyBaseTOAnyBase {
    // any base to any base
    public static int getValue(int n,int b1,int b2)
    {
        int dec=getValueInBase(n,b1);
        int dn=getValueInBase1(dec,b2);
        return dn;
    }
    //decimal to any base
    public static int getValueInBase1(int n,int b)
    {int p=1,rv=0;
        while(n>0)
        {
            int dig=n%b;
            n=n/b;
            rv=rv+dig*p;
            p=p*10;

        }
        return rv;
    }

    // any base to decimal
    public static int getValueInBase(int n,int base)
    {
        int rev=0,p=1;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            rev=rev+rem*p;
            p=p*base;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int b1=readme.nextInt();
        int b2=readme.nextInt();
        int d=getValue(n,b1,b2);
        System.out.println(d);

    }
}
