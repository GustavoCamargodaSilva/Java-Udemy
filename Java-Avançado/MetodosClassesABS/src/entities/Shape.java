package entities;

import enums.Color;

public abstract class Shape { /*Iniciando classe Abstrata*/
	private Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}



	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area(); /*Iniciando metodo Abstrato*/
}
