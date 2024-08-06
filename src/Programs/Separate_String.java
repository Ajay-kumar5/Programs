package Programs;

public class Separate_String
{
    public static void main(String[] args) {

        String x = "ABC123@!$";

        StringBuilder alphabets =  new StringBuilder();
        StringBuilder numbers =  new StringBuilder();
        StringBuilder charaters =  new StringBuilder();

        for(char c : x.toCharArray())
        {
            if(Character.isLetter(c))
            {
                alphabets.append(c);
            }
            else if(Character.isDigit(c))
            {
                numbers.append(c);
            }
            else
            {
                charaters.append(c);
            }



        }
        System.out.println(alphabets.toString());
        System.out.println(numbers.toString());
        System.out.println(charaters.toString());

    }
}
