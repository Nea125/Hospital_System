
package views;
import controllers.PatienController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Patient extends javax.swing.JFrame {
     SimpleDateFormat d = new SimpleDateFormat("dd/MMM/yyyy");
      
     PatienController controller = new PatienController();
    public Patient() {
       initComponents();
       controller.FetchData();
       tbtable.setModel(controller.getModel());
      
    
    }
    public void Clear()
    {
        txtid.setText("");
        txtfirstname.setText("");
        txtlastname.setText("");
        txtage.setText("");
        cbgender.setSelectedIndex(0);
        txtbirthdate.setDate(null);
        txtaddress.setText("");
        txtphone.setText("");
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        cbgender = new javax.swing.JComboBox<>();
        btnexit = new necesario.MaterialButton();
        btnremove = new com.k33ptoo.components.KButton();
        btnsave = new com.k33ptoo.components.KButton();
        btnupdate = new necesario.MaterialButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnreset = new rojerusan.RSButtonMetro();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtbirthdate = new com.toedter.calendar.JDateChooser();
        cbsearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1182, 562));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("LastName");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 110, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("FirstName");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 120, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID      ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 110, 60, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 270, 70, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Age");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 230, 70, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("BirthDate");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 310, 90, 17);

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 0));
        txtid.setText("Auto ID");
        txtid.setAlignmentX(10.0F);
        txtid.setBorder(null);
        getContentPane().add(txtid);
        txtid.setBounds(120, 100, 220, 30);

        txtfirstname.setBackground(new java.awt.Color(255, 255, 255));
        txtfirstname.setForeground(new java.awt.Color(0, 0, 0));
        txtfirstname.setAlignmentX(10.0F);
        txtfirstname.setBorder(null);
        getContentPane().add(txtfirstname);
        txtfirstname.setBounds(120, 140, 220, 30);

        txtage.setBackground(new java.awt.Color(255, 255, 255));
        txtage.setForeground(new java.awt.Color(0, 0, 0));
        txtage.setAlignmentX(10.0F);
        txtage.setBorder(null);
        getContentPane().add(txtage);
        txtage.setBounds(120, 220, 220, 30);

        txtlastname.setBackground(new java.awt.Color(255, 255, 255));
        txtlastname.setForeground(new java.awt.Color(0, 0, 0));
        txtlastname.setAlignmentX(10.0F);
        txtlastname.setBorder(null);
        getContentPane().add(txtlastname);
        txtlastname.setBounds(120, 180, 220, 30);

        cbgender.setBackground(new java.awt.Color(255, 255, 255));
        cbgender.setForeground(new java.awt.Color(0, 0, 0));
        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbgender.setAlignmentX(10.0F);
        cbgender.setBorder(null);
        getContentPane().add(cbgender);
        cbgender.setBounds(120, 270, 220, 30);

        btnexit.setBackground(new java.awt.Color(102, 51, 255));
        btnexit.setForeground(new java.awt.Color(255, 102, 102));
        btnexit.setText("Exit");
        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(1060, 130, 100, 40);

        btnremove.setForeground(new java.awt.Color(0, 153, 0));
        btnremove.setText("Remove");
        btnremove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove);
        btnremove.setBounds(730, 130, 110, 40);

        btnsave.setBackground(new java.awt.Color(204, 0, 0));
        btnsave.setText("Save");
        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(410, 130, 120, 40);

        btnupdate.setBackground(new java.awt.Color(102, 51, 255));
        btnupdate.setForeground(new java.awt.Color(255, 102, 0));
        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(580, 130, 110, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Patient Information");
        kGradientPanel1.add(jLabel1);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(-20, 0, 1380, 50);

        btnreset.setBackground(new java.awt.Color(0, 102, 102));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);
        btnreset.setBounds(900, 130, 110, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 350, 70, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Phone");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 390, 70, 30);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "FirstName", "LastName", "Age", "Gender", "Address", "Phone", "BirthDate"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(360, 260, 800, 280);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Search");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 210, 90, 17);

        txtsearch.setBackground(new java.awt.Color(255, 255, 255));
        txtsearch.setForeground(new java.awt.Color(0, 0, 0));
        txtsearch.setAlignmentX(10.0F);
        txtsearch.setBorder(null);
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch);
        txtsearch.setBounds(450, 200, 560, 40);

        txtphone.setBackground(new java.awt.Color(255, 255, 255));
        txtphone.setForeground(new java.awt.Color(0, 0, 0));
        txtphone.setAlignmentX(10.0F);
        txtphone.setBorder(null);
        getContentPane().add(txtphone);
        txtphone.setBounds(120, 390, 220, 30);

        txtaddress.setBackground(new java.awt.Color(255, 255, 255));
        txtaddress.setForeground(new java.awt.Color(0, 0, 0));
        txtaddress.setAlignmentX(10.0F);
        txtaddress.setBorder(null);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(120, 350, 220, 30);

        txtbirthdate.setBackground(new java.awt.Color(255, 255, 255));
        txtbirthdate.setForeground(new java.awt.Color(0, 0, 0));
        txtbirthdate.setAlignmentX(10.0F);
        getContentPane().add(txtbirthdate);
        txtbirthdate.setBounds(120, 310, 220, 30);

        cbsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Bar....", "Search By ID", "Search By FirstName", "Search By LastName" }));
        cbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsearchActionPerformed(evt);
            }
        });
        getContentPane().add(cbsearch);
        cbsearch.setBounds(1020, 200, 140, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String firsName = txtfirstname.getText();
        String lastName = txtlastname.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = cbgender.getSelectedItem().toString();
        
        String address = txtaddress.getText();
        String phone = txtphone.getText();
        String birthDate = d.format(txtbirthdate.getDate());
        controller.Save(firsName, lastName, age, gender, address, phone, birthDate);
        controller.FetchData();
        Clear();
        
      
 
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Do you want to Update?","Update",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
              
            int id = Integer.parseInt(txtid.getText());
            String firsName = txtfirstname.getText();
            String lastName = txtlastname.getText();
            int age = Integer.parseInt(txtage.getText());

            String gender= cbgender.getSelectedItem().toString();
            String address = txtaddress.getText();
            String phone = txtphone.getText();
            String birthDate = d.format(txtbirthdate.getDate());
            controller.Update(firsName, lastName, age, gender, address, birthDate, phone, id);
            controller.FetchData();
            Clear();
          
          
            
            
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        if(JOptionPane.showConfirmDialog(null,"Do You want to Remove ","Remove",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
           controller.Remove(id);
           controller.FetchData();
            Clear();
           
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       if(JOptionPane.showConfirmDialog(null,"Do You want to Remove ","Remove",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            controller.Reset();
            controller.FetchData();
            Clear();
            
        }
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(controller.getModel().getValueAt(row, 0).toString());
        txtfirstname.setText(controller.getModel().getValueAt(row, 1).toString());
        txtlastname.setText(controller.getModel().getValueAt(row, 2).toString());
        txtage.setText(controller.getModel().getValueAt(row, 3).toString());
        cbgender.setSelectedItem(controller.getModel().getValueAt(row, 4).toString());
        txtaddress.setText(controller.getModel().getValueAt(row, 5).toString());
        txtphone.setText(controller.getModel().getValueAt(row, 6).toString());
        try {
            Date date = d.parse(controller.getModel().getValueAt(row, 7).toString());
            txtbirthdate.setDate(date);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       
      
    }//GEN-LAST:event_tbtableMouseClicked

    private void cbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsearchActionPerformed

    }//GEN-LAST:event_cbsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
         String search = txtsearch.getText();
      if(search.equals("")){
          controller.FetchData();
      }
      else{
         
                int option = cbsearch.getSelectedIndex();
                switch(option)
                {

                    // search by ID
                    case 1:{
                        int id = Integer.parseInt(txtsearch.getText());
                        controller.searchByID(id);
                    }break;
                     // search by FirstName
                    case 2:{
                        String searchbyfirstname = txtsearch.getText();
                        controller.searchByFirstName(searchbyfirstname);

                    }break;
                     // search by LastName
                    case 3:{
                    String searchlastname = txtsearch.getText();
                        controller.searchByLastName(searchlastname);
                    }break;
                }
      }
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btnexit;
    private com.k33ptoo.components.KButton btnremove;
    private rojerusan.RSButtonMetro btnreset;
    private com.k33ptoo.components.KButton btnsave;
    private necesario.MaterialButton btnupdate;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private com.toedter.calendar.JDateChooser txtbirthdate;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
