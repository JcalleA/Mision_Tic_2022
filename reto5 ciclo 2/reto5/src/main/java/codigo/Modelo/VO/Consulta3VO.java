package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;

import java.sql.*;
import java.util.ArrayList;

public class Consulta3VO {

    public static ArrayList<String[]> valores3(){

        ResultSet rs = null;
        ArrayList<String[]> salida = new ArrayList<String[]>();
        try {

            rs=Consulta3DAO.consulta3();
            while (rs.next()) {
                
                int ID=rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                salida.add(new String[]{ID+"", constructora, banco});
                
               
                
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida;


    }
    
}
