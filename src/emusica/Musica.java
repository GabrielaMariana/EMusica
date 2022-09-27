/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package emusica;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Musica {
  

    public static void main(String[] args) {
public static String menu() {
        return """
               Bienvenido 
                desea ingresar la informacionde una cancion 
               s - si
               n - no
                """; 
}
        String opcion;
        String cadena;
        do{
           opcion = JOptionPane.showInputDialog(menu()); 
            switch (opcion) {
                case "s":
                    musc musica=new musc();
                    musica.getClass();
                    musica.getCult();
                    musica.getEdad();
                    musica.getEstanim();
                    musica.getExper();
                    musica.getGus();
                    musica.getSubje();
                    musica.getUbge();
                    System.out.println("");
                   
                    
                    DatosC dato=new DatosC();
                    dato.getTitulo();
                    dato.getArtista();
                    dato.getAlbum();
                    dato.getComp();
                    dato.getClass();
                    dato.getGenero();
                    dato.getDisq();
                    dato.getLanz();
                    System.out.println("");        
                            
                    break;
                case "n":
                    System.out.println("Desea finalizar el sistema");System.exit(0);
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "valor invalido");
            }
        }while(!"n".Musica(opcion);

    private static class opcion {

        public opcion() {
        }
    }
    }
}
