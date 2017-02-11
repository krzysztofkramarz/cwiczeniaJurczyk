
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kkramarz
 */
public class MainFrame extends javax.swing.JFrame {

    List<String> imiona = new ArrayList<>();

    Component[] tytulChecked;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        grupaPlec = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioPan = new javax.swing.JRadioButton();
        radioPani = new javax.swing.JRadioButton();
        tytulPanel = new javax.swing.JPanel();
        checkProf = new javax.swing.JCheckBox();
        checkDr = new javax.swing.JCheckBox();
        checkMgr = new javax.swing.JCheckBox();
        checkLicencjat = new javax.swing.JCheckBox();
        checkMatura = new javax.swing.JCheckBox();
        checkPodstawowka = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        suwakMeski = new javax.swing.JScrollPane();
        listaImionZenskich = new javax.swing.JList<>();
        suwakDamski = new javax.swing.JScrollPane();
        listaImionMeskich = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        nazwisko = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Płeć", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        radioPan.setBackground(new java.awt.Color(204, 255, 0));
        grupaPlec.add(radioPan);
        radioPan.setSelected(true);
        radioPan.setText("Pan");
        radioPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPanActionPerformed(evt);
            }
        });
        jPanel1.add(radioPan);

        radioPani.setBackground(new java.awt.Color(255, 255, 0));
        grupaPlec.add(radioPani);
        radioPani.setText("Pani");
        radioPani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPaniActionPerformed(evt);
            }
        });
        jPanel1.add(radioPani);

        getContentPane().add(jPanel1);

        tytulPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tytuł"));
        tytulPanel.setLayout(new javax.swing.BoxLayout(tytulPanel, javax.swing.BoxLayout.PAGE_AXIS));

        checkProf.setText("Prof.");
        checkProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProfActionPerformed(evt);
            }
        });
        tytulPanel.add(checkProf);

        checkDr.setText("hab.");
        checkDr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDrActionPerformed(evt);
            }
        });
        tytulPanel.add(checkDr);

        checkMgr.setText("Dr");
        checkMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMgrActionPerformed(evt);
            }
        });
        tytulPanel.add(checkMgr);

        checkLicencjat.setText("inż.");
        checkLicencjat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLicencjatActionPerformed(evt);
            }
        });
        tytulPanel.add(checkLicencjat);

        checkMatura.setSelected(true);
        checkMatura.setText("Mgr");
        checkMatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMaturaActionPerformed(evt);
            }
        });
        tytulPanel.add(checkMatura);

        checkPodstawowka.setText("licencjat");
        checkPodstawowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPodstawowkaActionPerformed(evt);
            }
        });
        tytulPanel.add(checkPodstawowka);

        getContentPane().add(tytulPanel);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Imię"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        listaImionZenskich.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        suwakMeski.setViewportView(listaImionZenskich);

        jPanel7.add(suwakMeski);

        listaImionMeskich.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Wacek", "Bonifacy", "Ambroży", "Cezary", "Wójt gminy Kłaj", "Anna" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaImionMeskich.setSelectedIndex(2);
        listaImionMeskich.setVisibleRowCount(4);
        suwakDamski.setViewportView(listaImionMeskich);

        jPanel7.add(suwakDamski);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nazwisko"));

        nazwisko.setToolTipText("");
        nazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwiskoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Data ur."));

        jFormattedTextField1.setText("jFormattedTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("wypisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new java.awt.GridBagConstraints());

        jButton2.setText("zeruj");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new java.awt.GridBagConstraints());
        dopasujListeImion();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPanActionPerformed
        listaImionMeskich.setEnabled(true);
        listaImionZenskich.setEnabled(false);
    }//GEN-LAST:event_radioPanActionPerformed
    void dopasujListeImion() {

        suwakDamski.setVisible(true);
        suwakMeski.setVisible(false);
        
        
        pack();

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        radioPani.setSelected(true);
        tytulChecked = tytulPanel.getComponents();
        for (Component c : tytulChecked) {
            ((JCheckBox) c).setSelected(false);
        }
        listaImionMeskich.setSelectedIndex(1);
        boolean czyPan = radioPan.isSelected();
        listaImionMeskich.setEnabled(czyPan);
        listaImionZenskich.setEnabled(!czyPan);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String opis = "";

        if (radioPan.isSelected()) {
            opis += "Pan";
        } else {
            opis += "Pani";
        }

        tytulChecked = tytulPanel.getComponents();
        for (Component c : tytulChecked) {
            JCheckBox rb = (JCheckBox) c;
            if (rb.isSelected()) {
                opis += " " + rb.getText();
            }
        }
        opis += " o imionach:";
        imiona = listaImionMeskich.getSelectedValuesList();
        for (String imie : imiona) {
            opis += " " + imie;
        }
        System.out.println("Osoba " + opis);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioPaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPaniActionPerformed
        listaImionMeskich.setVisible(false);
        listaImionZenskich.setVisible(true);
    }//GEN-LAST:event_radioPaniActionPerformed

    private void checkProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProfActionPerformed

    private void checkMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMgrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMgrActionPerformed

    private void checkDrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDrActionPerformed

    private void checkLicencjatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLicencjatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLicencjatActionPerformed

    private void checkMaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMaturaActionPerformed

    private void checkPodstawowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPodstawowkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPodstawowkaActionPerformed

    private void nazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwiskoActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkDr;
    private javax.swing.JCheckBox checkLicencjat;
    private javax.swing.JCheckBox checkMatura;
    private javax.swing.JCheckBox checkMgr;
    private javax.swing.JCheckBox checkPodstawowka;
    private javax.swing.JCheckBox checkProf;
    private javax.swing.ButtonGroup grupaPlec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JList<String> listaImionMeskich;
    private javax.swing.JList<String> listaImionZenskich;
    private javax.swing.JTextField nazwisko;
    private javax.swing.JRadioButton radioPan;
    private javax.swing.JRadioButton radioPani;
    private javax.swing.JScrollPane suwakDamski;
    private javax.swing.JScrollPane suwakMeski;
    private javax.swing.JPanel tytulPanel;
    // End of variables declaration//GEN-END:variables
}