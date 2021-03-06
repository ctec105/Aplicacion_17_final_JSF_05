package pe.edu.aprender.entity;

import java.io.Serializable;

public class Casillero implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String descripcion;
	private Empleado empleado; // Relacio de 1 a 1

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Casillero [codigo=" + codigo + ", descripcion=" + descripcion + ", empleado=" + empleado + "]";
	}
	
}