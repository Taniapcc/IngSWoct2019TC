package BL;
import Clases.Productos;
import DAT.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLProducto 
{
    DATProducto mp = new DATProducto();//Llama al clase DATEProdcutos crea un obj
    
    public static ArrayList lstProducto;
    DATConexion mcdata=new DATConexion();
    //Retorma tan solo una comlumna     que especifiquemos
    public ResultSet Consultar(int p_unitario) throws ClassNotFoundException, SQLException 
    {
        ResultSet rs = mp.Consultar(p_unitario);
        return rs;
    }
    public ArrayList<Productos> ConsultaLista() throws ClassNotFoundException, SQLException{
        int intIncremento =0;
        String codigo = "";
        String descripcion = "";
        String fechaIng="";
        String fechaMod="";
        int p_unitario = 0,pvp = 0,cantidad = 0;
        ResultSet rs;//recuper datos desde rs y los desgloso o desconpone
        lstProducto =new ArrayList<>();
        rs= mp.Consultar();
        ResultSetMetaData rm = rs.getMetaData();//descompogo todos los datos agrupaados desde la base de datos
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();//si hace o no la opreacion
        ArrayList<String> columns = new ArrayList<>();//arrayList que permite retorna solo las comlumnas de la BDD
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);//retorna una a una las columnas
            columns.add(columnName);
        }
        while(rs.next()){
            for(String columnName:columns){
                String value=rs.getString(columnName);
                if(columnName.equals("codigo"))
                    codigo=value;
                if(columnName.equals("descripcion"))
                    descripcion=value;
                if(columnName.equals("cantidad"))
                     cantidad=Integer.parseInt(value);
                if(columnName.equals("p_unitario"))
                    p_unitario=Integer.parseInt(value);
                if(columnName.equals("pvp"))
                    pvp=Integer.parseInt(value);
                 if(columnName.equals("fecha_ingreso"))
                    fechaIng=value;
                  if(columnName.equals("fecha_modificacion"))
                      fechaMod=value;
                  
            }
            try
            {
                Productos p=new Productos (codigo,descripcion,cantidad,p_unitario,pvp,fechaIng,fechaMod);
                lstProducto.add(p);
            }
            catch(Exception ex)
            {
                String msn = ex.getMessage();
            }
        }
        this.cerrarConexion();
        return lstProducto;
        
    }
    public int Insertar(ArrayList<Productos> list) throws SQLException, ClassNotFoundException{
        int retorno=0;
        for (int i = 0; i< list.size(); i++) {
            retorno=this.mp.Insertar(list.get(i).getStrCodigo(),list.get(i).getStrDescripcion(),
                    list.get(i).getIntCantidad(),list.get(i).getIntPrecioU(),
                    list.get(i).getIntPVP(),list.get(i).getStrFechaIngreso(),list.get(i).getStrFechaM());
        }
        this.cerrarConexion();
        return retorno;
    }
    public int Modificar(String strActual, String strDescripcion) throws ClassNotFoundException, SQLException{
        return mp.Modificar(strActual, strDescripcion);
        
    }
     public int Eliminar(String codigo) throws SQLException, ClassNotFoundException {
        return this.mp.Eliminar(codigo);
     }
    public void cerrarConexion() throws SQLException{
        mcdata.CerrarConexion();
    }
}
