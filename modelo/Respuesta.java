package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public final class Respuesta extends Thread {

    private String respuesta;
    private boolean correcto;
    private ArrayList<ArrayList> answer = new ArrayList<>();
    private final ArrayList<String> r1 = new ArrayList<>();
    private final ArrayList<String> r2 = new ArrayList<>();
    private final ArrayList<String> r3 = new ArrayList<>();
    private final ArrayList<String> r4 = new ArrayList<>();
    private final ArrayList<String> r5 = new ArrayList<>();
    JButton btn1, btn2, btn3;
    static int index = 0;
    int contador = 0;

    public Respuesta(JButton bt1, JButton bt2, JButton bt3) {
        agregarRespuestas(r1, "Fernando Botero", "Alejandro Obregon", "Omar Rayo");
        agregarRespuestas(r2, "1932", "1935", "1927");
        agregarRespuestas(r3, "Steven Spielberg", "Matt Groening", "Mark Zuckenberg");
        agregarRespuestas(r4, "2009", "2013", "2012");
        agregarRespuestas(r5, "Napoleón", "Julio César", "Uribe");
        btn1 = bt1;
        btn2 = bt2;
        btn3 = bt3;

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

    public void mostrarRespuestas(JButton jb1, JButton jb2, JButton jb3, ArrayList<String> res) {
        jb1.setText(res.get(0));
        jb2.setText(res.get(1));
        jb3.setText(res.get(2));
    }

    @Override
    public String toString() {
        return respuesta;
    }

    @Override
    public void run() {
        try {
            for (ArrayList arrayList : answer) {

                mostrarRespuestas(btn1, btn2, btn3, arrayList);
                Thread.sleep(6000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Respuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
