
package Clases;

/**
 *
 * @author Michael
 */
public class Productos {
    private String strCodigo;
    private String strDescripcion;
    private int intCantidad;
    private int intPrecioU;
    private int intPVP;
    private String strFechaIngreso;
    private String strFechaM;

    public Productos() {
    }

    public Productos(String strCodigo, String strDescripcion, int intCantidad, int intPrecioU, int intPVP, String strFechaIngreso, String strFechaM) {
        this.strCodigo = strCodigo;
        this.strDescripcion = strDescripcion;
        this.intCantidad = intCantidad;
        this.intPrecioU = intPrecioU;
        this.intPVP = intPVP;
        this.strFechaIngreso = strFechaIngreso;
        this.strFechaM = strFechaM;
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public int getIntCantidad() {
        return intCantidad;
    }

    public int getIntPrecioU() {
        return intPrecioU;
    }

    public int getIntPVP() {
        return intPVP;
    }

    public String getStrFechaIngreso() {
        return strFechaIngreso;
    }

    public String getStrFechaM() {
        return strFechaM;
    }
    public int CompraProdutos(int cantidad){
        int total=0;
        if(this.getIntCantidad()>0){
          total=this.getIntCantidad()-cantidad;    
        }else{
            System.out.println("NO HAY PRODUCTO");
        total=this.getIntCantidad();
    }
     return total;   
    }
    
}
