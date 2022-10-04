package Modelo.DAO;
import java.sql.*;
import Utilidades.*;
public class ProyectoBancoDao {

    public static ResultSet consulta(String banco){

        Statement stmt=null;
        ResultSet rs = null;
        String csql="SELECT p.ID_Proyecto as ID,p.Constructora ,p.Ciudad ,p.Clasificacion ,t.Estrato, l.Nombre||' '||l.Primer_Apellido||' ' ||l.Segundo_Apellido  as LIDER FROM Proyecto p   INNER JOIN Tipo t  ON (p.ID_Tipo  = t.ID_Tipo) INNER JOIN Lider l ON (p.ID_Lider  = l.ID_Lider ) WHERE p.Banco_Vinculado = '"+banco+"' ORDER BY p.Fecha_Inicio DESC  , p.Ciudad ASC , p.Constructora  ;";


        try {
            var conn=JDBCUtilities.getConnection();
            
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

            

        
            
        } catch (Exception e) {
            //TODO: handle exception
        }


        return rs;
    }
    
}
