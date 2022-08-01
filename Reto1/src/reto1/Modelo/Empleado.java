package Reto1.Modelo;

public class Empleado extends Persona{
    protected float salario;
    protected String puestoTrabajo;

    public Empleado(float salario, String puestoTrabajo, int idPersona, String nombrePersona, String apellidos, String tipoDocumento, String documento, String correo) {
        super(idPersona, nombrePersona, correo);
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    public Empleado() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", correo=" + correo  + "salario=" + salario + ", puestoTrabajo=" + puestoTrabajo + '}';
    }
}
