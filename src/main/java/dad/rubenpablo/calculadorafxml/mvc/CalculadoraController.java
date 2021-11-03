package dad.rubenpablo.calculadorafxml.mvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.calculadora.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{

	// Modelo. La calculadora nos ayudará a actuar como modelo
	private Calculadora calculadora = new Calculadora();
	
	// Componentes de la vista
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
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		
		loader.setController(this);
		loader.load();
	}
	
	public GridPane getView() {
		return view;
	}
	

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		pantallaText.textProperty().bind(calculadora.contenidoProperty());
		
	}

	@FXML
	public void onClickAction(ActionEvent e) {
		Button clickeado = (Button)e.getSource();
		
		switch (clickeado.textProperty().getValue()) {
		case "1":
			calculadora.insertar('1');
			break;
		case "2":
			calculadora.insertar('2');
			break;
		case "3":
			calculadora.insertar('3');
			break;
		case "4":
			calculadora.insertar('4');
			break;
		case "5":
			calculadora.insertar('5');
			break;
		case "6":
			calculadora.insertar('6');
			break;
		case "7":
			calculadora.insertar('7');
			break;
		case "8":
			calculadora.insertar('8');
			break;
		case "9":
			calculadora.insertar('9');
			break;
		case "0":
			calculadora.insertar('0');
			break;
		case "C":
			calculadora.borrar();
			break;
		case "CE":
			calculadora.borrarTodo();
			break;
		case "+":
			calculadora.operar(Calculadora.SUMAR);
			break;
		case "-":
			calculadora.operar(Calculadora.RESTAR);
			break;
		case "*":
			calculadora.operar(Calculadora.MULTIPLICAR);
			break;
		case "/":
			calculadora.operar(Calculadora.DIVIDIR);
			break;
		case "=":
			calculadora.operar(Calculadora.IGUAL);
			break;
		case ".":
			calculadora.insertarComa();
			break;
		default:
			break;
		}
	}
	
}
