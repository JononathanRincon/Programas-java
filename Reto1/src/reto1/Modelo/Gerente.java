package Reto1.Modelo;

public class Gerente extends Empleado{
    private int cantidadSubordinados;

    public Gerente(int cantidadSubordinados, float salario, String puestoTrabajo, int idPersona, String nombrePersona, String apellidos, String tipoDocumento, String documento, String correo) {
        super(salario, puestoTrabajo, idPersona, nombrePersona, apellidos, tipoDocumento, documento, correo);
        this.cantidadSubordinados = cantidadSubordinados;
    }

    public Gerente() {
    }

    public int getCantidadSubordinados() {
        return cantidadSubordinados;
    }

    public void setCantidadSubordinados(int cantidadSubordinados) {
        this.cantidadSubordinados = cantidadSubordinados;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona +", correo=" + correo  + "salario=" + salario + ", puestoTrabajo=" + puestoTrabajo + "cantidadSubordinados=" + cantidadSubordinados + '}';
    }
}
