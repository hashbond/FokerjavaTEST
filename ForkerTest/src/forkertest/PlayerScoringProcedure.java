
package forkertest;

import java.util.ArrayList;

public class PlayerScoringProcedure implements PlayingRoundCalcukations{
    protected ArrayList <Integer> socres = new ArrayList<>(8);
    protected ArrayList <Integer> p_ids = new ArrayList<>(8);
    protected int[] pids = new int[8];
    private int card1,card2;
    private String card1shp,card2Shp;
    private int marks;
    protected int id;
    
    @Override
    public void Preflop_Round() {
      //do nothing
    }
    public int Preflop_Round(int card1,int card2,int id,String card1shp,String card2shp) {
       this.card1=card1;
       this.card2=card2; 
       this.card1shp = card1shp;
       this.card2Shp = card2shp;
       this.id = id;
       return card_identify();
       
    }
   private int card_identify()
   {
       switch(card1)
       {
                  case 2:
                   marks =1;
                   break;
                  case 3:
                   marks =4;
                   break;
                   case 4:
                   marks =1;
                   break;
                   case 5:
                   marks =0;
                   break;
                   case 6:
                   marks =5;
                   break;
                   case 7:
                   marks =3;
                   break;
                   case 8:
                   marks =5;
                   break;
                   case 9:
                   marks =2;
                   break;
                   case 10:
                   marks =4;
                   break;
                   case 11:
                   marks =2;
                   break;
                   case 12:
                   marks =2;
                   break;
                   case 13:
                   marks =4;
                   break;
                   case 14:
                   marks =4;
                   break;
       }
       return marks;
                   
   }
    
    
    
    @Override
    public void Flop_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Turn_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void River_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void calculation()
    {
       
    }
    protected  void cardPoints()
    {
        //all 4 type of cards get equal marks 
    }
    
}
