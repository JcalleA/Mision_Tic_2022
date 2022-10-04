package Modelo.VO;
import java.sql.*;
import Modelo.DAO.*;

public class ComprasDeLiderVo {

    public static void compras_lider (){
        try {
           
            ResultSet rs = ComprasDeLiderDao.consulta_lider();
            
            
            while(rs.next()){
                String lider=rs.getString("LIDER");
                float valor=rs.getInt("VALOR");
                

                System.out.println(String.format("%-25s %,15.1f", lider, valor));

            }

        } catch (Exception e) {
            //TODO: handle exception
        }


    }
    
}
