import java.util.Scanner;

public class DecimalToAnotherBase {
    public static int getValueInBase(int n,int b)
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
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int b=readme.nextInt();
        int dn=getValueInBase(n,b);
        System.out.println(dn);

    }
}
