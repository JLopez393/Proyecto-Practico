
package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class SQLConnection {
    static Connection contacto = null;
    public static boolean status = false;
    
    public static Connection getConexion(){
        //Autenticacion de SQL
        String usuario = "admin";
        String pass = "admin";
        status = false;
        //Url de base de datos
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ProyectoP";
        try {
            //Driver de conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(url, usuario, pass);
            status = true;
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
}
