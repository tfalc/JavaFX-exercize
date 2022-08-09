package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btTest;

	@FXML
	private Button btSoma;

	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
		Alerts.showAlert("ALERTA", "Alerta gráfico", "Você clicou no botão!", AlertType.INFORMATION);
	}

	@FXML
	public void onBtSomaAction() {
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber1.getText());
		double soma = number1 + number2;
		labelResult.setText(String.format("%.2f", soma));
	}

}
