package dad.rubenpablo.calculadorafxml.mvc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{

	private DoubleProperty calculo = new SimpleDoubleProperty();
	
	@FXML
	private GridPane view;
	
	@FXML
	private TextField pantallaText;
	
	// Botones
	@FXML
	private Button borrarButton;
	@FXML
	private Button cuatroButton;
	@FXML
	private Button cincoButton;
	@FXML
	private Button seisButton;
	@FXML
	private Button multButton;
	@FXML
	private Button divButton;
	@FXML
	private Button unoButton;
	@FXML
	private Button dosButton;
	@FXML
	private Button tresButton;
	@FXML
	private Button restarButton;
	@FXML
	private Button igualButton;
	@FXML
	private Button ceroButton;
	@FXML
	private Button sieteButton;
	@FXML
	private Button ochoButton;
	@FXML
	private Button nueveButton;
	@FXML
	private Button borrarTodoButton;
	@FXML
	private Button sumarButton;
	@FXML
	private Button decButton;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	
}
