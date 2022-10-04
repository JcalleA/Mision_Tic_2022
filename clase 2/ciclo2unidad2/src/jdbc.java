import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        conexion();

    }

    public static Connection conexion(){
        Connection conn=null;
        String url="jdbc:sqlite:data.sqlite";
        try{
            conn=DriverManager.getConnection(url);
            if (conn!=null){
                System.out.println("Coneccion exitosa");
            }else{
            System.out.println("no hay Coneccion ");
            }
        }catch(Exception e){

        }
        return conn;
    }

    public static void leer(){
        var conn=conexion();
        Statement stmt=null;
        ResultSet rs=null;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql)
        }
    }

}