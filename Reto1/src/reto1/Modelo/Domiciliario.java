package Reto1.Modelo;

public class Domiciliario extends  Empleado{
    private String tipoTransporte;

    public Domiciliario(String tipoTransporte, float salario, String puestoTrabajo, int idPersona, String nombrePersona, String apellidos, String tipoDocumento, String documento, String correo) {
        super(salario, puestoTrabajo, idPersona, nombrePersona, apellidos, tipoDocumento, documento, correo);
        this.tipoTransporte = tipoTransporte;
    }

    public Domiciliario() {
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona +", correo=" + correo  + "salario=" + salario + ", puestoTrabajo=" + puestoTrabajo + "tipoTransporte=" + tipoTransporte + '}'; 
    }
}
