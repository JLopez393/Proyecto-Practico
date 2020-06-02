/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import Objetos.*;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class Operations {
    public static ArrayList arreglo = new ArrayList();
    public static ArrayList<Fecha> arregloF = new ArrayList<>();
    public static ArrayList<Emisor> arregloE = new ArrayList<Emisor>();
    public static ArrayList<Receptor> arregloR = new ArrayList<Receptor>();
    public static ArrayList<Compra> arregloC = new ArrayList<Compra>();
    public static void importar(){
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                arreglo.add(entrada.nextLine());
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        llenarArreglos();
    }
    
    public static void llenarArreglos(){
        Iterator it = arreglo.iterator();
        String linea=null;
        String [] partes;
        String [] partesDatos;
        
        while(it.hasNext()){
            linea = it.next().toString();
            partes = linea.split(":");
            
            if (partes[0].equals("Fecha")){
                partesDatos = partes[1].split(",");
                Fecha fecha = new Fecha(partesDatos[0], partesDatos[1]);
                arregloF.add(fecha);
            }else if (partes[0].equals("Emisor")){
                partesDatos = partes[1].split(",");
                Emisor emisor = new Emisor(partesDatos[0],partesDatos[1],partesDatos[2],partesDatos[3]);
                arregloE.add(emisor);
            }else if (partes[0].equals("Receptor")){
                partesDatos = partes[1].split(",");
                Receptor receptor = new Receptor(partesDatos[0],partesDatos[1],partesDatos[2],partesDatos[3]);
                arregloR.add(receptor);
            }else if (partes[0].equals("Compra")){
                partesDatos = partes[1].split(",");
                Compra compra = new Compra(Integer.parseInt(partesDatos[0].trim()),Integer.parseInt(partesDatos[1].trim()),partesDatos[2],Float.parseFloat(partesDatos[3].trim()),Integer.parseInt(partesDatos[4].trim()),Float.parseFloat(partesDatos[5].trim()),Integer.parseInt(partesDatos[6].trim()));
                arregloC.add(compra);
            }
            
        }
  
    }
    
    public static String separa(String dato){
        String [] partes = dato.split(":");
        return partes[1];
    }
}

