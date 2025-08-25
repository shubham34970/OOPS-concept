package P1;

import java.util.Scanner;

public class Aug_Eighteen {
    public static void main(String[] args) {
        System.out.print("Enter three numbers : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b)
            if(a>c)
                System.out.printf("%d is largest",a);
            else
                System.out.printf("%d is largest",c);

        else
            if(b>c)
                System.out.printf("%d is largest",b);
            else
                System.out.printf("%d is largest",c);
    }
}
