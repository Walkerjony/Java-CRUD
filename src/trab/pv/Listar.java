/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab.pv;
import javax.swing.DefaultListModel;



/**
 *
 * @author Administrator
 */
public class Listar extends javax.swing.JDialog {
    
    private DefaultListModel<Encomenda> modelo;
    
    public Listar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        modelo = new DefaultListModel<>();
        for(Encomenda a : Tela.lista){
            modelo.addElement(a);
        }
        listaDeEncomendas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeEncomendas = new javax.swing.JList<>();
        botaoNaoEntregue = new javax.swing.JButton();
        botaoEntregue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trab/pv/Imagens/editar32.png"))); // NOI18N
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trab/pv/Imagens/remover.png"))); // NOI18N
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaDeEncomendas);

        botaoNaoEntregue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trab/pv/Imagens/esquerda.png"))); // NOI18N
        botaoNaoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoEntregueActionPerformed(evt);
            }
        });

        botaoEntregue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trab/pv/Imagens/direita.png"))); // NOI18N
        botaoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntregueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoNaoEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botaoEntregue)
                        .addGap(33, 33, 33)
                        .addComponent(botaoRemover))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(botaoNaoEntregue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEntregue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
           if (listaDeEncomendas.getSelectedIndex() != -1) {
            new Editar(null, true, listaDeEncomendas.getSelectedValue()).setVisible(true);
            repaint();
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
         while (listaDeEncomendas.getSelectedIndex() != -1) {
            Tela.lista.remove(listaDeEncomendas.getSelectedValue());
            modelo.removeElement(listaDeEncomendas.getSelectedValue());
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntregueActionPerformed
         modelo.removeAllElements();
          for (Encomenda a : Tela.lista) {
            if (a.getEntregue()) {
                modelo.addElement(a);
            }
         }
    }//GEN-LAST:event_botaoEntregueActionPerformed

    private void botaoNaoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoEntregueActionPerformed
          modelo.removeAllElements();
             for (Encomenda a : Tela.lista) {
            if (!a.getEntregue()) {
                modelo.addElement(a);
            }
        }
    }//GEN-LAST:event_botaoNaoEntregueActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Listar dialog = new Listar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoEntregue;
    private javax.swing.JButton botaoNaoEntregue;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Encomenda> listaDeEncomendas;
    // End of variables declaration//GEN-END:variables
}
