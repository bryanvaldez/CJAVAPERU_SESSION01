package cjava.pruebas;

import java.io.IOException;

public class Prueba01 {
    public static void main(String[] args) throws IOException {
        try {
            Runtime.getRuntime().exec("calc");
        }catch(IOException ex){
            System.out.println("Comando equivocado");
        }
    }
    
}
