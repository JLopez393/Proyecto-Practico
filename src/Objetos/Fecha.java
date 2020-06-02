package Objetos;

public class Fecha {

    private String lugar;
    private String fecha;
    
    public Fecha (String lugar, String fecha){
        this.lugar = lugar;
        this.fecha = fecha;
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
