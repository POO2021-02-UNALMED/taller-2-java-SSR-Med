package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	void cambiarColor(String color) {
		String[] colores = {"rojo", "verde","amarillo","negro","blanco"};
		int i;
		for(i =0; i < colores.length;i++) {
			if(colores[i] == color) {
				this.color = color;
			}
			
		}
	}
}