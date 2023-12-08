/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import app.Main;


public class MainGoNorth extends javax.swing.JFrame {
    Main main;
    public MainGoNorth(Main main) {
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

        bg = new javax.swing.JPanel();
        ProgramacionLineal = new javax.swing.JLabel();
        MetodoDeTransporte = new javax.swing.JLabel();
        logoTecNM = new javax.swing.JLabel();
        lbASYSC = new javax.swing.JLabel();
        bgLogo = new javax.swing.JLabel();
        lblTema2 = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblTema3 = new javax.swing.JLabel();
        Planeacion = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TransformFourier1 = new javax.swing.JLabel();
        lblTema4 = new javax.swing.JLabel();
        Inventarios = new javax.swing.JLabel();
        LineaEspera = new javax.swing.JLabel();
        lblTema5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgramacionLineal.setBackground(new java.awt.Color(255, 255, 255));
        ProgramacionLineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_1.png"))); // NOI18N
        ProgramacionLineal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProgramacionLineal.setOpaque(true);
        ProgramacionLineal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseExited(evt);
            }
        });
        bg.add(ProgramacionLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 130, 90));

        MetodoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        MetodoDeTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        MetodoDeTransporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MetodoDeTransporte.setOpaque(true);
        MetodoDeTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseExited(evt);
            }
        });
        bg.add(MetodoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 120, 90));

        logoTecNM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo itess-blanco new-small.png"))); // NOI18N
        bg.add(logoTecNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 210, 80));

        lbASYSC.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbASYSC.setForeground(new java.awt.Color(0, 0, 0));
        lbASYSC.setText("Portafolio Digital 2023 ITESS-TICS MPTD GoNorth");
        lbASYSC.setToolTipText("");
        bg.add(lbASYSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 560, 40));

        bgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo6.jpg"))); // NOI18N
        bg.add(bgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 364, 500));

        lblTema2.setForeground(new java.awt.Color(0, 0, 0));
        lblTema2.setText("Tema2. M Transporte");
        bg.add(lblTema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        lblTema1.setForeground(new java.awt.Color(0, 0, 0));
        lblTema1.setText("Tema1. Prog lineal");
        bg.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 120, -1));

        lblTema3.setForeground(new java.awt.Color(0, 0, 0));
        lblTema3.setText("Tema3. Planeación");
        bg.add(lblTema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        Planeacion.setBackground(new java.awt.Color(255, 255, 255));
        Planeacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tema3_FurierTransform_logo.png"))); // NOI18N
        Planeacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Planeacion.setOpaque(true);
        Planeacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaneacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlaneacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlaneacionMouseExited(evt);
            }
        });
        bg.add(Planeacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 110, 90));

        lblFoot1.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        bg.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        lblFoot.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot.setText("Francisco Javier Montecillo Puente");
        bg.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Programador Andres.com");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        TransformFourier1.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tema3_FurierTransform_logo.png"))); // NOI18N
        TransformFourier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier1.setOpaque(true);
        TransformFourier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseExited(evt);
            }
        });
        bg.add(TransformFourier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 110, 90));

        lblTema4.setForeground(new java.awt.Color(0, 0, 0));
        lblTema4.setText("Tema4. Inventarios");
        bg.add(lblTema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        Inventarios.setBackground(new java.awt.Color(255, 255, 255));
        Inventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tema3_FurierTransform_logo.png"))); // NOI18N
        Inventarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventarios.setOpaque(true);
        Inventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventariosMouseExited(evt);
            }
        });
        bg.add(Inventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 110, 90));

        LineaEspera.setBackground(new java.awt.Color(255, 255, 255));
        LineaEspera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tema3_FurierTransform_logo.png"))); // NOI18N
        LineaEspera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LineaEspera.setOpaque(true);
        LineaEspera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseExited(evt);
            }
        });
        bg.add(LineaEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, 90));

        lblTema5.setForeground(new java.awt.Color(0, 0, 0));
        lblTema5.setText("Tema5. Lin Espera");
        bg.add(lblTema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 820, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void ProgramacionLinealMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseEntered
        ProgramacionLineal.setBackground(Color.yellow);
    }//GEN-LAST:event_ProgramacionLinealMouseEntered

    private void ProgramacionLinealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseExited
        ProgramacionLineal.setBackground(Color.white);
    }//GEN-LAST:event_ProgramacionLinealMouseExited

    private void MetodoDeTransporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseEntered
        MetodoDeTransporte.setBackground(Color.yellow);
    }//GEN-LAST:event_MetodoDeTransporteMouseEntered

    private void MetodoDeTransporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseExited
        MetodoDeTransporte.setBackground(Color.white);
    }//GEN-LAST:event_MetodoDeTransporteMouseExited

    private void ProgramacionLinealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.introduction = new Introduction(this.main);
        main.introduction.setVisible(true);        
    }//GEN-LAST:event_ProgramacionLinealMouseClicked

    private void PlaneacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseEntered
        // TODO add your handling code here:
        Planeacion.setBackground(Color.yellow);
    }//GEN-LAST:event_PlaneacionMouseEntered

    private void PlaneacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseExited
        // TODO add your handling code here:
        Planeacion.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_PlaneacionMouseExited

    private void MetodoDeTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.fourierSeries = new FourierSeries(this.main);
        main.fourierSeries.setVisible(true); 
    }//GEN-LAST:event_MetodoDeTransporteMouseClicked

    private void PlaneacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.fourierTransform = new FourierTransform(this.main);
        main.fourierTransform.setVisible(true);
    }//GEN-LAST:event_PlaneacionMouseClicked

    private void TransformFourier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier1MouseClicked

    private void TransformFourier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier1MouseEntered

    private void TransformFourier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier1MouseExited

    private void InventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_InventariosMouseClicked

    private void InventariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseEntered
        // TODO add your handling code here:
        Inventarios.setBackground(Color.red);
    }//GEN-LAST:event_InventariosMouseEntered

    private void InventariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseExited
        // TODO add your handling code here:
        Inventarios.setBackground(Color.white);
    }//GEN-LAST:event_InventariosMouseExited

    private void LineaEsperaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LineaEsperaMouseClicked

    private void LineaEsperaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseEntered
        // TODO add your handling code here:
        LineaEspera.setBackground(Color.red);
    }//GEN-LAST:event_LineaEsperaMouseEntered

    private void LineaEsperaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseExited
        // TODO add your handling code here:
        LineaEspera.setBackground(Color.white);
    }//GEN-LAST:event_LineaEsperaMouseExited

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
            java.util.logging.Logger.getLogger(MainGoNorth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGoNorth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGoNorth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGoNorth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Inventarios;
    private javax.swing.JLabel LineaEspera;
    private javax.swing.JLabel MetodoDeTransporte;
    private javax.swing.JLabel Planeacion;
    private javax.swing.JLabel ProgramacionLineal;
    private javax.swing.JLabel TransformFourier1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbASYSC;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JLabel lblTema2;
    private javax.swing.JLabel lblTema3;
    private javax.swing.JLabel lblTema4;
    private javax.swing.JLabel lblTema5;
    private javax.swing.JLabel logoTecNM;
    // End of variables declaration//GEN-END:variables
}
