package com.pelosi.javafx02;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.pelosi.javafx02.model.Data;
import com.pelosi.javafx02.model.DiaInvalidoException;
import com.pelosi.javafx02.model.MesInvalidoException;

public class FXMLController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button bDiaSemana;
    @FXML
    private Button bDiaExtenso;
    @FXML
    private Button bLimpar;
    @FXML
    private TextField dataInsert;
    @FXML
    private TextField diaSemana;

    @FXML
    private void clicarDiaSemana(ActionEvent event) {

        String data = dataInsert.getText();
        try {
            Data d = getData(data);
            diaSemana.setText(d.diaDaSemana());
        } catch (Exception e) {
            diaSemana.setText("");
            dataInsert.setText("");
            label.setText("");
        }

    }

    @FXML
    private void clicarDiaExtenso(ActionEvent event) {
        String data = dataInsert.getText();
        try {
            Data d = getData(data);
            label.setText(d.toString());
        } catch (Exception e) {
            diaSemana.setText("");
            dataInsert.setText("");
            label.setText("");
        }
    }

    @FXML
    private void clicarLimpar(ActionEvent event) {
        diaSemana.setText("");
        dataInsert.setText("");
        label.setText("");
    }

    private Data getData(String data) throws Exception {
        String partes[] = data.split("/");
        int partesData[] = new int[3];
        try {
            for (int i = 0; i < partes.length; i++) {
                partesData[i] = Integer.parseInt(partes[i].trim());
            }
            Data d = new Data(partesData[0], partesData[1], partesData[2]);
            return d;
        } catch (DiaInvalidoException die) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("ERRO");
            a.setHeaderText(null);

            a.setContentText(die.getMessage());

            a.show();
        } catch (MesInvalidoException mie) {
            Alert a = new Alert(Alert.AlertType.ERROR);

            a.setTitle("ERRO");
            a.setHeaderText(null);
            a.setContentText(mie.getMessage());

            a.show();

        } catch (NumberFormatException nfe) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("ERRO");
            a.setHeaderText(null);

            a.setContentText("Data inválida!");

            a.show();

        }

        throw new Exception();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
