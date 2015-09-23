package escritorio;

import negocio.ControladorAjedrez;

public class Main extends javax.swing.JFrame {

    private ControladorAjedrez ctrlAje = new ControladorAjedrez();
    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaPartida = new javax.swing.JButton();
        btnRecuperarPartida = new javax.swing.JButton();
        btnRegistrarJugador = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnTabPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevaPartida.setText("Nueva Partida");
        btnNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaPartidaMouseClicked(evt);
            }
        });

        btnRecuperarPartida.setText("Recuperar Partida");

        btnRegistrarJugador.setText("Registrar Jugador");
        btnRegistrarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarJugadorMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");

        btnTabPrueba.setText("Tablero");
        btnTabPrueba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTabPruebaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNuevaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecuperarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTabPrueba)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnNuevaPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecuperarPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnTabPrueba)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarJugadorMouseClicked

        Registro reg = new Registro();
        reg.setVisible(true);
    }//GEN-LAST:event_btnRegistrarJugadorMouseClicked

    private void btnNuevaPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaPartidaMouseClicked

        IdJugadores jugadores = new IdJugadores();
        jugadores.setVisible(true);
    }//GEN-LAST:event_btnNuevaPartidaMouseClicked

    private void btnTabPruebaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabPruebaMouseClicked
        // TODO add your handling code here:
        Prueba prueb = new Prueba();
        prueb.setVisible(true);
    }//GEN-LAST:event_btnTabPruebaMouseClicked


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPartida;
    private javax.swing.JButton btnRecuperarPartida;
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTabPrueba;
    // End of variables declaration//GEN-END:variables
    
    
    
    public void iniciarPartida(int jug1, int jug2){
        ctrlAje.iniciarPartida(jug1, jug2);
    }
    public void registrarJugador(int dni, String nombre, String apellido){
        ctrlAje.registrarJugador(dni, nombre, apellido);
    }
}
