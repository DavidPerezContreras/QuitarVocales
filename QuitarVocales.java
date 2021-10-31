import java.util.Scanner;

public class QuitarVocales {
    
    public static void main(String[] args) {
        if(args.length==0){//Obligatorio que no reciba argumentos
            Scanner sc = new Scanner(System.in);


            String palabra=sc.nextLine();
            System.out.println(quitarVocales(palabra)); //devuelve por la salida estándar la palabra sin vocales.
            System.exit(0);
        }else{//Si los argumentos no son validos
            System.exit(-1);
        }


        


    }

    //Método que devuelve la cadena que se le pasa pero sin las vocales, mayusculas o minusculas.
    static String quitarVocales(String palabra){
        final String[] VOCALESMAYUSCULAS = new String[]{"A","E","I","O","U"};
        final String[] VOCALESMINUSCULAS = new String[]{"a","e","i","o","u"};

        String palabraSinVocales="";    //almacena el resultado

        //Variables usadas dentro del bucle//
        boolean vocal=false;
        String letra="";    



        for(int i=0;i<palabra.length();i++){//RECORRE CADA LETRA DE LA PALABRA
            vocal=false;
            letra=Character.toString( palabra.charAt(i));

            //Recorre las vocales para averigual si la letra de la palabra es una vocal o no.
            for (int j=0;j<VOCALESMINUSCULAS.length;j++){

                if(letra.equals(VOCALESMINUSCULAS[j])||letra.equals(VOCALESMAYUSCULAS[j])){//Si es una vocal mayuscula o minuscula
                    vocal=true; //Si la letra es una vocal minuscula o vocal mayúscula, vocal=true
                    break;
                }
            }

            if(!vocal){ //si vocal es false, concatena la letra de esta vuelta
                palabraSinVocales+=letra;
            }

        }

        return palabraSinVocales;
    }




}
