package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Alumno;
import aplicacion.servicios.ImplAlumno;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazAlumno;
import aplicacion.servicios.InterfazMenu;

/**
 * Clase principal donde llamaremos a las demas clases y que contendrá el main
 * @author csi22
 *
 */
public class Menu {

	public static void main(String[] args) {
		
		// Inicializamos las interfaces e implementaciones
		InterfazMenu intMenu = new ImplMenu();
		InterfazAlumno intAlumno = new ImplAlumno();
		
		// Creamos una lista para guardar los alumnos (base de datos)
		List<Alumno> listaBD = new ArrayList<>();
		
		// Bucle donde pediremos una opción del menu y haremos las operaciones necesarias
		int opcion;
		do {
			opcion = intMenu.Menu(); // Guardamos la opcion escogida
			
			// Switch para hacer las operaciones pedidas
			switch (opcion) {
				case 1:
					// Crear alumno
					listaBD = intAlumno.crearAlumno(listaBD);
					break;
				case 2:
					// Borrar alumno
					listaBD = intAlumno.borrarAlumno(listaBD);
					break;
				case 3:
					// Listar alumnos con su portátil (identificador)
					intAlumno.listarAlumnos(listaBD);
					break;
			}
		} while (opcion != 0);
	}

}
