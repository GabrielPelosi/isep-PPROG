package com.pelosi.javafx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
	private int num =0;
	
	String a;
	@FXML
	private Button button;
	
    @FXML
    private void handleButtonAction(ActionEvent event) {
		num++;
		
	    a = Integer.toString(num);
		
		label.setText(a);
		
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

	@FXML
	private void addValue(MouseEvent event) {
	}
}
