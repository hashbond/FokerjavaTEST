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
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author HASH
 */
public class HomeScreenController implements Initializable {

    @FXML
    private JFXButton playasguest;
    @FXML
    private JFXButton register;
    @FXML
    private JFXButton about;
    @FXML
    private JFXButton exit;
    @FXML
    private Label F;
    @FXML
    private Label F1;
    @FXML
    private Label k;
    @FXML
    private Label e;
    @FXML
    private Label r;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        
        transition4.play();
        transition5.play();
        transition6.play();
        transition7.play();
        transition8.play();
        
        
        
    }    

    @FXML
    private void playasguest(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Playasguest.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
        stage.setScene(scene);
        stage.show();
             
        
    }
    
}
