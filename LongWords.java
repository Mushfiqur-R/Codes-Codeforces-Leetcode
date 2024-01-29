import java.util.Scanner;
public class LongWords
{
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        while(n-->0)
        {
            String word=input.next();
            int count=word.length();
            if(count>10)
            {
                   System.out.println(word.charAt(0)+Integer.toString(count-2)+word.charAt(count-1));
                }
            else{
                System.out.println(word);
            }
         
        }
        input.close();
    }
    }
