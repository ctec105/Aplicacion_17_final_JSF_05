package pe.edu.aprender.managed;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import pe.edu.aprender.entity.Empleado;

@ManagedBean(name = "formulario")
public class FormularioBean {

	/*
	 * Creamos una variable de instancia de tipo �Empleado� y una lista de
	 * empleados con sus respectivos getter/setter.
	 */
	private Empleado empleado = new Empleado();
	private List<Empleado> empleados;

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	// A�adimos un Action Method
	public String procesar() {
		// Obtener texto desde un Bundle para efectos de manejar i18N
		ResourceBundle resourceBundle = ResourceBundle.getBundle(
				"pe.edu.aprender.recursos.textos", FacesContext
						.getCurrentInstance().getViewRoot().getLocale());
		FacesMessage facesMessage = new FacesMessage(
				resourceBundle.getString("mensaje_registro_exitoso"));
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		// return a la pagina resultado.xhtml
		return "resultado"; 
	}

	// A�adimos un Action Method
	public String listar() {
		empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado(1, "Ramirez", "Jorge"));
		empleados.add(new Empleado(2, "Gomez", "Maria"));
		empleados.add(new Empleado(3, "Rodriguez", "Lucia"));
		return "listado";
	}
}