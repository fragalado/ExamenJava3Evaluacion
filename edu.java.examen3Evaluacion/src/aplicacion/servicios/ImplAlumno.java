package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Alumno;

/**
 * Implementación de la interfaz alumno donde haremos los métodos
 * @author csi22
 *
 */
public class ImplAlumno implements InterfazAlumno {
	
	// Crear Alumno
	@Override
	public List<Alumno> crearAlumno(List<Alumno> listaBD) {
		// Scanner para pedir los datos
		Scanner sc = new Scanner(System.in);
		
		// Pediremos el nombre, apellidos, teléfono, marca portátil y modelo portátil
		// Nombre
		System.out.println("Introduzca el nombre del alumno:");
		String nombre = sc.nextLine(); // Con nextLine conseguimos guardar los espacios
		
		// Apellidos
		System.out.println("Introduzca los apellidos del alumno:");
		String apellidos = sc.nextLine();
		
		// Teléfono
		System.out.println("Introduzca el teléfono del alumno:");
		String telefono = sc.nextLine();
		
		// Marca portátil
		System.out.println("Introduzca la marca del portátil:");
		String marca = sc.nextLine();
		
		// Modelo portátil
		System.out.println("Introduzca el modelo del portátil:");
		String modelo = sc.nextLine();
		
		// Creamos un objeto de tipo Alumno
		Alumno alm = new Alumno();
		
		// Añadimos los valores pedidos
		alm.setId(devuelveId(listaBD)); // Llamamos a un método para que ponga el id
		alm.setNombre(nombre);
		alm.setApellidos(apellidos);
		alm.setTelefono(telefono);
		alm.setMarcaPortatil(marca);
		alm.setModeloPortatil(modelo);
		alm.setIdentificadorPortatil(); // Se pondrá solo
		
		// Añadioms el objeto Alumno a la lista
		listaBD.add(alm);
		
		// Devolvemos la lista
		return listaBD;
	}
	
	// Borrar Alumno
	@Override
	public List<Alumno> borrarAlumno(List<Alumno> listaBD) {
		// Borraremos el Alumno a partir del id
		
		// Scanner para leer el id
		Scanner sc2 = new Scanner(System.in);
		
		// Pedimos el id
		System.out.println("Introduzca el id del alumno a borrar:");
		int idBorrar = sc2.nextInt();
		
		// Recorremos la lista para encontrar el id del alumno y borrarlo
		for (Alumno res : listaBD) {
			// Si el id es igual al id del alumno
			// Borramos el alumno de la lista
			if(idBorrar == res.getId()) {
				listaBD.remove(res);
				break;
			}
		}
		
		// Devolvemos la lista actualizada
		return listaBD;
	}
	
	// Listar alumno
	@Override
	public void listarAlumnos(List<Alumno> listaBD) {
		
		// Recorremos la lista y a la vez mostramos
		for (Alumno res : listaBD) {
			// Mosramos los datos
			System.out.println("ID: \""+ res.getId()+ "\"; Nombre: \"" + res.getNombre() + 
					"\"; Apellidos: \"" + res.getApellidos() + "\"; Telefono: \"" + res.getTelefono() +
					"\"; Identificador portatil: \"" + res.getIdentificadorPortatil() + "\";");
		}
	}
	
	
	// Método auxiliar
	/**
	 * Devuelve el ultimo id de la lista + 1
	 * @param listaBD
	 * @return
	 */
	private int devuelveId(List<Alumno> listaBD) {
		
		int maxID = 0;
		
		// Recorremos la lista
		for (Alumno res : listaBD) {
			// Comprobamos si el id del objeto res es mas grande que maxID
			// Si es mas grande se lo asignaremos a maxID
			if(maxID < res.getId())
				maxID = res.getId();
		}
		
		// Devolvemos maxID + 1
		return maxID + 1;
	}
}
