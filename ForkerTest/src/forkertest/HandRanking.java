
package forkertest;

import java.util.ArrayList;

public class HandRanking {

    
    protected ArrayList <Integer> card_rank = new ArrayList<>(14);
    protected String Heart;
    protected String Spades;
    protected String Clubs;
    protected String Diamon;
    public HandRanking() {
        for(int i=0;i<13;i++)
        {
            card_rank.add(i);
        }
        
    }
        
    protected void RoyalFlush(int card1,int card2,int card3,int card4,int card5,int card6,int card7)//no matter isit spades,clubs,heart,diamon
    {
        
    }
    
    
}
