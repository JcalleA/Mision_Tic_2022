package Main;
import Main.view.ReportesView;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var reportesView = new ReportesView();
        var banco = "Conavi"; 
        reportesView.proyectosFinanciadosPorBanco(banco);
    }
}
