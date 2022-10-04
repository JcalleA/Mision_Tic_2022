import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

import Modelo.VO.ProyectoBancoVo;
import Vista.*;


public class App {
    public static void main(String[] args) throws Exception {

        //ventana
        JFrame ventana1= new JFrame("Vista consultas");
        ventana1.setSize(800, 500);
        
        

        //contenedor

        ventana1.setContentPane(new JLabel(new ImageIcon("src/imagenes/fondo1.png")));

        

        
        
        
        

        //bara

        JMenuBar menuBar1= new JMenuBar();
        JMenu menu1= new JMenu("archivo");
        JMenu menu2= new JMenu("Ayuda");
        JMenu menu3= new JMenu("Editar");
        JMenuItem submenu1= new JMenuItem("guardar como");
        JMenuItem submenu2= new JMenuItem("Abrir");
        JMenuItem submenu3= new JMenuItem("Cortar");

        menu1.add(submenu2);
        menu2.add(submenu1);
        menu3.add(submenu3);

        menuBar1.add(menu1);
        menuBar1.add(menu2);
        menuBar1.add(menu3);

        ventana1.getContentPane().add(BorderLayout.NORTH,menuBar1);


        JPanel panel1 = new JPanel();


        //boton
        JLabel label1= new JLabel("Resultado de consulta");
        panel1.add(label1);

        JTextField texto1 = new JTextField(10);
        panel1.add(texto1);

        JButton boton1= new JButton("Consultar");
        panel1.add(boton1);
        JButton boton2= new JButton("Salir");
        panel1.add(boton2);

        ventana1.getContentPane().add(BorderLayout.SOUTH,panel1);

        JTextArea text2= new JTextArea();

        


        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setVisible(true);

        //label

        


    }
}
