package dad.calculadora;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Implementación de la lógica de una calculadora.
 * @author Fran Vargas
 */
public class Calculadora {
	
	public static final char IGUAL = '='; 
	public static final char SUMAR = '+'; 
	public static final char RESTAR = '-'; 
	public static final char DIVIDIR = '/'; 
	public static final char MULTIPLICAR = '*';
	
	private static final char COMA = '.'; 
	
	private Double operando;
	private char operador;
	private Boolean nuevoOperando;
	private String pantalla;
	
	private StringProperty contenido = new SimpleStringProperty();
	
	public Calculadora() {
		borrar();
	}
	
	/**
	 * Devuelve el contenido de la pantalla de la calculadora.
	 * @return Cadena de texto con el contenido de la pantalla de la calculdora.
	 */
	public String getPantalla() {
		return pantalla;
	}

	/**
	 * Inicializa por completo la calculadora, borrando la información que tiene memorizada y la pantalla.
	 */
	public void borrar() {
		operando = 0.0;
		operador = '=';
		borrarTodo();
	}
	
	/**
	 * Borra lo que hay en la pantalla (el último operando introducido).
	 */
	public void borrarTodo() {
		nuevoOperando = true;
		pantalla = "0.0";
		contenido.set(pantalla);
	}
	
	/**
	 * Indica a la calculadora que realice la operación indicada. 
	 * @param operador Operación a realizar; usar una constante: IGUAL, SUMAR, RESTAR, MULTIPLCIAR, DIVIDIR.
	 */
	public void operar(char operador) {
		nuevoOperando = true;
		double operando2 = Double.parseDouble(pantalla);
		switch (this.operador) {
			case SUMAR: operando += operando2; break;
			case RESTAR: operando -= operando2; break;
			case MULTIPLICAR: operando *= operando2; break;
			case DIVIDIR: operando /= operando2; break;
			case IGUAL: operando = operando2; break;
		}
		this.operador = operador;
		pantalla = "" + operando;
		contenido.set(pantalla);
	}
	
	/**
	 * Inserta una coma en el operando actual (pantalla).
	 */
	public void insertarComa() {
		if (!pantalla.contains("" + COMA)) {
			pantalla += COMA;
			contenido.set(pantalla);
		}
	}
	
	/**
	 * Inserta un dígito en el operando actual (pantalla).
	 * @param digito Digito a introducir en la pantalla.
	 */
	public void insertar(char digito) {
		if (digito >= '0' && digito <= '9') {
			if (nuevoOperando) {
				nuevoOperando = false;
				pantalla = "";
				contenido.set(pantalla);
			}
			pantalla += digito;
			contenido.set(pantalla);
		} else if (digito == COMA) {
			insertarComa();
		}
	}

	public final StringProperty contenidoProperty() {
		return this.contenido;
	}
	
	public final String getContenido() {
		return this.contenidoProperty().get();
	}
	
	public final void setContenido(final String contenido) {
		this.contenidoProperty().set(contenido);
	}
	
	
}