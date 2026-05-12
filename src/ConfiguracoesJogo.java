
import javax.swing.JOptionPane;

public class ConfiguracoesJogo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConfiguracoesJogo.class.getName());

    public ConfiguracoesJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDificuldade = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ckbMusica = new javax.swing.JCheckBox();
        ckbLegenda = new javax.swing.JCheckBox();
        ckbTelaCheia = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rbFacil = new javax.swing.JRadioButton();
        rbMedio = new javax.swing.JRadioButton();
        rbDificil = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jslideVolume = new javax.swing.JSlider();
        btSalvarConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Config Game");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opçoes de jogo"));

        ckbMusica.setText("Musica");
        ckbMusica.addActionListener(this::ckbMusicaActionPerformed);

        ckbLegenda.setText("Legendas");
        ckbLegenda.addActionListener(this::ckbLegendaActionPerformed);

        ckbTelaCheia.setText("Tela cheia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbMusica)
                    .addComponent(ckbLegenda)
                    .addComponent(ckbTelaCheia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbLegenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbTelaCheia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dificuldade"));

        bgDificuldade.add(rbFacil);
        rbFacil.setText("Fácil");

        bgDificuldade.add(rbMedio);
        rbMedio.setText("Médio");

        bgDificuldade.add(rbDificil);
        rbDificil.setText("Difícil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFacil)
                .addGap(79, 79, 79)
                .addComponent(rbMedio)
                .addGap(80, 80, 80)
                .addComponent(rbDificil))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFacil)
                    .addComponent(rbDificil)
                    .addComponent(rbMedio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Volume")));

        jslideVolume.setMajorTickSpacing(25);
        jslideVolume.setPaintLabels(true);
        jslideVolume.setPaintTicks(true);
        jslideVolume.setSnapToTicks(true);

        btSalvarConfig.setText("Salvar configurações");
        btSalvarConfig.addActionListener(this::btSalvarConfigActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jslideVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btSalvarConfig)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jslideVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btSalvarConfig)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ckbMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbMusicaActionPerformed

    private void ckbLegendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbLegendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbLegendaActionPerformed

    private void btSalvarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarConfigActionPerformed
       
        String dificuldade = "";
        
        if(rbFacil.isSelected()){
           dificuldade = "Facil";
       
       }
        if(rbMedio.isSelected()){
           dificuldade = "Medio";
       
       }
        if(rbDificil.isSelected()){
           dificuldade = "Difícil";
       
       }
        //infomação messagem
        String mensagem ="";
        mensagem += "Musica: "+ ckbMusica.isSelected()+"\n";
        mensagem += "Legenda: "+ ckbLegenda.isSelected()+"\n";
        mensagem += "Tela cheia: "+ ckbTelaCheia.isSelected()+"\n";
        
        mensagem += "dificuldade: "+ dificuldade+"\n";
        mensagem += "Volume "+ jslideVolume.getValue()+"\n";
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        
    }//GEN-LAST:event_btSalvarConfigActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new ConfiguracoesJogo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDificuldade;
    private javax.swing.JButton btSalvarConfig;
    private javax.swing.JCheckBox ckbLegenda;
    private javax.swing.JCheckBox ckbMusica;
    private javax.swing.JCheckBox ckbTelaCheia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jslideVolume;
    private javax.swing.JRadioButton rbDificil;
    private javax.swing.JRadioButton rbFacil;
    private javax.swing.JRadioButton rbMedio;
    // End of variables declaration//GEN-END:variables

}
