/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoby;

/**
 *
 * @author jurczyk
 */
public class GeneratorOsobFrame extends javax.swing.JFrame {

    /**
     * Creates new form GeneratorOsobFrame
     */
    public GeneratorOsobFrame() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        grupaPlec = new javax.swing.ButtonGroup();
        grupaTytul = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioPan = new javax.swing.JRadioButton();
        radioPani = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        checkProf = new javax.swing.JCheckBox();
        checkDr = new javax.swing.JCheckBox();
        checkHab = new javax.swing.JCheckBox();
        checkMgr = new javax.swing.JCheckBox();
        checkInz = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        suwakM = new javax.swing.JScrollPane();
        listaImionM = new javax.swing.JList<>();
        suwakD = new javax.swing.JScrollPane();
        listaImionD = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        poleNazwisko = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        przyciskWypisz = new javax.swing.JButton();
        przyciskZeruj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator Osób");
        getContentPane().setLayout(new java.awt.GridLayout(2, 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Płeć", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        grupaPlec.add(radioPan);
        radioPan.setText("Pan");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, przyciskZeruj, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), radioPan, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        radioPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPanActionPerformed(evt);
            }
        });
        jPanel1.add(radioPan);

        grupaPlec.add(radioPani);
        radioPani.setText("Pani");
        radioPani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPaniActionPerformed(evt);
            }
        });
        jPanel1.add(radioPani);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tytuł", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        checkProf.setText("Prof.");
        jPanel2.add(checkProf);

        checkDr.setText("dr");
        jPanel2.add(checkDr);

        checkHab.setText("hab.");
        jPanel2.add(checkHab);

        checkMgr.setText("mgr");
        jPanel2.add(checkMgr);

        checkInz.setText("inż.");
        jPanel2.add(checkInz);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imię", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        listaImionM.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Achacy", "Bonifacy", "Cezary", "Dionizy", "Eustachy", "Fiodor" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaImionM.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaImionM.setSelectedIndex(0);
        listaImionM.setVisibleRowCount(5);
        suwakM.setViewportView(listaImionM);

        jPanel7.add(suwakM);
        suwakM.setVisible(false);

        listaImionD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arleta", "Beatrycze", "Cecylia", "Dulcynea" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaImionD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaImionD.setSelectedIndex(0);
        listaImionD.setVisibleRowCount(5);
        suwakD.setViewportView(listaImionD);

        jPanel7.add(suwakD);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nazwisko", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(poleNazwisko, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data ur.", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2017, 1900, null, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        przyciskWypisz.setText("wypisz");
        przyciskWypisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskWypiszActionPerformed(evt);
            }
        });
        jPanel8.add(przyciskWypisz);

        przyciskZeruj.setText("zeruj");
        przyciskZeruj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskZerujActionPerformed(evt);
            }
        });
        jPanel8.add(przyciskZeruj);

        jPanel6.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel6);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskWypiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskWypiszActionPerformed
        String opis_osoby = "";
        
        boolean czyPan = radioPan.isSelected();
        
        if(czyPan) opis_osoby += "Pan";
        else opis_osoby += "Pani";
        
        if(checkProf.isSelected()) opis_osoby += " Prof.";
        if(checkHab.isSelected()) opis_osoby += " hab.";
        if(checkDr.isSelected()) opis_osoby += " dr";
        if(checkMgr.isSelected()) opis_osoby += " mgr";
        if(checkInz.isSelected()) opis_osoby += " inż.";
        
        if(czyPan)
            opis_osoby += " " + listaImionM.getSelectedValue();
        else
            opis_osoby += " " + listaImionD.getSelectedValue();
        
        opis_osoby += " " + poleNazwisko.getText();
                        
        System.out.println("Opis osoby: "+opis_osoby);
    }//GEN-LAST:event_przyciskWypiszActionPerformed

    private void przyciskZerujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskZerujActionPerformed
        radioPani.setSelected(true);
        checkProf.setSelected(false);
        checkHab.setSelected(false);
        checkDr.setSelected(false);
        checkMgr.setSelected(false);
        checkInz.setSelected(false);
        listaImionM.setSelectedIndex(0);
        listaImionD.setSelectedIndex(0);
        poleNazwisko.setText("");
    }//GEN-LAST:event_przyciskZerujActionPerformed

    private void radioPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPanActionPerformed
        suwakM.setVisible(true);
        suwakD.setVisible(false);
        pack();
    }//GEN-LAST:event_radioPanActionPerformed

    private void radioPaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPaniActionPerformed
        suwakM.setVisible(false);
        suwakD.setVisible(true);
        pack();
    }//GEN-LAST:event_radioPaniActionPerformed

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
            java.util.logging.Logger.getLogger(GeneratorOsobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratorOsobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratorOsobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratorOsobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratorOsobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkDr;
    private javax.swing.JCheckBox checkHab;
    private javax.swing.JCheckBox checkInz;
    private javax.swing.JCheckBox checkMgr;
    private javax.swing.JCheckBox checkProf;
    private javax.swing.ButtonGroup grupaPlec;
    private javax.swing.ButtonGroup grupaTytul;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JList<String> listaImionD;
    private javax.swing.JList<String> listaImionM;
    private javax.swing.JTextField poleNazwisko;
    private javax.swing.JButton przyciskWypisz;
    private javax.swing.JButton przyciskZeruj;
    private javax.swing.JRadioButton radioPan;
    private javax.swing.JRadioButton radioPani;
    private javax.swing.JScrollPane suwakD;
    private javax.swing.JScrollPane suwakM;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}