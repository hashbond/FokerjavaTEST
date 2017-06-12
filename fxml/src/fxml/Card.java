/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

public class Card {
    private String type;
    private int value;
    
    protected Card(String type, int value) {
        this.type = type;
        this.value = value;
    }
   
   protected String Drawcard()
   {
       String val = Integer.toString(value);
       return val+type;
   }
   
    
    
}
