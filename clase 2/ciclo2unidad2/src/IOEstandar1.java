import java.io.*;
public class IOEstandar1 {

    public static void main (String[] args) throws Exception {
        leer_archivo();

    }
    public static void ent_sali(){
        int numeBytes=0;
        char caracter;
        System.out.println("\n Escribe text0: ");
        try{
            do{
                caracter =(char)System.in.read();
                System.out.println(caracter);
                numeBytes++;
            }while(caracter!='\n');
        }catch(IOException e){
            System.err.println(e);
            }
    
    }
    
    public static void leer_archivo(){
        var f=new File("texto1.txt");
        System.out.println("pathSeparador: "+File.pathSeparator);
        System.out.println("Separador: "+File.separator);
        System.out.println("pathSeparador letra: "+File.separatorChar);

    }
}
