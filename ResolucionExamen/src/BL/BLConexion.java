package BL;
import DAT.DATConexion;
import java.sql.SQLException;

public class BLConexion 
{
    //para poder acceder a paquete DAT
    DATConexion ManejadorConexion = new DATConexion();
    public void CerrarConexion() throws SQLException
    {
        ManejadorConexion.CerrarConexion();
    }
}