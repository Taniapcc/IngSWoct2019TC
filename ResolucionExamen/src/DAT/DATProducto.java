package DAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hacve el CRUD
public class DATProducto 
{
    DATConexion c = new DATConexion();
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();//obj para poder manipular abre coneccion y crea unStatement 
        String Sentencia = "SELECT * FROM producto";//crea un a varible y ponermos la cadena para recuperar todo desde la BDD
        ResultSet rs = st.executeQuery(Sentencia);//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();//crea un puente entre la conexion
        String Sentencia = "SELECT * FROM producto WHERE ID = " + Id ;
        ResultSet rs = st.executeQuery(Sentencia);//guardo en ResultSet los datos de st que consulta
        return rs;
    }
    public int Insertar (String codigo,String descripcion,int cantidad,int precioU,int pvp, String fechaIngreso,String fechaModificacion) throws SQLException, ClassNotFoundException{
        int retorno=0;
        Statement st=c.AbrirConexion().createStatement();
        String sentencia="INSERT INTO producto (codigo, descripcion, cantidad, p_unitario, pvp, fecha_ingreso,fecha_modificacion) VALUES ("
                     +"'" +codigo+ "'" 
                +","+ "'" +descripcion+ "'" 
                +","+ "'" +cantidad+   "'"
                +","+ "'" +precioU+    "'" 
                +","+ "'" +pvp+       "'" 
                +","+ "'" +fechaIngreso+"'" 
                +","+"'"+fechaModificacion+"'"+")";
        retorno =st.executeUpdate(sentencia);
        return retorno;
        
    }
     public int Eliminar(String strCodigo) throws SQLException, ClassNotFoundException{
        int intRetorno=0;//declarmos
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "DELETE FROM producto WHERE codigo="+"'"+strCodigo+"'";//"'" porque es de tipo String se cierra entre comllias
        intRetorno = st.executeUpdate(Sentencia);
        c.CerrarConexion();
        return intRetorno;
    }
      public int Modificar(String strNActual,String strdescription) throws ClassNotFoundException, SQLException{
         int Retorno=0;
         Statement st=c.AbrirConexion().createStatement();
         String sentencia="UPDATE producto SET descripcion="+"'"+strNActual+"'"+"WHERE descripcion="+"'"+strdescription+"'";
         Retorno=st.executeUpdate(sentencia);
         c.CerrarConexion();
         return Retorno;
}
}
