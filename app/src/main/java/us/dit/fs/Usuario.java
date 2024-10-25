package us.dit.fs;

import java.time.LocalDate;

/**
 * Clase POJO que representa un usuario con DNI, nombre, fecha de nacimiento y
 * sueldo.
 */
public class Usuario {

	// Campos privados
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private double sueldo;

	// Constructor vacío
	public Usuario() {
	}

	// Constructor con parámetros
	public Usuario(String dni, String nombre, LocalDate fechaNacimiento, double sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
	}

	// Getters y setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// Método toString para representar el objeto como cadena
	@Override
	public String toString() {
		return "Usuario{" + "dni='" + dni + '\'' + ", nombre='" + nombre + '\'' + ", fechaNacimiento=" + fechaNacimiento
				+ ", sueldo=" + sueldo + '}';
	}
}
