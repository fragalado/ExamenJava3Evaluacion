package aplicacion.entidades;

/**
 * Clase Alumno
 * @author csi22
 *
 */
public class Alumno {
	
	// Atributos
	
	private int id; // Identificador del alumno
	private String nombre;
	private String apellidos;
	private String telefono; // Telefono como string 
	private String identificadorPortatil; // 3 primeras letras de la marca '-' 3 primeras letras del modelo
	private String marcaPortatil;
	private String modeloPortatil;
	
	// Constructores -> Constructor vacío
	
	// Getter y Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getIdentificadorPortatil() {
		return identificadorPortatil;
	}
	public void setIdentificadorPortatil() {
		// 3 primeras letras de la marca '-' 3 primeras letras del modelo
		// Si la marca está formada por más de 1 palabra
		// Vamos a juntar todas las palabras en una
		String marca = ""; // Donde guardaremos la marca entera
		String modelo = ""; // Donde guardaremos el modelo entero
		
		// Si tiene espacios 
		marca = CompruebaEspacios(marcaPortatil);
		
		// Metemos la marca
		if(marca.length() < 3)
			this.identificadorPortatil = marca.substring(0, marca.length()) + "-";
		else 
			this.identificadorPortatil = marca.substring(0, 3) + "-";
		
		// Ahora el modelo
		// Si tiene espacios 
		modelo = CompruebaEspacios(modeloPortatil);
		
		// Ahora añadimos el modelo
		if(modelo.length() < 3)
			this.identificadorPortatil += modelo.substring(0, modelo.length());
		else
			this.identificadorPortatil += modelo.substring(0, 3);
	}
	public String getMarcaPortatil() {
		return marcaPortatil;
	}
	public void setMarcaPortatil(String marcaPortatil) {
		this.marcaPortatil = marcaPortatil;
	}
	public String getModeloPortatil() {
		return modeloPortatil;
	}
	public void setModeloPortatil(String modeloPortatil) {
		this.modeloPortatil = modeloPortatil;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", identificadorPortatil=" + identificadorPortatil + ", marcaPortatil=" + marcaPortatil
				+ ", modeloPortatil=" + modeloPortatil + "]";
	}
	
	/**
	 * Método que comprobará si el texto que se pasa como parámetro contiene espacios
	 * Si contiene espacios quiere decir que el texto contiene más de una palabra y entonces las devolverá todas las palabras juntas
	 * Si no contiene espacios devolvera el texto
	 * @param texto
	 * @return
	 */
	private String CompruebaEspacios(String texto) {
		boolean tieneEspacios = false;
		String[] vAux;
		String textoCompleto = "";
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == ' ') {
				tieneEspacios = true;
				break;
			}
		}
		
		if (tieneEspacios) {
			vAux = texto.split(" ");
			
			for (int i = 0; i < vAux.length; i++) {
				textoCompleto += vAux[i];
			}
		}
		else
			textoCompleto += texto;
		
		return textoCompleto;
	}
}
