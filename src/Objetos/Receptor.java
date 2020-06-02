
package Objetos;


public class Receptor {

    private String nombre;
    private String apellido;
    private String NIF;
    private String domicilio;
    
    public Receptor(String nombre, String apellido, String NIF, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.domicilio = domicilio;
    }
    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
}
