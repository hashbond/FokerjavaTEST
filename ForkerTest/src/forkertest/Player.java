
package forkertest;

public class Player {
     private int ID;
     private String Name;
     private boolean PlayerInput;
     private int card1;
     private String card1shp;
     private int card2;
     private String card2shp;


    public String getCard1shp() {
        return card1shp;
    }

    public String getCard2shp() {
        return card2shp;
    }

    public void setCard1shp(String card1shp) {
        this.card1shp = card1shp;
    }

    public void setCard2shp(String card2shp) {
        this.card2shp = card2shp;
    }
     
    public int getCard1() {
        return card1;
    }

    public int getCard2() {
        return card2;
    }

    public void setCard1(int card1) {
        this.card1 = card1;
        
    }

    public void setCard2(int card2) {
        this.card2 = card2;
    }
    
    public void setPlayerInput(boolean PlayerInput) {
        this.PlayerInput = PlayerInput;
    }

    public boolean isPlayerInput() {
        return PlayerInput;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    
   
   
   
    
    
}
