import java.io.PrintStream;

public class QuitarVocales {
    
    public static void main(String[] args) {
        if(args.length==1){//Obligatorio que reciba un único argumento.
            String palabra=args[0];
            System.out.println(quitarVocales(palabra)); //devuelve por la salida estándar la palabra sin vocales.
            System.exit(0);
        }else{//Si los argumentos no son validos
            System.exit(-1);
        }
    }

    //Método que devuelve la cadena que se le pasa pero sin las vocales, mayusculas o minusculas.
    static String quitarVocales(String palabra){
        final String[] vocalesMayusculas = new String[]{"A","E","I","O","U"};
        final String[] vocalesMinusculas = new String[]{"a","e","i","o","u"};

        String palabraSinVocales="";//almacena el resultado



        //Variable usada dentro del bucle//
        boolean vocal=false;
        String letra="";    
        for(int i=0;i<palabra.length();i++){//RECORRE CADA LETRA DE LA PALABRA
            vocal=false;
            letra=Character.toString( palabra.charAt(i));

            //Recorre las vocales para averigual si la letra de la palabra es una vocal o no.
            for (int j=0;j<vocalesMinusculas.length;j++){

                if(letra.equals(vocalesMinusculas[j])||letra.equals(vocalesMayusculas[j])){
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
