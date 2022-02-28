import java.util.Scanner;
// digit frequency...

// by using function
public class DigitFrequency {
    public static int getDigitFrequency(int n,int d)
    { int r,c=0;
        while(n>0)
        {
            r=n%10;
            if(r==d)
            {
                c++;
            }
            n=n/10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int d=readme.nextInt();
        int f=getDigitFrequency(n,d);
        System.out.println(f);
    }
}
