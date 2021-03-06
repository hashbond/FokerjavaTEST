/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
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
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
    @FXML
    private Label F;
    @FXML
    private AnchorPane o;
    @FXML
    private Label F1;
    @FXML
    private Label k;
    @FXML
    private Label e;
    @FXML
    private Label r;
    
    //private 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(3));
        transition.setNode(img);
        transition.setToX(-350);
        
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(3));
        transition1.setNode(img2);
        transition1.setToX(-250);

        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(3));
        transition2.setNode(img4);
        transition2.setToX(-50);
        
        TranslateTransition transition3 = new TranslateTransition();
        transition3.setDuration(Duration.seconds(3));
        transition3.setNode(img1);
        transition3.setToX(-150);
        
        TranslateTransition transition4 = new TranslateTransition();
        transition4.setDuration(Duration.seconds(6));
        transition4.setNode(F);
        transition4.setToY(-5);
        transition4.setAutoReverse(true);
        transition4.setCycleCount(TranslateTransition.INDEFINITE);
        
       
        
        
        
        TranslateTransition transition5 = new TranslateTransition();
        transition5.setDuration(Duration.seconds(6));
        transition5.setNode(e);
        transition5.setToY(-10);
        transition5.setAutoReverse(true);
        transition5.setCycleCount(TranslateTransition.INDEFINITE);
        
        TranslateTransition transition6 = new TranslateTransition();
        transition6.setDuration(Duration.seconds(6));
        transition6.setNode(F1);
        transition6.setToY(5);
        transition6.setAutoReverse(true);
        transition6.setCycleCount(TranslateTransition.INDEFINITE);
        
          TranslateTransition transition7 = new TranslateTransition();
        transition7.setDuration(Duration.seconds(6));
        transition7.setNode(k);
        transition7.setToY(-5);
        transition7.setAutoReverse(true);
        transition7.setCycleCount(TranslateTransition.INDEFINITE);
        
        TranslateTransition transition8 = new TranslateTransition();
        transition8.setDuration(Duration.seconds(6));
        transition8.setNode(r);
        transition8.setToY(5);
        transition8.setAutoReverse(true);
        transition8.setCycleCount(TranslateTransition.INDEFINITE);
        
        
        transition.play();
        transition1.play();
        transition2.play();
        transition3.play();
        transition4.play();
        transition5.play();
        transition6.play();
        transition7.play();
        transition8.play();
        
    }   

    @FXML
    private void HandeleButton(ActionEvent event) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        
        Scene scene = new Scene(root);  
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
        stage.setScene(scene);
        stage.show(); 
        
    }
    
    
}
