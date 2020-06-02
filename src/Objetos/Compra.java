
package Objetos;

public class Compra {
    private int No;
    private int cantidad;
    private String Descripcion;
    private float pUnitario;
    private int descuentos;
    private float total;
    private int impuestos;
    
    public Compra(int No, int cantidad, String Descripcion, float pUnitario, int descuentos, float total, int impuestos){
        this.No = No;
        this.cantidad = cantidad;
        this.Descripcion = Descripcion;
        this.pUnitario = pUnitario;
        this.descuentos = descuentos;
        this.total = total;
        this.impuestos = impuestos;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }
    
}
