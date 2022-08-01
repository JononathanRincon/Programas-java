
package Reto1.Modelo;


public class Persona {
    protected int idPersona;
    protected String nombrePersona;
    protected String correo;

    public Persona() {
    }

    public Persona(int idPersona, String nombrePersona, String correo) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.correo = correo;
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

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", correo=" + correo + '}';
    }
    
    
    
}
