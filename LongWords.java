import java.util.*;
public class LongWords
{
    public static void main(String[] args) {
        System.out.println("Enter the word:");
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        int count=word.length();
        
            if(word.length()>10)
            {
                char first=word.charAt(0);
                char last=word.charAt(word.length()-1);
               
                   System.out.print(first+Integer.toString(count-2)+last);
                
                
            }
            else{
                System.out.println(word);
            }
            input.close();
        }
    }
