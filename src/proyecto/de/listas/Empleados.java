/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.de.listas;

/**
 *
 * @author Maria Belen
 */
public class Empleados {
    
        private String Cedula;

    Empleados(String string, String belen_Indacochea, String manta, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of Cedula
     *
     * @return the value of Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * Set the value of Cedula
     *
     * @param Cedula new value of Cedula
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    private String Ciudad;

    /**
     * Get the value of Ciudad
     *
     * @return the value of Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * Set the value of Ciudad
     *
     * @param Ciudad new value of Ciudad
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    private int Edad;

    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    private double Sueldo;

    /**
     * Get the value of Sueldo
     *
     * @return the value of Sueldo
     */
    public double getSueldo() {
        return Sueldo;
    }

    /**
     * Set the value of Sueldo
     *
     * @param Sueldo new value of Sueldo
     */
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    private String Departamento;

    /**
     * Get the value of Departamento
     *
     * @return the value of Departamento
     */
    public String getDepartamento() {
        return Departamento;
    }

    /**
     * Set the value of Departamento
     *
     * @param Departamento new value of Departamento
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Empleados(String Cedula, String Nombre, String Ciudad, int Edad, double Sueldo, String Departamento) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
        this.Departamento = Departamento;
    }

}


