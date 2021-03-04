package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Preguntas extends Thread{

    private String pregunta;
    private ArrayList<String> preguntas = new ArrayList<>();
    static int index = 0;
    JLabel lbl;
    
    public Preguntas(String pregunta) {
        this.pregunta = pregunta;
    }

    public Preguntas(JLabel label) {
        lbl = label;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }
    
    public void mostrarPregunta(JLabel lbl, int index){
        lbl.setText(preguntas.get(index));
    }

    
    public void agregarPreguntas(){
        preguntas.add("¿A qué autor colombiano pertenece esta obra?");
        preguntas.add("¿En qué año nació Gabriel García Márquez?");
        preguntas.add("¿Quién es el creador de los Simpson?");
        preguntas.add("¿En qué año se posesionó el papa Francisco?");
        preguntas.add("¿Quién ordenó la construcción del Arco del Triunfo?");
    }
    
    @Override
    public void run(){
        try {
            for(int i = 0 ; i < preguntas.size() ; i++){
                mostrarPregunta(lbl, i);
                Thread.sleep(6000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
