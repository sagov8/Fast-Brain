package modelo;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon; //cargar imagenes
import java.util.Timer;
import java.util.TimerTask; //el tiempo de ejecuccion
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Vista_Imagenes;

public class Imagen {

    static int contador = 0;

    public static void main(String[] args) {

        int velocidad = 10; //segundos
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4);
        Collections.shuffle(numbers);
        Timer timer; //instancia
        TimerTask ejecutar;

        int velmil = velocidad * 1000;

        Vista_Imagenes imagenes = new Vista_Imagenes(); // se llama al jlbel
        imagenes.setVisible(true);

        ejecutar = new TimerTask() {

            @Override
            public void run() {

                Icon imagen; //instancia de imagen 

                for (Integer numero : numbers) {
                    contador = numero;
                    System.out.println(contador);
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
                        default:
                            System.out.println("No se pudo cargar imagen");
                    }
                    
                }
            }
            
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(ejecutar, 10000, velmil); //peridodo de repeticion

    }

}
