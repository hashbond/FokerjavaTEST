
package forkertest;

import java.util.ArrayList;

public class PlayerScoringProcedure implements PlayingRoundCalcukations{
    protected ArrayList <Integer> socres = new ArrayList<>(8);
    protected ArrayList <Integer> p_ids = new ArrayList<>(8);
    protected int card1,card2;
    @Override
    public void Preflop_Round() {
      
    }
    public void Preflop_Round(int card1,int card2) {
       this.card1=card1;
       this.card2=card2; 
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
    
}
