package aemet;

import java.util.Comparator;

public class ComparadorEstacionesMeteorologicas implements Comparator<EstacionMeteorologica> {

	private int comoOrdenar;
	public static final int TEMPERATURA_ASCENDENTE = 1;
	public static final int HUMEDAD_ASCENDENTE = 2;

	public ComparadorEstacionesMeteorologicas() {
		this.comoOrdenar = 1;
	}

	public void setComoOrdenar(int como) {
		switch (como) {
		case (1):
			comoOrdenar = TEMPERATURA_ASCENDENTE;
			break;
		case (2):
		default:
			comoOrdenar = HUMEDAD_ASCENDENTE;
		}
	}

	@Override
	public int compare(Dia d1, Dia d2) {
		int devolver = 0;
		switch (comoOrdenar) {
		case (TEMPERATURA_ASCENDENTE):
			devolver = d1.getTemperatura() - d2.getTemperatura();
			if (devolver == 0) {
				devolver = d1.getHumedad() - d2.getHumedad();
			}
			break;
		case (HUMEDAD_ASCENDENTE):
			devolver = d1.getHumedad() - d2.getHumedad();
			if (devolver == 0) {
				devolver = d1.getTemperatura() - d2.getTemperatura();
			}
			break;
		}
		return devolver;
	}

}
