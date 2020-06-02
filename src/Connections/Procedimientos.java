
package Connections;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Procedimientos {
    private static String nombre1, apellido1,nif1, domicilio1, desc1;
    private static int no1, cantidad1,descuentos1, impuestos1;
    private static float precio1, total1;
    
   //Proceso almacenado para llenar la tabla Emisor
    public static void entradaEmisor() throws SQLException{
        CallableStatement entrada = SQLConnection.getConexion().prepareCall("{call EntradaEmisor(?,?,?,?)}");
        entrada.setString(1, nombre1);
        entrada.setString(2, apellido1);
        entrada.setString(3, nif1);
        entrada.setString(4, domicilio1);
        entrada.execute();
    }
    //Proceso almacenado para llenar la tabla Receptor
    public static void entradaReceptor() throws SQLException{
        CallableStatement entrada = SQLConnection.getConexion().prepareCall("{call EntradaReceptor(?,?,?,?)}");
        entrada.setString(1, nombre1);
        entrada.setString(2, apellido1);
        entrada.setString(3, nif1);
        entrada.setString(4, domicilio1);
        entrada.execute();
    }
    //Proceso almacenado para llenar la tabla Compra
    public static void entradaCompra() throws SQLException{
        CallableStatement entrada = SQLConnection.getConexion().prepareCall("{call EntradaCompra(?,?,?,?,?,?,?)}");
        entrada.setInt(1, no1);
        entrada.setInt(2, cantidad1);
        entrada.setString(3, desc1);
        entrada.setFloat(4, precio1);
        entrada.setInt(5, descuentos1);
        entrada.setFloat(6, total1);
        entrada.setInt(7, impuestos1);
        entrada.execute();
    }
    //Se recopilan los datos desde interfaz.java para luego mandarlos al proceso almacenado correspondiente
    public static void datosPersona(String tipo, String nombre, String apellido, String nif, String domicilio){
        nombre1 = nombre;
        apellido1 = apellido;
        nif1 = nif;
        domicilio1 = domicilio;
        if (tipo.equals("Receptor")){
            try {
                entradaReceptor();
            } catch (SQLException ex) {
                Logger.getLogger(Procedimientos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                entradaEmisor();
            } catch (SQLException ex) {
                Logger.getLogger(Procedimientos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //Se recopilan los datos desde interfaz.java para luego mandarlos al proceso almacenado correspondiente
    public static void datosCompra(int no, int cantidad, String desc, float precio, int descuentos, float total, int impuestos){
        no1 = no;
        cantidad1 = cantidad;
        desc1 = desc;
        precio1 = precio;
        descuentos1 = descuentos;
        total1 = total;
        impuestos1 = impuestos;        
        try {
            entradaCompra();
        } catch (SQLException ex) {
            Logger.getLogger(Procedimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
