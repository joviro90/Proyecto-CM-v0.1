/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author Jose
 */
public class jfMain extends javax.swing.JFrame {

    
    /**
     * Creates new form Main
     */
    public jfMain() {
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

        jtbMenu = new javax.swing.JToolBar();
        btnPedido = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnMaquinaria = new javax.swing.JButton();
        btnOperario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCerrarSesion = new javax.swing.JButton();
        jpMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CM v1.0");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1280, 668));
        setResizable(false);

        jtbMenu.setRollover(true);

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/order_162.png"))); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.setFocusable(false);
        btnPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedido.setMargin(new java.awt.Insets(2, 18, 2, 18));
        btnPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMenu.add(btnPedido);

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/product.png"))); // NOI18N
        btnProducto.setText("Productos");
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setMargin(new java.awt.Insets(2, 18, 2, 18));
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMenu.add(btnProducto);

        btnMaquinaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/machine.png"))); // NOI18N
        btnMaquinaria.setText("Maquinaria");
        btnMaquinaria.setToolTipText("");
        btnMaquinaria.setFocusable(false);
        btnMaquinaria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaquinaria.setMargin(new java.awt.Insets(2, 18, 2, 18));
        btnMaquinaria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMenu.add(btnMaquinaria);

        btnOperario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        btnOperario.setText("Operario");
        btnOperario.setFocusable(false);
        btnOperario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOperario.setMargin(new java.awt.Insets(2, 18, 2, 18));
        btnOperario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbMenu.add(btnOperario);
        jtbMenu.add(jSeparator1);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setMargin(new java.awt.Insets(2, 18, 2, 18));
        btnCerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jtbMenu.add(btnCerrarSesion);

        javax.swing.GroupLayout jpMainPanelLayout = new javax.swing.GroupLayout(jpMainPanel);
        jpMainPanel.setLayout(jpMainPanelLayout);
        jpMainPanelLayout.setHorizontalGroup(
            jpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpMainPanelLayout.setVerticalGroup(
            jpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(jpMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        jfLogin jLogin = new jfLogin();
                
        this.dispose();
        jLogin.setLocationRelativeTo(null);
        jLogin.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMain().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnMaquinaria;
    private javax.swing.JButton btnOperario;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnProducto;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPanel jpMainPanel;
    private javax.swing.JToolBar jtbMenu;
    // End of variables declaration//GEN-END:variables

    public void buttonBlok() {
        btnMaquinaria.setEnabled(false);
        btnOperario.setEnabled(false);
        btnProducto.setEnabled(false);
    }

    
 
    
}
