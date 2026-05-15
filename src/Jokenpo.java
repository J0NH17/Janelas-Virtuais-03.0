
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jokenpo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Jokenpo.class.getName());

    public Jokenpo() {
        initComponents();
    }
    Random r =new Random();
    
    
   
    private void mostrarescolha(String caminhoImagem) {
        ImageIcon icon = new ImageIcon(caminhoImagem);
        Image imagem = icon.getImage().getScaledInstance(
                50, // largura
                50, // altura
                Image.SCALE_SMOOTH
        );
       lbPlayer.setIcon(new ImageIcon(imagem));
    }
    private void mostrarescolhaBOT(String caminhoImagem) {
        ImageIcon icon = new ImageIcon(caminhoImagem);
        Image imagem = icon.getImage().getScaledInstance(
                50, // largura
                50, // altura
                Image.SCALE_SMOOTH
        );
       lbMaquina.setIcon(new ImageIcon(imagem));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEscolha = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cbEscolha = new javax.swing.JComboBox<>();
        lbMaquina = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        lbPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("(╬▔皿▔)╯");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jButton8.setText("go!");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        cbEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pedra", "Papel", "Tesoura" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        lbMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carregando2_gif.gif"))); // NOI18N
        lbMaquina.setText("escolha da maquina!");

        jButton7.setText("placar");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        lbPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carregando2_gif.gif"))); // NOI18N
        lbPlayer.setText("escolha da player!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPlayer)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaquina)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lbPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String escolha ="";
        switch (cbEscolha.getSelectedItem().toString()) {
            case "Papel":
                escolha = "papel";
                mostrarescolha("src/img/papel_img.png");
                break;
            case "Pedra":
                escolha = "pedra";
                mostrarescolha("src/img/pedra_img.png");
                break;
            case "Tesoura":
                escolha = "tesoura";
                mostrarescolha("src/img/tesoura_img.png");
                break;
            default:
                // vazioooooooooo
        }
        
        //bot 
        int escolhabot = r.nextInt(3);
        String escolhaBOT ="";
        switch (escolhabot) {
            case 1:
                escolhaBOT = "papel";
                mostrarescolhaBOT("src/img/papel_img.png");
                break;
            case 0:
                escolhaBOT = "pedra";
                mostrarescolhaBOT("src/img/pedra_img.png");
                break;
            case 2:
                escolhaBOT = "tesoura";
                mostrarescolhaBOT("src/img/tesoura_img.png");
                break;
            default:
                // vazioooooooooo
        }
        
        if(escolha == escolhaBOT){
            JOptionPane.showMessageDialog(null, "Empate");
        }else if(escolha == "pedra"&& escolhaBOT == "tesoura"){
      
            JOptionPane.showMessageDialog(null, "jogador ganhou");
        }
        else if(escolha == "papel"&& escolhaBOT == "pedra"){
      
            JOptionPane.showMessageDialog(null, "jogador ganhou");
        }
        else if(escolha == "tesoura"&& escolhaBOT == "papel"){
      
            JOptionPane.showMessageDialog(null, "jogador ganhou");
        }else{
        
            JOptionPane.showMessageDialog(null, "jogador PERDEU");
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
            JOptionPane.showMessageDialog(null, "jogador só PERDEU");
    }//GEN-LAST:event_jButton7ActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> new Jokenpo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEscolha;
    private javax.swing.JComboBox<String> cbEscolha;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbMaquina;
    private javax.swing.JLabel lbPlayer;
    // End of variables declaration//GEN-END:variables

}
