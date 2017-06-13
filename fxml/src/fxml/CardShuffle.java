
package fxml;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author HASH
 */
public class CardShuffle {
    protected int []cards = new int[30];
    protected String []type = new String[30];
    private boolean value=true;
   
    //protected HashMap card = new HashMap();
    int []cardid = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    
    String []cardtype = {"Harts","Spades","Clubs","Diamon"};
    //randomly select one card and add to array
    Random random = new Random();
    Random ran = new Random();
    protected void RandomPickint()
    {
        int i,y;
        for(i=0;i<30;i++)
        {
        
            
            int id = cardid[ran.nextInt(cardid.length)];
            String cardtyp = cardtype[random.nextInt(cardtype.length)];
            if(cardtyp == null)
            {
                --i;
                value = false;
                break;
            }
            
            for(y=0;y<30;y++)
            {
                if(id==cards[y] && cardtyp==type[y])
                    {
                        --i;
                        value = false;
                        break;
                        
                    
                    }
               
            }
            if(value = true)
            {
             type[i] = cardtyp;
             cards[i] = id;
            }       
            
        
        }      
        
        
    }
   
    
    
    
}
