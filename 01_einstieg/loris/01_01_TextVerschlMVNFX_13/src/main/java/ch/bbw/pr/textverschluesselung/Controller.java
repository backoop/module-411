package ch.bbw.pr.textverschluesselung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Controller zu View.fmxl
 * @author Peter Rutschmann
 * @version 26.08.2020
 */
public class Controller {
	@FXML
	private TextField tfInput;

	@FXML
	private TextField tfOutput;
	
	public Controller() {
		super();
	}

	// Initialise the controller class
	@FXML
	private void initialize() {
		tfInput.setText("");
		tfOutput.setText("");
	}

	// Called when the user clicks on the button.
	@FXML
	private void aufgabe1(ActionEvent f) {
		tfOutput.setText("aufgabe 1: " + Algorithm.disguise(tfInput.getText()));
	}
	
	// Called when the user clicks on the button.
	@FXML
	private void aufgabe2(ActionEvent f) {
		//Hier Aufruf der Methode aus Algorithm anpassen
		tfOutput.setText("aufgabe 2: " + tfInput.getText());
	}
	
	// Called when the user clicks on the button.
	@FXML
	private void aufgabe3(ActionEvent f) {
		//Hier Aufruf der Methode aus Algorithm anpassen
		tfOutput.setText("aufgabe 3: " + tfInput.getText());
	}

	@FXML
	private void clear(ActionEvent f) {
		tfInput.setText("");
		tfOutput.setText("");
	}
}
