/**
 * Plays the game of craps.
 *
 * @author Brooklyn Harris
 * @version 2/2/21
 */
import java.util.Scanner;
public class Craps
{
    public static void main (String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);
        String response = "";
        System.out.println("LET'S PLAY CRAPS!!!");
        System.out.println("Do you need rules? (y/n)");
        response = in.nextLine();
        if(response.equals("y"))
        {
            System.out.println("1. Roll two six-sided dice. 2. a. On first roll, if you get a 7 or 11 you win! 2. b. On first roll, if you get a 2, 3, or 12 you lose! 2. c. Any other number you don't win or lose. The die roll becomes your 'point.' 3. Keep rolling the dice again until: 4. a. You roll the point again and win!4. b. or you roll a 7 and lose. Good Luck!");
        }
        else
        {
            System.out.println("Good Luck!");
        }
        int scorenew = 0;
        int point = 0;
        int wins = 0;
        int loss = 0;
        for (int i = 0; i < 1000; i++)
        {
            int score = d1.roll() + d2.roll();
            System.out.print("Press <Enter> to roll...");
            String pause = in.nextLine();
            System.out.println ("\n score " + score);
            if (score == 11 || score == 7)
            {
                System.out.println ("\n Score = " + score);
                System.out.println ("You win!!$$$");
                wins = wins++;
                break;
            }
            else if (score == 2 || score == 3 || score == 12)
            {
                System.out.println ("\n Score = " + score);
                System.out.println ("Aww you lost :((");
                loss = loss++;
                break;
            }
            else
            {
                point = score;
                System.out.println("\n point = " + point);
                while (true)
                {
                    score = d1.roll() + d2.roll();
                    System.out.println("\n new roll = " + score);
                    if (score == point)
                    {

                        System.out.println("\n You win!!!$$$$");
                        wins = wins + 1;
                        break;
                    }
                    if (score == 7)
                    {
                        System.out.println("\n You lose :(((");
                        loss = loss + 1;
                        break;
                    }
                }
            }
        }
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

Nice job including the JavaDocs! Make sure you include the
play again option as indicated in the assignment.

SCORE: 1/20

*/

