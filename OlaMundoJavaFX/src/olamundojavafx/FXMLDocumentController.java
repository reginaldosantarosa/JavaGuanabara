/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMennsagem;
    @FXML
    private Button btClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMennsagem.setText("OlaMundo");
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
