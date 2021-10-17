package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		String[] motores = {"electrico","gasolina"};
		int i;
		for(i=0;i<motores.length;i++) {
			if(motores[i] == tipo) {
				this.tipo = tipo;
			}
		}
	}
}
