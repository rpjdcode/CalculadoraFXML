package dad.rubenpablo.calculadorafxml.mvc;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CalculadoraModel {
	
	private DoubleProperty pantallaProperty = new SimpleDoubleProperty();
	
	public DoubleProperty getPantallaProperty() {
		return pantallaProperty;
	}
	
	public Double getPantallaValue() {
		return this.pantallaProperty.get();
	}
	
	public void setPantallaValue(final double val) {
		this.pantallaProperty.set(val);
	}
}
