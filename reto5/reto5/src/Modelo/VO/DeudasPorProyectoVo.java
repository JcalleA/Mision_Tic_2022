package Modelo.VO;
import java.sql.*;
import Modelo.DAO.*;
public class DeudasPorProyectoVo {

    public static void valor_deudas(double limiteInferior){

        try {
           
            ResultSet rs = DeudasPorProyectoDao.consulta_deudas(limiteInferior);
            
           

            while(rs.next()){
                int id=rs.getInt("ID_Proyecto");
                float valor=rs.getInt("VALOR");
                

                System.out.println(String.format("%3d %,15.1f", id, valor));

            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
