package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Boleto;
import proyect_clases.Pasajero;
import proyect_clases.Usuario;
import proyect_gui.GUI_Principal;

public class MetodoBoleto {
    Vector vPrincipal = new Vector();
    
    
    Vector v1 = new Vector();
    
    public void crearBoleto(Boleto unBoleto) {
        
        //FALTA
        
    }
    
    public void guardarBoleto(Boleto unBoleto) {
        vPrincipal.addElement(unBoleto);
        
        
        
    }
    
    //guardar archivo txt
    public void guardarArchivoBoleto(Boleto boleto){
        
      try {
            FileWriter fw = new FileWriter (".\\Boleto.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(boleto.getNumero_boleto());
            pw.print("|"+boleto.getFecha_boleto());
            pw.print("|"+boleto.getHora_boleto());
            pw.print("|"+boleto.getCosto_boleto());
            pw.println("|"+boleto.getCedula());
            pw.println("|"+boleto.getIdRuta());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    public void BuscarBoleto(Usuario unUsuario){
        
        
        
      
        //FALTA
        
    }
    
}
