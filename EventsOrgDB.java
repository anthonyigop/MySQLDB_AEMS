/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class EventsOrgDB extends javax.swing.JFrame {

    String selectedvalue;
    String userInput;
    DefaultTableModel model;
    
    /**
     * Creates new form EventsOrgDB
     */
    public EventsOrgDB() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();

        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Add1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        textfield = new javax.swing.JTextField();
        EID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idEvent Organizers", "instructors_idInstructors"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Instructors (ID)");

        Add1.setText("CLEAR ALL");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Event Organizers (ID)", "Istructors (ID)" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        textfield.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });

        EID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EVENT ORGANIZER");
        jLabel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel2ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EID, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        try {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String idEvent_Organizers = model.getValueAt(selectedRow, 0).toString(); 
            String neweid = EID.getText();
            
            DB_connection.init();
            Connection c = DB_connection.getConnection();
            
            String query = "UPDATE mydb.`event organizers` SET instructors_idInstructors = ? WHERE idEvent_Organizers = ?";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, neweid);
            ps.setString(2, idEvent_Organizers);
            
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                LoadData();
            } else {
                JOptionPane.showMessageDialog(this, "Update Failed");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No row selected for update");
        }

    } catch (SQLException ex) {
        Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed

        EID.setText(" ");

    }//GEN-LAST:event_Add1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow == -1) {
                return;
            }

            String oldName = model.getValueAt(selectedRow, 0).toString();
            int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirmDelete == JOptionPane.YES_OPTION) {
                DB_connection.init();
                Connection c = DB_connection.getConnection();
                String query = "DELETE FROM mydb.`event organizers` WHERE idEvent_Organizers = ?";
                PreparedStatement ps = c.prepareStatement(query);
                ps.setString(1, oldName);

                int rowsDeleted = ps.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Successfully Deleted");
                    LoadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Deletion Failed");
                }

                ps.close();
                c.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        selectedvalue = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed

    private void EIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            DB_connection.init();
            Connection c = DB_connection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            model.setRowCount(0);
            String user = textfield.getText();
            String query = "";

            switch (selectedvalue) {
                case "Event Organizers (ID)":
                query = "SELECT * FROM mydb.`event organizers` WHERE idEvent_Organizers LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("idEvent_Organizers"),
                        rs.getString("instructors_idInstructors")
                    });
                }
                LoadData();
                break;

                case "Instructors (ID)":
                query = "SELECT * FROM mydb.`event organizers` WHERE instructors_idInstructors LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("idEvent_Organizers"),
                        rs.getString("instructors_idInstructors")
                    });
                }
                LoadData();
                break;

                default:
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;

            ps = c.prepareStatement("Insert into mydb.`event organizers` (instructors_idInstructors) values('" + EID.getText() + "')");

            if (!ps.execute()) {
                JOptionPane.showMessageDialog(this, "Successfuly Saved");
                LoadData();
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1) {
    String idEvent_Organizers = model.getValueAt(row, 0).toString();
    String instructors_idInstructors = model.getValueAt(row, 1).toString();
   
    EID.setText(instructors_idInstructors);
    
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentAdded

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
            java.util.logging.Logger.getLogger(EventsOrgDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventsOrgDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventsOrgDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventsOrgDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventsOrgDB().setVisible(true);
            }
        });
    }

    void LoadData() {
        try {
        DB_connection.init();
        Connection c = DB_connection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        model.setRowCount(0);
        String userInput = textfield.getText(); 
            String query = "SELECT * FROM mydb.`event organizers` WHERE instructors_idInstructors LIKE ?";
        ps = c.prepareStatement(query);
        String searchPattern = "%" + userInput + "%";
        ps.setString(1, searchPattern);
       
        rs = ps.executeQuery();
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("idEvent_Organizers"),
                rs.getString("instructors_idInstructors")
            });
        }
    } catch (SQLException ex) {
        Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Add1;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField EID;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables
}
