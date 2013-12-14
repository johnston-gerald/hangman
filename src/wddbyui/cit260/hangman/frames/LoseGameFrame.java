/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wddbyui.cit260.hangman.frames;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerrygj
 */
public class LoseGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoseGameFrame
     */
    public LoseGameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInstructionsPanel = new javax.swing.JPanel();
        jWinnerLabel = new javax.swing.JLabel();
        jPlayAgainButton = new javax.swing.JButton();
        jExitButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInstructionsPanel.setBackground(new java.awt.Color(204, 204, 255));

        jWinnerLabel.setBackground(new java.awt.Color(204, 204, 255));
        jWinnerLabel.setFont(new java.awt.Font("Minion Pro SmBd", 0, 36)); // NOI18N
        jWinnerLabel.setForeground(new java.awt.Color(61, 61, 155));
        jWinnerLabel.setText("You Lose!");

        jPlayAgainButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jPlayAgainButton.setText("Play Again");
        jPlayAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayAgainButtonActionPerformed(evt);
            }
        });

        jExitButton1.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jExitButton1.setText("Exit Game");
        jExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInstructionsPanelLayout = new javax.swing.GroupLayout(jInstructionsPanel);
        jInstructionsPanel.setLayout(jInstructionsPanelLayout);
        jInstructionsPanelLayout.setHorizontalGroup(
            jInstructionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInstructionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInstructionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jWinnerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInstructionsPanelLayout.createSequentialGroup()
                        .addComponent(jPlayAgainButton)
                        .addGap(18, 18, 18)
                        .addComponent(jExitButton1)))
                .addGap(172, 172, 172))
        );
        jInstructionsPanelLayout.setVerticalGroup(
            jInstructionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInstructionsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jWinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInstructionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlayAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInstructionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInstructionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPlayAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayAgainButtonActionPerformed
        GameFrame gameFrame = null;
        try {
            gameFrame = new GameFrame();
        } catch (IOException ex) {
            Logger.getLogger(LoseGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPlayAgainButtonActionPerformed

    private void jExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jExitButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoseGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoseGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoseGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoseGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoseGameFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton1;
    private javax.swing.JPanel jInstructionsPanel;
    private javax.swing.JButton jPlayAgainButton;
    private javax.swing.JLabel jWinnerLabel;
    // End of variables declaration//GEN-END:variables
}
