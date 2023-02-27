package aemet;

import java.util.Arrays;

public class EstacionMeteorologica {

	private Dia[] listaDias;

	public EstacionMeteorologica(int numeroDias) {
		this.listaDias = creaDias(numeroDias);
	}

	private Dia[] creaDias(int diasMes) {
		Dia[] devolver = new Dia[diasMes];
		if ((diasMes > 28) && (diasMes < 31)) {
			for (int i = 0; i < diasMes; i++) {
				devolver[i] = new Dia();
			}
		}
		return devolver;
	}

	@Override
	public String toString() {
		return "[listaDias=" + Arrays.toString(listaDias) + "]";
	}
	
}
