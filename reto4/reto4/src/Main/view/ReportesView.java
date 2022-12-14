package Main.view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Main.Model.vo.ProyectoBancoVo;
import Main.controller.ReportesController;


public class ReportesView {

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }
        public void proyectosFinanciadosPorBanco(String banco) {
        System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
        + repitaCaracter('=', 37));
        if (banco != null && !banco.isBlank()) {
        System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
        "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
        System.out.println(repitaCaracter('-', 105));
        try {
            
            }
        } catch (Exception ex) {
            
        }


        
        //TODO Imprimir en pantalla la información del proyecto
        }
        }
        public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior) {
        System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
        + repitaCaracter('=', 1));
        if (limiteInferior != null) {
        System.out.println(String.format("%3s %15s", "ID", "VALOR "));
        System.out.println(repitaCaracter('-', 29));
        //TODO Imprimir en pantalla la información del total adeudado
        }
        }
        public void lideresQueMasGastan() {
        System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "LIDER", "VALOR "));
        System.out.println(repitaCaracter('-', 41));
        //TODO Imprimir en pantalla la información de los líderes
        }
       
    
}
