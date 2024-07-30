import java.util.*;
public class Repeat
{
    public static void main(String[] args) {
        System.out.println ("Enter a string");
        Scanner sc=new Scanner (System.in);

        String str= sc.nextLine();

        int check=0;
        char c;

        for (int a=0; a<str.length(); a++)
        {
            check=0;
            c=str.charAt(a);
            for (int b=0; b<str.length(); b++)
            {
                if((a!=b)&&(c==str.charAt(b)))
                {
                    check++;
                    break;
                }
            }
            if (check==0)
            {
                System.out.println (c);
                break;
            }
            
        }
        if (check!=0)
        {
            System.out.println ("no repeating");
        }
    }
}