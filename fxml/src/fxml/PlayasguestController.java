/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HASH
 */
public class PlayasguestController implements Initializable{

    @FXML
    private ImageView randomcardloader;
    
    private String[] shufflecards = new String[30];
    @FXML
    private ImageView sloat1;
    @FXML
    private ImageView sloat2;
    @FXML
    private ImageView sloat3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generate_pack();
        display_sloat();
       
    }    
    private void display_sloat()
    {
        Image image = new Image(getClass().getResource("/cardpack/"+shufflecards[2]+".png").toExternalForm());
        randomcardloader.setImage(image);
        
        //Image image1 = new Image(getClass().getResource("/cardpack/12Diamon.png").toExternalForm());
        //sloat1.setImage(image1);
    }
    private void generate_pack()
    {
        CardShuffle obj = new CardShuffle();
        obj.RandomPickint();
        for(int i=0;i<30;i++)
        {
            Card obj1 = new Card(obj.type[i],obj.cards[i]);
            shufflecards[i] = obj1.Drawcard();
            System.out.println(shufflecards[i]);
        }
        
    }

    
    
}
