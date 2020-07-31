/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isep.dei.pl18;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.isep.dei.pl18.model.Tarefa;

/**
 * FXML Controller class
 *
 * @author Pelosi
 */
public class ListaTarefasSceneController implements Initializable {

    @FXML
    private Button btnAdicionarTarefas;
    @FXML
    private Button btnLimparTarefas;
    @FXML
    private TextArea txtAreaTarefas;

    private Stage novaTarefa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            novaTarefa = new Stage();
            novaTarefa.initModality(Modality.APPLICATION_MODAL);
            novaTarefa.setTitle("Nova Tarefa");
            novaTarefa.setResizable(false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarTarefaScene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            AdicionarTarefaSceneController adtController = loader.getController();
            adtController.associarController(this);

            novaTarefa.setScene(scene);
        } catch (IOException ex) {
            Alert a = criarAleta(Alert.AlertType.ERROR, "Erro", ex.getMessage());
            a.show();
        }
    }

    @FXML
    private void adicionarTarefaAction(ActionEvent event) {
        novaTarefa.show();
    }

    public void adicionarTarefa(Tarefa t) {
        txtAreaTarefas.appendText(t.toString());
        txtAreaTarefas.appendText(" ");
        txtAreaTarefas.appendText("\n");

        Alert a = criarAleta(Alert.AlertType.INFORMATION, "Nova tarefa", "Tarefa Adicionada com sucesso");
        a.show();
    }

    @FXML
    private void limparTarefasAction(ActionEvent event) {
        txtAreaTarefas.clear();
    }

    @FXML
    private void teclaPressionadaAction(KeyEvent event) {
    }

    private Alert criarAleta(Alert.AlertType tipoAlerta, String cabecalho,
            String mensagem) {
        Alert alerta = new Alert(tipoAlerta);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(mensagem);

        return alerta;
    }
}
