package modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon; //cargar imagenes
import java.util.Timer;
import java.util.TimerTask; //el tiempo de ejecuccion
import vista.Vista_Imagenes;

public class Imagen {

    static int contador = 0;

    public static void cambiarImagen() {

        int velocidad = 2; //segundos
        Timer timer; //instancia
        TimerTask ejecutar;

        int velmil = velocidad * 1000;

        Vista_Imagenes imagenes = new Vista_Imagenes(); // se llama al jlbel
        imagenes.setVisible(true);

        ejecutar = new TimerTask() {

            @Override
            public void run() {

                Icon imagen; //instancia de imagen 
                    switch (contador) {

                        case 0:
                            contador = 1;
                            imagen = new ImageIcon(getClass().getResource("/imagenes/autor.png")); //se declara la imagen
                            imagenes.Imgen_botero.setIcon(imagen); // de la instancia imagenes se cambia el jlabel
                            break;

                        case 1:

                        contador = 2;
                        imagen = new ImageIcon(getClass().getResource("/imagenes/maravillas.png")); //se declara la imagen
                        imagenes.Imgen_botero.setIcon(imagen); // de la instancia imagenes se cambia el jlabel
                        break;
                        
                         case 2:
                       
                        imagen = new ImageIcon(getClass().getResource("/imagenes/papa.png")); //se declara la imagen
                        imagenes.Imgen_botero.setIcon(imagen); // de la instancia imagenes se cambia el jlabel
                        break;
                        
                        case 3:
                        contador = 0;
                        imagen = new ImageIcon(getClass().getResource("/imagenes/triunfo.png")); //se declara la imagen
                        imagenes.Imgen_botero.setIcon(imagen); // de la instancia imagenes se cambia el jlabel
                        break;
                        
                        default:
                            System.out.println("No se pudo cargar imágen");
                    }
                }
            
            
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(ejecutar, velmil, velmil); //peridodo de repeticion

    }

}
