package ejemplos.tiempo;

public class Intervalo {
	private int min,max;
	private String nombre;

	public Intervalo(int min, int max, String nombre) {
		super();
		this.min = min;
		this.max = max;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
}
