
package Modulo;

import static Vista.Index.VentanaPrincipal;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Artificios {
    
//    public static void main(String args[]) throws FileNotFoundException { 
//        
//    }

    
    
    // FECHA ACTUAL
    public String FechaHora() {
        String fecha;
        Calendar calendar = new GregorianCalendar();
        fecha = calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DAY_OF_MONTH)+" "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
        
        return fecha;
    }
    
    // FECHA ACTUAL
    public String Fecha() {
        String fecha;
        Calendar calendar = new GregorianCalendar();
        fecha = calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DAY_OF_MONTH);
        
        return fecha;
    }
    
    // FORMATO DE NUMEROS DECIMALES
    public double formato(double numero){
        double num;
        num = (double)Math.round(numero*100)/100;
        return num;
    }
    
    // ####################### LECTURA Y ESCRITURA DE ARCHIVOS ########################
    // Creacion de archivos
    public void crearArchivos(String archivo) throws FileNotFoundException{
        File fl = new File(archivo);
        
        try
        {
            PrintWriter pw = new PrintWriter(fl);
            pw.close();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erroe al crear archivo");
        }
        
    }
    
    // Escritura de archivos xtx
    public void escribirArchivo(String archivo, String texto){
        File fl = new File(archivo);
        try
        {
            PrintWriter pw = new PrintWriter(new FileWriter(fl,true));
            pw.println(texto);
            pw.close();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erroe al escribir archivo");
        }
    }
    
    // Lectura de archivos txt
    public String leerArchivo(String archivo){
        File fl = new File(archivo);
        String texto = "";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String leer = br.readLine();
            while (leer != null)
            {
                texto = leer;
                leer = br.readLine();
            }
            
            br.close();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erroe al leer archivo");
        }
        return texto;
    }
    
    // Eliminar archivos txt
    public void eliminarArchivos(String archivo){
        File fl = new File(archivo);
        
        try
        {
            if (fl.exists())
            {
                fl.delete();
            } else
            {
                JOptionPane.showMessageDialog(null,"No existe archivo usuario");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        
        
    }
    
    
    // Centrar ventanas
    public void CentrarVentana(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width - Dframe.width) / 2, (dimension.height - Dframe.height) / 2);
        frame.show();
    }
    
    // Ajustar imagen
    public void ajustarImagen(JLabel labelName, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        
    }
    
}
