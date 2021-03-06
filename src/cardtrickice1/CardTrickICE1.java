/*
Student ID:- 991665276
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author KartikKumar Patel
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        Card[] magicHand = new Card[7]; //Array of object
        Card  luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuits("diamonds");
        
        for( int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Card.RandomValue());
            c.setSuits(Card.RandomSuit());
            magicHand[i]= c;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuits());
            
        }
        
        System.out.println("Enter the card number 1 to 12");
        
        int num = scan.nextInt();
        
        System.out.println("Choose the card suits: ");
        System.out.println("1:hearts\n 2:diamonds\n 3:spades\n 4:clubs");
        
        int suitnum = scan.nextInt();
        String suit = SelectSuit(suitnum);
        
        boolean match = true ;
        for(int i = 0; i < magicHand.length; i++)
        {
            match = true;
            if((magicHand[i].getValue() == num) && (magicHand[i].getSuits().equals(suit)))
            {
                System.out.println("card is found");
                break;
            }

            else
            {
                match = false;
            }
        }
        
        if(match == false)
        {
            System.out.println("Card not found");
        }
    }
    public static String SelectSuit(int a)
    {
        String suit= "";
        switch(a)
        {
            case 1:
            suit= "hearts";
            break;
            
            case 2:
            suit = "diamonds";
            break ;
            
            case 3:
            suit ="spades";
            break;
            
            case 4:
            suit = "clubs";
            break;
        
        }
        return suit;
    
    }
}
