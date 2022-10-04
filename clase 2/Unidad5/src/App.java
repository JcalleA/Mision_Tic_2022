import java.awt.BorderLayout;

import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame ventana1= new JFrame("Ventana 1");
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(500,500);

        ventana1.setVisible(true);

        JMenuBar mb= new JMenuBar();
        JMenu m1= new JMenu("Archivo");
        JMenu m2= new JMenu("Guardar");
        JMenuItem m11= new JMenuItem("open");
        JMenuItem m12= new JMenuItem("guardar como");
        m1.add(m11);
        m1.add(m12);


        mb.add(m1);
        mb.add(m2);

        ventana1.getContentPane().add(BorderLayout.NORTH,mb);


        JLabel lb01= new JLabel("Label 1");
        ventana1.add(lb01);
    }
}
