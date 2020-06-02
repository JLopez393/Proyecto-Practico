/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import javax.swing.table.DefaultTableModel;
import Objetos.*;
import Connections.*;
import static Connections.Procedimientos.entradaEmisor;
import static Connections.Procedimientos.entradaReceptor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel datos = new DefaultTableModel();
    String tipoTabla;
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        cOpcion = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tableDatos);

        cOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emisor", "Receptor", "Detalle Compra" }));
        cOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cOpcionActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Importar Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exportar Archivo");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Ingresar Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Operations.importar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void setModeloPersona(){
        String[] titulos = {"Nombre","Apellido","NIF","Domicilio"};
        datos.setColumnIdentifiers(titulos);
        tableDatos.setModel(datos);
    }
    private void setModeloCompra(){
        String[] titulos = {"No","Cantidad","Descripcion","Precio Unitario", "Descuentos", "Total", "Impuestos"};
        datos.setColumnIdentifiers(titulos);
        tableDatos.setModel(datos);
    }
    
    private void setDatos(){
        Object[] dato = new Object[datos.getColumnCount()];
        if(tipoTabla.equals("Emisor")){
            for (Emisor emisor: Operations.arregloE){
                dato[0] = emisor.getNombre();
                dato[1] = emisor.getApellido();
                dato[2] = emisor.getNIF();
                dato[3] = emisor.getDomicilio();
                datos.addRow(dato);
                Procedimientos.datosPersona(tipoTabla, emisor.getNombre(), emisor.getApellido(), emisor.getNIF(), emisor.getDomicilio());
            }
        }else if (tipoTabla.equals("Receptor")){
            for (Receptor receptor: Operations.arregloR){
                dato[0] = receptor.getNombre();
                dato[1] = receptor.getApellido();
                dato[2] = receptor.getNIF();
                dato[3] = receptor.getDomicilio();
                datos.addRow(dato);
                Procedimientos.datosPersona(tipoTabla, receptor.getNombre(), receptor.getApellido(), receptor.getNIF(), receptor.getDomicilio());
            }
        }else {
            
            for (Compra compra: Operations.arregloC){
                dato[0] = compra.getNo();
                dato[1] = compra.getCantidad();
                dato[2] = compra.getDescripcion();
                dato[3] = compra.getpUnitario();
                dato[4] = compra.getDescuentos();
                dato[5] = compra.getTotal();
                dato[6] = compra.getImpuestos();
                datos.addRow(dato);
                Procedimientos.datosCompra(compra.getNo(), compra.getCantidad(), compra.getDescripcion(), compra.getpUnitario(), compra.getDescuentos(), compra.getTotal(), compra.getImpuestos());
            }
        }
        tableDatos.setModel(datos);
    }
    
    private void cOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cOpcionActionPerformed
        datos.setRowCount(0);
        String opc = cOpcion.getSelectedItem().toString();
        tipoTabla = opc;
        if(opc.equals("Emisor")){
            setModeloPersona();
        }else if(opc.equals("Receptor")){
            setModeloPersona();
        }else if(opc.equals("Detalle Compra")){
            setModeloCompra();
        }
        setDatos();
        System.out.println(cOpcion.getSelectedItem());
    }//GEN-LAST:event_cOpcionActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Formulario form = new Formulario();
        form.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Connections.SQLConnection.getConexion();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cOpcion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    // End of variables declaration//GEN-END:variables
}