
package forkertest;

import java.util.ArrayList;

public class HandRanking {

    
    int card_rank[] = new int[14];
    int i,j;
    boolean sate;
    protected String Heart;
    protected String Spades;
    protected String Clubs;
    protected String Diamon;
    public HandRanking() {
        for(int i=1;i<14;i++)
        {
            card_rank[i]=i;
        }
        
    }
        
    protected void RoyalFlush(int card1,int card2,int card3,int card4,int card5,int card6,int card7)//no matter isit spades,clubs,heart,diamon
    {
       int cards[] = new int[7];
       int temp=0;
       sate = false;
       
       cards[0] = card1;
       cards[1] = card2;
       cards[2] = card3;
       cards[3] = card4;
       cards[4] = card5;
       cards[5] = card6;
       cards[6] = card7;
       
       for(i=0;i<7;i++)
       {
          for(j=1;j<(7-i);j++)
          {
              if(cards[j-1]>cards[j])
              {
                  temp = cards[j-1];
                  cards[j-1] = cards[j];
                  cards[j] = temp;
              }
              
          }
       
       }
       for(int i=0;i<14;i++)
       {
           if(cards[13]==13)
           {
               if(cards[12]==12)
                {
                     if(cards[11]==11)
                     {
                        if(cards[10]==10)
                         {
                             if(cards[9]==9)
                                {
                                    this.sate= true;
                                }
                         }
                     }
                }
           }
           
       }
       
       
           
       }
       protected boolean returnState()
       {
           return sate;
       }
       
    
    
}
