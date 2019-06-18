/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private void exit() {
        int opt = JOptionPane.showConfirmDialog(this, "确认要退出系统吗?");
        if (opt == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemBg = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonHelloJava = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        jButtonOOP = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButtonAbout = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemHelloJava = new javax.swing.JMenuItem();
        jMenuItemOOP = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        jPopupMenu1.setToolTipText("现实背景信息");

        jMenuItemBg.setText("jMenuItem1");
        jMenuItemBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBgActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemBg);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("胡浩然");
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.lightGray));
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setInheritsPopupMenu(true);
        jToolBar1.setName(""); // NOI18N

        jButtonHelloJava.setText("HelloJava");
        jButtonHelloJava.setFocusable(false);
        jButtonHelloJava.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHelloJava.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonHelloJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelloJavaActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonHelloJava);
        jToolBar1.add(filler2);

        jButtonOOP.setText("OOP");
        jButtonOOP.setFocusable(false);
        jButtonOOP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOOP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOOPActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonOOP);
        jToolBar1.add(filler1);

        jButtonAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/view/MyIcon.png"))); // NOI18N
        jButtonAbout.setFocusable(false);
        jButtonAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAbout);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/view/background_1.JPG"))); // NOI18N
        bg.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("作者:胡浩然");

        Time.setBackground(new java.awt.Color(51, 255, 0));
        Time.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time.setText("00:00:00");
        Time.setToolTipText("");
        Time.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jMenu1.setText("功能");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemHelloJava.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemHelloJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/view/MyIcon.png"))); // NOI18N
        jMenuItemHelloJava.setText("HelloJava");
        jMenuItemHelloJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHelloJavaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemHelloJava);

        jMenuItemOOP.setText("OOP");
        jMenuItemOOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOOPActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOOP);
        jMenu1.add(jSeparator1);

        jMenuItemExit.setText("退出");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("帮助");

        jMenuItemAbout.setText("关于");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonHelloJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelloJavaActionPerformed
        hellojava();
    }//GEN-LAST:event_jButtonHelloJavaActionPerformed

    private void jButtonOOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOOPActionPerformed
        oop();
    }//GEN-LAST:event_jButtonOOPActionPerformed

    private void jMenuItemBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBgActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        about();
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void about() {
        About about = new About(this, true);
        about.setLocationRelativeTo(this);
        about.setVisible(true);
    }

    private void jMenuItemHelloJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHelloJavaActionPerformed
        hellojava();
    }//GEN-LAST:event_jMenuItemHelloJavaActionPerformed

    private void hellojava() {
        HelloJava hellojava = new HelloJava(this, true);
        hellojava.setLocationRelativeTo(this);
        hellojava.setVisible(true);
    }

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        exit();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemOOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOOPActionPerformed
        oop();
    }//GEN-LAST:event_jMenuItemOOPActionPerformed

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
        about();
    }//GEN-LAST:event_jButtonAboutActionPerformed

    private void oop() {
        OOP oop = new OOP(this, true);
        oop.setLocationRelativeTo(this);
        oop.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Time;
    private javax.swing.JLabel bg;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonHelloJava;
    private javax.swing.JButton jButtonOOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemBg;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHelloJava;
    private javax.swing.JMenuItem jMenuItemOOP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}