package Modelo.DAO;
import java.sql.*;
import Utilidades.*;
public class ComprasDeLiderDao {

    public static ResultSet consulta_lider(){

        Statement stmt=null;
        ResultSet rs = null;
        String csql="SELECT l.Nombre||' '||l.Primer_Apellido||' ' ||l.Segundo_Apellido  as LIDER,SUM(c.Cantidad*m.Precio_Unidad)  as VALOR  FROM Proyecto p JOIN Lider l on p.ID_Lider  =l.ID_Lider JOIN Compra c on c.ID_Proyecto =p.ID_Proyecto JOIN MaterialConstruccion m on m.ID_MaterialConstruccion = c.ID_MaterialConstruccion GROUP BY LIDER  ORDER BY VALOR DESC  LIMIT 10";


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
