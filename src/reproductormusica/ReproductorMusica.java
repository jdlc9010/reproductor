
package reproductormusica;

public class ReproductorMusica {
// ATRIBUTOS
	private String canciones[];
	private int cancionesFavoritas[];
	private boolean pausado;
	private int cancionReproduciendo;

	public ReproductorMusica(String[] canciones, int[] cancionesFavoritas, boolean pausado, int cancionReproduciendo) {
		this.canciones = canciones;
		this.cancionesFavoritas = cancionesFavoritas;
		this.pausado = pausado;
		this.cancionReproduciendo = cancionReproduciendo;
	}

	public ReproductorMusica() {

	}

	// MÉTODOS
	public ReproductorMusica(String[] canciones) {
		// COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO
		this.canciones = canciones;
		this.cancionReproduciendo = 0;
		this.pausado = true;
		int[] arrayInt = new int[canciones.length];
		for (int i = 0; i < canciones.length; i++) {
			arrayInt[i] = -1;
			System.out.println("arrayInt: " + arrayInt[i]);
		}

		this.cancionesFavoritas = arrayInt;
		System.out.println("cancionesFavoritas: " + this.cancionesFavoritas.length);
	}

	public void proximaCancion() {
		// COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
	}

	public void devolverCancion() {
		// COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
	}

	public void cambiarEstadoReproduccion() {
		// COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
	}

	// NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI
	// MODIFICARLO!
	public void agregarCancionesFavoritas() {
		for (int i = 0; i < cancionesFavoritas.length; i++)
			/*
			 * En caso de que encuentre que cancionReproduciendo está en el banco de
			 * cancionesFavoritas no seguimos buscando espacio libre para agregarla, y
			 * salimos del método
			 */
			if (cancionesFavoritas[i] == cancionReproduciendo)
				return;
			// Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
			else if (cancionesFavoritas[i] == -1) {
				cancionesFavoritas[i] = cancionReproduciendo;
				return;
			}
	}

	public String[] getCanciones() {
		// COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
		return this.canciones;
	}

	public void setCanciones(String[] canciones) {
		// COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
		this.canciones = canciones;
	}

	public int[] getCancionesFavoritas() {
		// COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
		return this.cancionesFavoritas;

	}

	public void setCancionesFavoritas(int[] cancionesFavoritas) {
		// COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
		this.cancionesFavoritas = cancionesFavoritas;
	}

	public boolean isPausado() {
		// COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
		return false;
	}

	public void setPausado(boolean pausado) {
		// COMPLETE AQUÍ EL SETTER CORRESPONDIENTE

	}

	public int getCancionReproduciendo() {
		// COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
		return this.cancionReproduciendo;
	}

	public void setCancionReproduciendo(int cancionReproduciendo) {
		// COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
		this.cancionReproduciendo = cancionReproduciendo;
	}

}