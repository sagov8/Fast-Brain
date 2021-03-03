
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Instrucciones extends javax.swing.JFrame implements Runnable { 

      Thread hilo_bomba; //hilo de ejecuccion
       int movimientoX_bomba = 50; //movimiento en X 
        boolean devolver= true;
        public Instrucciones() {
         // this.setLocationRelativeTo(null); //pantalla en el centro
        initComponents();
        
        hilo_bomba = new Thread(this);
        hilo_bomba.start(); // iniciar el hilo
        //distancia de hilo
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_INICIO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reglas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Bomba = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        INICIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT_INICIO.setBackground(new java.awt.Color(15, 175, 71));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 39, 175));
        jLabel1.setText("INSTRUCCIONES");

        Reglas.setBackground(new java.awt.Color(255, 204, 204));
        Reglas.setColumns(20);
        Reglas.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        Reglas.setRows(5);
        Reglas.setText("   \n   1- El jugador tendra 10 segundos para\n   visualizar las imagenes que se encuentran \n   en pantalla.\n   2- Su objetivo es observar cada detalle de la \n   imagen.\n   3- Las imagenes estan clasificadas en personajes \n   o lugares reconocidos.\n   4- El jugador tendra en cada imagen  \n   cuatro preguntas con una sola respuesta.\n   5-Gana el jugador que conteste correctamente las \n   preguntas.\n   6- El tiempo se medira con una bomba,\n   la cual si llega a su limite de 10s \n   explotara y el jugador perdera la partida");
        Reglas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(Reglas);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instrucciones.png"))); // NOI18N

        Bomba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bombaa.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setText("TIEMPO");

        INICIAR.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(51, 51, 255));
        INICIAR.setText("INICIAR");
        INICIAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BT_INICIOLayout = new javax.swing.GroupLayout(BT_INICIO);
        BT_INICIO.setLayout(BT_INICIOLayout);
        BT_INICIOLayout.setHorizontalGroup(
            BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BT_INICIOLayout.createSequentialGroup()
                .addGroup(BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BT_INICIOLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(BT_INICIOLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(INICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BT_INICIOLayout.createSequentialGroup()
                        .addGroup(BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bomba, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BT_INICIOLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BT_INICIOLayout.setVerticalGroup(
            BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BT_INICIOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BT_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Bomba)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_INICIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_INICIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARActionPerformed
       Vista_Imagenes panel= new Vista_Imagenes();
       panel.setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_INICIARActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BT_INICIO;
    private javax.swing.JLabel Bomba;
    private javax.swing.JButton INICIAR;
    private javax.swing.JTextArea Reglas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        while(movimientoX_bomba<=500){
            try {// exepcion
                Thread.sleep(100);
                
                
               Bomba.setBounds(movimientoX_bomba, 500, Bomba.getWidth(),Bomba.getHeight());// setbounds poner un limite entre el ancho y alto
                
              
                    movimientoX_bomba +=15;
                    
                 
                  
            } catch (InterruptedException ex) {
                Logger.getLogger(Instrucciones.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        
    }
}
