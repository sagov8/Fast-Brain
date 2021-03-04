package modelo;

import java.util.ArrayList;

public class Preguntas {

    private String pregunta;
    ArrayList<String> preguntas = new ArrayList<>();

    private int valorPregunta = 2;
    private int puntaje = 0;
    
    public Preguntas(String pregunta) {
        this.pregunta = pregunta;
        agregarPreguntas();
    }
    
    public void agregarPreguntas(){
        preguntas.add("¿A qué autor colombiano pertenece esta obra");
        preguntas.add("¿En qué año nació Gabriel García Márquez?");
        preguntas.add("¿Quién es el creador de los Simpson?");
        preguntas.add("En qué año se posesionó el papa Francisco");
        preguntas.add("¿Quién fue el constructor del Arco del Triunfo?");
    }
}
