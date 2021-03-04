package modelo;

import java.util.ArrayList;

public class Respuesta {

    private String respuesta;
    private boolean correcto;
    private ArrayList<ArrayList> answer = new ArrayList<>();
    private ArrayList<String> r1 = new ArrayList<>();
    private ArrayList<String> r2 = new ArrayList<>();
    private ArrayList<String> r3 = new ArrayList<>();
    private ArrayList<String> r4 = new ArrayList<>();
    private ArrayList<String> r5 = new ArrayList<>();
    
    public Respuesta() {
        agregarRespuestas(r1, "1", "2","3");
    }

    public ArrayList<ArrayList> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<ArrayList> answer) {
        this.answer = answer;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public void agregarRespuestas(ArrayList<String> respuestas, String r1, String r2, String r3) {
        respuestas.add(r1);
        respuestas.add(r2);
        respuestas.add(r3);
        
        answer.add(respuestas);
    }

    @Override
    public String toString() {
        return respuesta;
    }
}
