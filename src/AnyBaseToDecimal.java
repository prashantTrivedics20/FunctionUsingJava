import java.util.Scanner;

public class AnyBaseToDecimal {
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
        int base=readme.nextInt();
        int dn=getValueInBase(n,base);
        System.out.println(dn);

    }
}
