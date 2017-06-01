
package forkertest;

import forkertest.Player;
import java.util.ArrayList;

public class Referee extends Player{
    private ArrayList <Integer> p_points = new ArrayList<>(8);
    private ArrayList <String> p_names = new ArrayList<>(8);
    private ArrayList <Integer> p_ids = new ArrayList<>(8);
    private int i;
    
    protected int set_playerInfo()
    {
        p_points.add(getPoints());
        p_names.add(getName());
        p_ids.add(getID());
        return ++i;
    }
    protected  void Preflop_Round()
    {
    
    }
    protected  void Flop_Round()
    {
    
    }
    
    protected  void  Turn_Round()
    {
    
    }
    protected  void   River_Round()
    {
    
    }
     
     
    protected void point_calculate()
    {
        
        
    }
    
}
