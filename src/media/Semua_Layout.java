package media;

import kelas_utama.*;
import sistem_bank.*;

public class Semua_Layout extends javax.swing.JFrame {
     
    Sistem_Bank bank = new Sistem_Bank();
    Nasabah nasabah;
    Tabungan tabungan;
    Kartu_ATM kartuATM;
    public Semua_Layout() {
        initComponents();
        bank.tambahNasabah(new Nasabah(2103181060, "Nova Andre Saputra"));
        bank.tambahTabungan("Nova Andre Saputra", new Tabungan(2103181060, 10000000, "4ndr3", 123456));
        bank.tambahKartuATM("4ndr3", new Kartu_ATM(2103181060, Tipe_Kartu.SILVER));
        
        bank.tambahNasabah(new Nasabah(2103181035, "Muhammad Rivaldin"));
        bank.tambahTabungan("Muhammad Rivaldin", new Tabungan(2103181035, 10000000, "riv4ldin", 123456));
        bank.tambahKartuATM("riv4ldin", new Kartu_ATM(2103181035, Tipe_Kartu.PLATINUM));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAbsolute = new javax.swing.JPanel();
        WEB = new javax.swing.JButton();
        jbKeluar = new javax.swing.JButton();
        jbATM = new javax.swing.JButton();
        jbOnline = new javax.swing.JButton();
        jPanelJudul = new javax.swing.JPanel();
        jLabelJudul = new javax.swing.JLabel();
        jLabelSubJudul = new javax.swing.JLabel();
        jLabelNRP = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 173));

        jPanelAbsolute.setBackground(new java.awt.Color(32, 26, 35));
        jPanelAbsolute.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WEB.setBackground(new java.awt.Color(51, 102, 0));
        WEB.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        WEB.setForeground(new java.awt.Color(251, 251, 251));
        WEB.setText("WEB");
        WEB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WEBActionPerformed(evt);
            }
        });
        jPanelAbsolute.add(WEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 157, 48));

        jbKeluar.setBackground(new java.awt.Color(153, 0, 0));
        jbKeluar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jbKeluar.setForeground(new java.awt.Color(255, 255, 255));
        jbKeluar.setText("LOGOUT");
        jbKeluar.setBorder(null);
        jbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKeluarActionPerformed(evt);
            }
        });
        jPanelAbsolute.add(jbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 90, 20));

        jbATM.setBackground(new java.awt.Color(0, 0, 102));
        jbATM.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbATM.setForeground(new java.awt.Color(251, 251, 251));
        jbATM.setText("ATM");
        jbATM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbATM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbATMActionPerformed(evt);
            }
        });
        jPanelAbsolute.add(jbATM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 157, 47));

        jbOnline.setBackground(new java.awt.Color(204, 102, 0));
        jbOnline.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbOnline.setForeground(new java.awt.Color(251, 251, 251));
        jbOnline.setText("MOBILE");
        jbOnline.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOnlineActionPerformed(evt);
            }
        });
        jPanelAbsolute.add(jbOnline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 157, 47));

        jPanelJudul.setBackground(new java.awt.Color(251, 251, 251));
        jPanelJudul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJudul.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJudul.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelJudul.setForeground(new java.awt.Color(32, 26, 35));
        jLabelJudul.setText("BANK SIDOARJO");
        jPanelJudul.add(jLabelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 310, 54));

        jPanelAbsolute.add(jPanelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, -1));

        jLabelSubJudul.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelSubJudul.setForeground(new java.awt.Color(251, 251, 251));
        jLabelSubJudul.setText("Media Transaksi");
        jPanelAbsolute.add(jLabelSubJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 30));

        jLabelNRP.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabelNRP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNRP.setText("2103181060");
        jPanelAbsolute.add(jLabelNRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 20));

        jLabelNama.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNama.setText("Nova Andre Saputra");
        jPanelAbsolute.add(jLabelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanelAbsolute, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAbsolute, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WEBActionPerformed
        ATM_Layout ATM = new ATM_Layout();
        ATM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WEBActionPerformed

    private void jbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbKeluarActionPerformed

    private void jbATMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbATMActionPerformed
        ATM_Layout atm = new ATM_Layout();
        atm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbATMActionPerformed

    private void jbOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOnlineActionPerformed
        Mobile_Layout mobile = new Mobile_Layout();
        mobile.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbOnlineActionPerformed

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
            java.util.logging.Logger.getLogger(Semua_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semua_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semua_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semua_Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Semua_Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WEB;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelNRP;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelSubJudul;
    private javax.swing.JPanel jPanelAbsolute;
    private javax.swing.JPanel jPanelJudul;
    private javax.swing.JButton jbATM;
    private javax.swing.JButton jbKeluar;
    private javax.swing.JButton jbOnline;
    // End of variables declaration//GEN-END:variables
}