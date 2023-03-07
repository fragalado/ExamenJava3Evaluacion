package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Alumno;

/**
 * Interfaz que define a los métodos que darán servicio a la clase Alumno
 * @author csi22
 *
 */
public interface InterfazAlumno {
	
	/**
	 * Método que devuelve una lista de tipo Alumno actualiza, con un nuevo alumno creado
	 * @param listaBD
	 * @return
	 */
	public List<Alumno> crearAlumno(List<Alumno> listaBD);
	
	/**
	 * Método que devuelve una lista de tipo Alumno  actualizada, con un alumno borrado
	 * @param listaBD
	 * @return
	 */
	public List<Alumno> borrarAlumno(List<Alumno> listaBD);
	
	/**
	 * Método que muestra por consola los alumnos con su:
	 * id, nombre, apellidos, telefono, identificador portatil
	 * @param listaBD
	 */
	public void listarAlumnos(List<Alumno> listaBD);
}
