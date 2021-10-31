import java.io.IOException;
import java.util.Scanner;

public class MainQuitarVocales {
    public static void main(String[] args) {
        
        final String palabra="David Perez Contreras";

        ProcessBuilder pb = new ProcessBuilder("java","QuitarVocales",palabra);
        try {
            Process p = pb.start();
            
            //
            Scanner sc = new Scanner(p.getInputStream());
            
            
                System.out.print(sc.nextLine());
                
            sc.close();


        } catch (IOException e) {
            e.printStackTrace();
        }





        
    }
}
