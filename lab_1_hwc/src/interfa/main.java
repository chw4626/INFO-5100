/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfa;
import object.Product;
/**
 *
 * @author haowenchang
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    private Product product;
    public main() {
        initComponents();
        product = new Product();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        split = new javax.swing.JSplitPane();
        disp = new javax.swing.JPanel();
        control = new javax.swing.JPanel();
        createb = new javax.swing.JButton();
        viewb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        split.setDividerSize(5);

        javax.swing.GroupLayout dispLayout = new javax.swing.GroupLayout(disp);
        disp.setLayout(dispLayout);
        dispLayout.setHorizontalGroup(
            dispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        dispLayout.setVerticalGroup(
            dispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        split.setRightComponent(disp);

        createb.setText("create");
        createb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbActionPerformed(evt);
            }
        });

        viewb.setText("view");
        viewb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlLayout = new javax.swing.GroupLayout(control);
        control.setLayout(controlLayout);
        controlLayout.setHorizontalGroup(
            controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewb))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        controlLayout.setVerticalGroup(
            controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(createb)
                .addGap(37, 37, 37)
                .addComponent(viewb)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        split.setLeftComponent(control);

        getContentPane().add(split, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbActionPerformed
        createjp jp1 = new createjp(product);
        split.setRightComponent(jp1);
    }//GEN-LAST:event_createbActionPerformed

    private void viewbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbActionPerformed
        viewjp jp2 = new viewjp(product);
        split.setRightComponent(jp2);
    }//GEN-LAST:event_viewbActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel control;
    private javax.swing.JButton createb;
    private javax.swing.JPanel disp;
    private javax.swing.JSplitPane split;
    private javax.swing.JButton viewb;
    // End of variables declaration//GEN-END:variables
}
