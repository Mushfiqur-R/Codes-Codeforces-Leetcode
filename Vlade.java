import java.util.*;
public class Vlade
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int  t=input.nextInt();
        input.nextLine();
        for(int i=0;i<t;i++)
        {
            String take_input=input.nextLine();
        int countA=0;
        int countB=0;
        for(int j=0;j<take_input.length();j++)
        {
            if(take_input.charAt(j)=='A')
            {
                countA++;
            }
            else if(take_input.charAt(j)=='B')
            {
                countB++;
            }
        }
        if(countA>countB)
        {
            System.out.println('A');
        }
        else{
            System.out.println('B');
        }

    }
}
}