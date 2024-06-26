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
public class InstructorDB extends javax.swing.JFrame {
    String selectedvalue;     
    String userInput;    
    DefaultTableModel model;
    /**
     * Creates new form InstructorDB
     */
    public InstructorDB() {
        initComponents();
        model=(DefaultTableModel) jTable1.getModel();
        
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

        jLabel5 = new javax.swing.JLabel();
        EM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NA = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Dept = new javax.swing.JTextField();
        Add1 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        NA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAActionPerformed(evt);
            }
        });

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Department");

        Dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptActionPerformed(evt);
            }
        });

        Add1.setText("CLEAR ALL");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSTRUCTORS");
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "idInstructors", "Name", "Email", "Department" }));
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

        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idInstructors", "Name", "Email", "Department"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NA)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Dept)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EM, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentAdded

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;

            ps = c.prepareStatement("Insert into mydb.instructors (Name, Email, Department) values('" + NA.getText() + "','" + EM.getText() + "','" + Dept.getText() + "')");

            if (!ps.execute()) {
                JOptionPane.showMessageDialog(this, "Successfuly Saved");
                LoadData();
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        NA.setText(" ");
        Dept.setText(" "); 
        EM.setText(" ");
       
    }//GEN-LAST:event_Add1ActionPerformed

    private void NAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        selectedvalue = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed

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
                case "idInstructors":
                query = "SELECT * FROM mydb.instructors WHERE idInstructors LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("idInstructors"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Department")
                    });
                }
                LoadData();
                break;

                case "Name":
                query = "SELECT * FROM mydb.instructors WHERE Name LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                       rs.getString("idInstructors"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Department")
                    });
                }
                LoadData();
                break;

                case "Email":
                query = "SELECT * FROM mydb.instructors WHERE Email LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("idInstructors"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Department")
                    });
                }
                LoadData();
                break;

                case "Department":
                query = "SELECT * FROM mydb.instructors WHERE Department LIKE ?";
                ps = c.prepareStatement(query);
                ps.setString(1, "%" + user + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("idInstructors"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Department")
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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        try {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {
            String id = model.getValueAt(selectedRow, 0).toString();
            String newName = NA.getText();
            String newDept = Dept.getText();
            String newEmail = EM.getText();

            DB_connection.init();
            Connection c = DB_connection.getConnection();
            String query = "UPDATE mydb.instructors SET Name = ?, Department = ?, Email = ? WHERE idInstructors = ?";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, newName);
            ps.setString(2, newDept);
            ps.setString(3, newEmail);
            ps.setString(4, id);

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                LoadData();
            } else {
                JOptionPane.showMessageDialog(this, "Update Failed");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(InstructorDB.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        
        String Name = model.getValueAt(row, 1).toString();
        String Department = model.getValueAt(row, 3).toString();
        String Email = model.getValueAt(row,2).toString();
        
        
        NA.setText(Name);
        Dept.setText(Department);
        EM.setText(Email);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMActionPerformed

    private void DeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeptActionPerformed

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
                String query = "DELETE FROM mydb.instructors WHERE idInstructors  = ?";
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
        }
         catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(InstructorDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Add1;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Dept;
    private javax.swing.JTextField EM;
    private javax.swing.JTextField NA;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables

     void LoadData() {
          try {
        DB_connection.init();
        Connection c = DB_connection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        model.setRowCount(0);
        String userInput = textfield.getText(); // Get the input from the textfield
        String query = "SELECT * FROM mydb.instructors WHERE Name LIKE ? OR Email LIKE ? OR Department LIKE ?";
        ps = c.prepareStatement(query);
        String searchPattern = "%" + userInput + "%";
        ps.setString(1, searchPattern);
        ps.setString(2, searchPattern);
        ps.setString(3, searchPattern);
       
        rs = ps.executeQuery();
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("idInstructors"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Department")
            });
        }
    } catch (SQLException ex) {
        Logger.getLogger(StudentsDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     }
}
