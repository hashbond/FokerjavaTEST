
package forkertest;



     public class PlayingRound extends shuffle{
     protected int bigblind_id;
     protected int smallblind_id;
     private int i,recard_id;
     /*protected void Preflop_Round(int bigblind_id,int smallblind_id)
     {
         this.bigblind_id = bigblind_id;
         this.smallblind_id = smallblind_id;
         
     }
      protected void  Flop_Round(int bigblind_id,int smallblind_id)
     {
         this.bigblind_id = bigblind_id;
         this.smallblind_id = smallblind_id;
         //call for three card 
         
     }
       protected void   Turn_Round(int bigblind_id,int smallblind_id)
     {
         this.bigblind_id = bigblind_id;
         this.smallblind_id = smallblind_id;
         //call one more card tot ,4 cards
         
     */
        protected void  Playing_Round(int bigblind_id,int smallblind_id)
        {
         
           this.bigblind_id = bigblind_id;
           this.smallblind_id = smallblind_id;
           //call one more and final card, total 5 cards
         
        }  
        protected int Card_Distrib(int i)
        {
                 this.i = i;
                 super.distribCard(++i);
                 return ++i;
        
        }
         protected int replace(int id,int recard_id)
         {
             this.recard_id = recard_id;
             super.replaceCards(recard_id);
             return id; 
         }
          protected void bet_Amount()
         {
            
         }
        protected void foul_Game()
         {
    
         }
        protected  void call()
         {
        
         }
        protected  void Raise()
        {
        
        }
        protected void Replace()
        {
        
        }
        protected  void check()
        {
        
        }
      
}
