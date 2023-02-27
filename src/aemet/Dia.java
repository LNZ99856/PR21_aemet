package aemet;

public class Dia {
	private int temperatura;
	private int humedad;

	public Dia() {
		this.temperatura = (int) (Math.random() * 30 - 10);
		this.humedad = (int) (Math.random() * 70 + 30);
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return "[" + temperatura + "º/" + humedad + "%]";
	}

}
