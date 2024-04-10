/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package primerproyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author mgarr
 */
public  class FXMLController  {
    
    @FXML         public    Button myButton;
    @FXML         public    Label myLabel;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void onButtonClicked(){
        if ("hola hola".equals(myLabel.getText())){
            myLabel.setText("");
        } else {
            myLabel.setText("hola hola");
        }
        
    }
}