
import Cadastros.Cad_clientes;
import javax.swing.JOptionPane;
import java.awt.*;
import java.net.URL;

public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.WHITE);
 URL url = this.getClass().getResource("/Utilitarios/Database.png");  
Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
this.setIconImage(imagemTitulo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_cadastros = new javax.swing.JMenu();
        mi_clientes = new javax.swing.JMenuItem();
        jm_informacao = new javax.swing.JMenu();
        jm_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula Java - Cadastro");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/ueg_topo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Aula de Java IV Bimestre");

        jm_cadastros.setText("Cadastros");
        jm_cadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_cadastrosMouseClicked(evt);
            }
        });
        jm_cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_cadastrosActionPerformed(evt);
            }
        });

        mi_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mi_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/User group.png"))); // NOI18N
        mi_clientes.setText("Clientes");
        mi_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_clientesMouseClicked(evt);
            }
        });
        mi_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_clientesActionPerformed(evt);
            }
        });
        jm_cadastros.add(mi_clientes);

        jMenuBar1.add(jm_cadastros);

        jm_informacao.setText("Informações");
        jMenuBar1.add(jm_informacao);

        jm_sair.setText("Sair");
        jm_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_sairMouseClicked(evt);
            }
        });
        jm_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jm_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1382, 807);
    }// </editor-fold>//GEN-END:initComponents

    private void jm_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_sairActionPerformed

    private void jm_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_sairMouseClicked
int opcao;  
opcao = JOptionPane.showConfirmDialog(null,"Deseja Realmente Sair?","Atenção!",JOptionPane.YES_NO_OPTION);    
if(opcao == JOptionPane.YES_OPTION){   
System.exit(0);   
             }          // TODO add your handling code here:
    }//GEN-LAST:event_jm_sairMouseClicked

    private void mi_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_clientesActionPerformed
    new Cad_clientes().show();        // TODO add your handling code here:
    }//GEN-LAST:event_mi_clientesActionPerformed

    private void jm_cadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_cadastrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_cadastrosActionPerformed

    private void jm_cadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_cadastrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_cadastrosMouseClicked

    private void mi_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_clientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_clientesMouseClicked

    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jm_cadastros;
    private javax.swing.JMenu jm_informacao;
    private javax.swing.JMenu jm_sair;
    private javax.swing.JMenuItem mi_clientes;
    // End of variables declaration//GEN-END:variables
}
