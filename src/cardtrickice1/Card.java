/*
 * Student ID:- 991665276
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author KartikKumar Patel
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
    
    public static int RandomValue()
    {
        return  (int) ((Math.random()*12)+1);
    }
    //method for suits
       public static String RandomSuit()
   {
       int a1 = (int)(Math.random()*4);
       return SUITS[a1];
   }
}
