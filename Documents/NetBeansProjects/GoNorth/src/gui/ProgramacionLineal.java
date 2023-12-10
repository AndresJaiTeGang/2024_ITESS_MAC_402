
package gui;

import java.awt.Color;
import app.Main;
/**
 *
 * @author xeon
 */
public class ProgramacionLineal extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form ComplexNumberASYS
     */
    public ProgramacionLineal(Main main) {
        initComponents();
        
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlComplexNumbers = new javax.swing.JPanel();
        lblHOME = new javax.swing.JLabel();
        lblComplexNumbers = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblIndicacion = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        lblIndicacion1 = new javax.swing.JLabel();
        solution = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlComplexNumbers.setBackground(new java.awt.Color(0, 0, 0));
        pnlComplexNumbers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlComplexNumbers.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlComplexNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHOME.setBackground(new java.awt.Color(0, 0, 255));
        lblHOME.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblHOME.setForeground(new java.awt.Color(255, 255, 255));
        lblHOME.setText("Inicio");
        lblHOME.setOpaque(true);
        lblHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHOMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHOMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHOMEMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(lblHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 70, 50));

        lblComplexNumbers.setBackground(new java.awt.Color(255, 0, 204));
        lblComplexNumbers.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblComplexNumbers.setForeground(new java.awt.Color(0, 0, 255));
        lblComplexNumbers.setText("Programación lineal");
        pnlComplexNumbers.add(lblComplexNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 430, 50));

        lblTema1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTema1.setForeground(new java.awt.Color(255, 255, 255));
        lblTema1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTema1.setText("Aplica los métodos gráficos, simplex, de  la M, y de las dos fases para la optimización de recursos en problemas  que involucran mezclas de recursos o  productos. ");
        pnlComplexNumbers.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 720, 30));

        lblIndicacion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblIndicacion.setForeground(new java.awt.Color(0, 0, 0));
        lblIndicacion.setText("a la función objetivo.");
        pnlComplexNumbers.add(lblIndicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 550, 20));

        lblFoot.setForeground(new java.awt.Color(0, 0, 255));
        lblFoot.setText("Andres Mendoza");
        pnlComplexNumbers.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        lblFoot1.setForeground(new java.awt.Color(0, 0, 255));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        pnlComplexNumbers.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        lblIndicacion1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblIndicacion1.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicacion1.setText("Indicaciones: dadas dos ecuaciones, aplica el metodo grafico y encuentra los valores que sastifacen");
        pnlComplexNumbers.add(lblIndicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 630, 20));

        solution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.probLineal.jpg"))); // NOI18N
        pnlComplexNumbers.add(solution, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 490, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ProgLin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnlComplexNumbers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseExited
        // TODO add your handling code here:
        lblHOME.setBackground(Color.black);
    }//GEN-LAST:event_lblHOMEMouseExited

    private void lblHOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseEntered
        // TODO add your handling code here:
        lblHOME.setBackground(Color.yellow);
    }//GEN-LAST:event_lblHOMEMouseEntered

    private void lblHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseClicked
        // TODO add your handling code here:
        main.ProgramacionLineal.setVisible(false);
        main.ProgramacionLineal = null;

        main.mainGoNorth.setVisible(true);
    }//GEN-LAST:event_lblHOMEMouseClicked

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
            java.util.logging.Logger.getLogger(ProgramacionLineal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramacionLineal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramacionLineal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramacionLineal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComplexNumbersASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComplexNumbers;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblHOME;
    private javax.swing.JLabel lblIndicacion;
    private javax.swing.JLabel lblIndicacion1;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JPanel pnlComplexNumbers;
    private javax.swing.JLabel solution;
    // End of variables declaration//GEN-END:variables
}