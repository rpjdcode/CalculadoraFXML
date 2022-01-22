package dad.rubenpablo.calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private CalculadoraController controlador;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controlador = new CalculadoraController();
		Scene escena = new Scene(controlador.getView(), 320, 200);
		
		
		primaryStage.setTitle("CalculadoraFXML");
		
		primaryStage.setScene(escena);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
