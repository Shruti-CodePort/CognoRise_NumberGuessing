import java.util.*;
class NumberGuessing 
{
    private static final int MAX_ATTEMPTS = 5; // Maximum number of attempts
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int randomNumber=rand.nextInt(10)+1; // Generate a random number between 1 and 10
        int attempts=0;
        boolean guessedCorrectly=false;

        System.out.println("=================== Number Guessing Game ===================");
        while(attempts<MAX_ATTEMPTS) 
        {
            System.out.print("Guess the number between 1 and 10: ");
            int guess=sc.nextInt();
            attempts++;
            if(guess==randomNumber)
            {
                System.out.println("Congratulations! You guessed the number correctly.");
                guessedCorrectly=true;
                break;
            } 
            else if(guess<randomNumber) 
            {
                System.out.println("Your guess is too low.");
            } 
            else 
            {
                System.out.println("Your guess is too high.");
            }
        }
        if(!guessedCorrectly) 
        {
            System.out.println("You have used all your attempts. The number was "+randomNumber);
        } 
        else
        {
            System.out.println("You guessed the number in "+attempts+" attempts.");
        }
    }
}