package edu.pasadena.cs.cs03b;
import java.util.Scanner;
public class card_deck
{
    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        int card;
        String suit = new String("");
        String type = new String("");
        String repeat = new String("");
        do
        {
            while(true)
            {
                System.out.print("Please output a card (1-52):");
                card = input.nextInt();
                if(card > 0 && card < 53)
                    break;
                System.out.println("\nWrong output please try again!\n");
            }
            card --;
            //getting suit
            switch(card / 13)
            {
                case 0: suit = "Clubs";
                    break;
                case 1: suit = "Diamonds";
                    break;
                case 2: suit = "Hearts";
                    break;
                case 3: suit = "Spades"; 
                    break;
            }
            //getting type
            switch(card % 13)
            {
                case 0: type = "Ace";
                    break;
                case 10: type = "Jack";
                    break;
                case 11: type = "Queen";
                    break;
                case 12: type = "King";
                    break;
                default: type = String.valueOf((card % 13) + 1);
            }

            System.out.println("The card you chose is the " + type + " of " + suit);
            input.nextLine();
            System.out.print("Would you like to run the program again (yes or no)? ");
            repeat = input.nextLine();
        }while(repeat.toLowerCase().equals("yes"));
        
        System.out.println("\nHave a nice day!");
        input.close();
    }
}