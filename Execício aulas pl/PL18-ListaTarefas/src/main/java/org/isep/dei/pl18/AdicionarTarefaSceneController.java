/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isep.dei.pl18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.isep.dei.pl18.model.Prioridade;
import org.isep.dei.pl18.model.Tarefa;

/**
 * FXML Controller class
 *
 * @author Pelosi
 */
public class AdicionarTarefaSceneController implements Initializable {

	@FXML
	private Button btnCriarTarefa;
	@FXML
	private Button btnCancelar;
	@FXML
	private Label lblTarefa;
	@FXML
	private Label lblPrioridade;
	@FXML
	private TextField txtTarefa;
	@FXML
	private ComboBox<String> cmbPrioridade;

	private ListaTarefasSceneController ltsc;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
			cmbPrioridade.getItems().addAll(Prioridade.ABAIXO_NORMAL.toString(), Prioridade.ACIMA_NORMAL.toString(), Prioridade.BAIXA.toString(), Prioridade.ELEVADO.toString(),
				Prioridade.NORMAL.toString(), Prioridade.TEMPO_REAL.toString());
	}

	@FXML
	private void criarTarefaAction(ActionEvent event) {	
		
		try{
			
			String a = cmbPrioridade.getSelectionModel().getSelectedItem();
		if (a.equals(Prioridade.ABAIXO_NORMAL.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.ABAIXO_NORMAL);
			ltsc.adicionarTarefa(t);
		} else if (a.equals(Prioridade.ACIMA_NORMAL.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.ACIMA_NORMAL);
			ltsc.adicionarTarefa(t);
		} else if (a.equals(Prioridade.BAIXA.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.BAIXA);
			ltsc.adicionarTarefa(t);
		} else if (a.equals(Prioridade.ELEVADO.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.ELEVADO);
			ltsc.adicionarTarefa(t);
		} else if (a.equals(Prioridade.NORMAL.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.NORMAL);
			ltsc.adicionarTarefa(t);
		} else if (a.equals(Prioridade.TEMPO_REAL.toString())) {
			Tarefa t = new Tarefa(txtTarefa.getText(), Prioridade.TEMPO_REAL);
			ltsc.adicionarTarefa(t);
		}	
			
		}catch(IllegalArgumentException iae){
			Alert a =criarAleta(Alert.AlertType.ERROR, "Erro", iae.getMessage());
			a.show();
			
		}
		
	}

	@FXML
	private void cancelarAction(ActionEvent event) {
		this.txtTarefa.setText(" ");
		((Node) event.getSource()).getScene().getWindow().hide();
	}

	public void associarController(ListaTarefasSceneController ltsc) {
		this.ltsc = ltsc;
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
