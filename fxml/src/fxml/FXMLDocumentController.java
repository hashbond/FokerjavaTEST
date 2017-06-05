/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author HASH
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private JFXButton button;
    @FXML
    private ImageView img;
   
    @FXML
    private ImageView img2;//king
    @FXML
    private ImageView img1;//ace of spades
    @FXML
    private ImageView img4;//queen
    
    //private 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Circle circle = new Circle(100);
        
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(2));
        transition.setNode(img);
        
        transition.setToX(-350);
        
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(2));
        transition1.setNode(img2);
        
        transition1.setToX(-250);

        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(2));
        transition2.setNode(img4);
        
        transition2.setToX(-50);
        
        TranslateTransition transition3 = new TranslateTransition();
        transition3.setDuration(Duration.seconds(2));
        transition3.setNode(img1);
        
        transition3.setToX(-150);


        //transition.setAutoReverse(true);
       // transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.play();
        transition1.play();
        transition2.play();
        transition3.play();
        
    }   
    
    
}
