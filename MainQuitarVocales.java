import java.io.IOException;
import java.util.Scanner;
import java.io.*;

//Pide una palabra por el teclado, hay una tuberia de entrada y otra de salida
public class MainQuitarVocales {
    public static void main(String[] args) {
        String palabra="";
        String palabraSinVocales="";

        ProcessBuilder pb = new ProcessBuilder("java","QuitarVocales");
        try {
            Process p = pb.start();
            

            //Pide una palabra por el teclado
            System.out.println("Introduce una palabra.");


            Scanner tecladoPalabra = new Scanner(System.in);
            palabra=tecladoPalabra.nextLine();
            tecladoPalabra.close();



            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
                bw.write(palabra);//BufferedWriter me permite indicarle el String directamente.
            bw.close();



            //Recibe la salida estandar del proceso p
            Scanner scQuitarVocales = new Scanner(p.getInputStream());
                palabraSinVocales=scQuitarVocales.nextLine();
                scQuitarVocales.close();
                System.out.print(palabraSinVocales);
                
            
            




        } catch (IOException e) {
            e.printStackTrace();
        }





        
    }
}
