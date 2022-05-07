
package votingsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Candidates extends javax.swing.JFrame {

    
    public Candidates() {
        initComponents();
        GetElections();
        DisplayCandidates();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        CAgeTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        CandNameTb = new javax.swing.JTextField();
        CandGenCb = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ElectionCb = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();
        CandidatePictureLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E - Voting Platform");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(522, 522, 522)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DeleteBtn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 102, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.setActionCommand("login");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Manage Candidates");

        EditBtn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 102, 0));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Name:");

        AddBtn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 102, 0));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Elections:");

        jButton4.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        CandidateTable.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CandidateTable.setForeground(new java.awt.Color(255, 102, 0));
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Photo", "Election", "Age"
            }
        ));
        CandidateTable.setRowHeight(25);
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);

        CandGenCb.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        CandGenCb.setForeground(new java.awt.Color(255, 102, 0));
        CandGenCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        CandGenCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandGenCbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Age :");

        jLabel11.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Gender:");

        ElectionCb.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ElectionCb.setForeground(new java.awt.Color(255, 102, 0));
        ElectionCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionCbMouseClicked(evt);
            }
        });
        ElectionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionCbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Photo:");

        BrowseBtn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(255, 102, 0));
        BrowseBtn.setText("Browse");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        CandidatePictureLbl.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidatePictureLbl.setText("photo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1022, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(461, 461, 461))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CandGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection Con = null;
PreparedStatement Pst =null; 
ResultSet Rs = null;
Statement St = null;
    private void GetElections()
    {
        try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           St = Con.createStatement();
           String Query = "select * from ElectionTbl";
           Rs = St.executeQuery(Query);
           while(Rs.next())
           {
               String ElectId = Rs.getString("EName");
               ElectionCb.addItem(ElectId);
           }
        } catch (Exception e){
            
        }
    }
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CandGenCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandGenCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandGenCbActionPerformed

    private void ElectionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionCbActionPerformed

    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseBtnActionPerformed
private ImageIcon ResizePhoto(String ImagePath,byte[] pic)
{
    ImageIcon MyImage = null;
    if(ImagePath != null)
    {
        MyImage = new ImageIcon(ImagePath);
    }else{
        MyImage = new ImageIcon(pic);
        
    }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(),CandidatePictureLbl.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}        
    
    
    String imgpath = null;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            CandidatePictureLbl.setIcon(ResizePhoto(path,null));
            imgpath = path;
        }                                      

    }//GEN-LAST:event_BrowseBtnMouseClicked
    private void DisplayCandidates(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St = Con.createStatement();
            Rs=St.executeQuery("Select * from CandidateTbl");
            CandidateTable.setModel(DbUtils.resultSetToTableModel(Rs));   
        } catch(Exception e)
        {
            
        }
    }
int CId;
Statement St1 = null;
ResultSet Rs1 = null;
    private void CandCount()
{
    try{
    St1 = Con.createStatement();
    Rs1= St1.executeQuery("select Max(CId) from CandidateTbl");
    Rs1.next();
    CId=Rs1.getInt(1)+1;
    } catch(Exception Ex)
    { 
        
    }   
}    
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(CAgeTb.getText().isEmpty()|| CandNameTb.getText().isEmpty()||ElectionCb.getSelectedIndex()==-1||CandGenCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else 
        {
            try{
            CandCount();
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            PreparedStatement Add = Con.prepareStatement("insert into CandidateTbl values(?,?,?,?,?,?)");
            InputStream img =new FileInputStream(imgpath);
            Add.setInt(1, CId);
            Add.setString(2, CandNameTb.getText());
            Add.setInt(3,Integer.valueOf(CAgeTb.getText()));
            Add.setString(4,CandGenCb.getSelectedItem().toString());
            Add.setBlob(5, img);
            Add.setString(6,ElectionCb.getSelectedItem().toString());
            int row =Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Candidate Registered");
            Con.close();
            DisplayCandidates();
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            } 
            
 
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    private void FetchPhoto()
    {
        String Query= "Select CPhoto from CandidateTbl where CId="+Key;
        Statement St;
        ResultSet Rs;
        try{
           
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
    St = Con.createStatement();
    Rs = St.executeQuery(Query);
    if(Rs.next())
    {
        CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("CPhoto")));
    }
    
        }catch (Exception e){
            
        }
    }
    int Key = -1;
    private void CandidateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CandidateTable.getModel();
        int MyIndex = CandidateTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CandNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        CAgeTb.setText(model.getValueAt(MyIndex, 2).toString());
        CandGenCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        CandGenCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        FetchPhoto();
        
    }//GEN-LAST:event_CandidateTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == -1 )
        {
            JOptionPane.showMessageDialog(this, "Select the Election To Be Deleted");
        }else{
            try 
            {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                String Query = "Delete from CandidateTbl where CId = "+Key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Candidate Deleted Successfully");
                DisplayCandidates();
            }catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(imgpath!=null){
            try 
            {   
              InputStream img = new FileInputStream(imgpath);
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                String Query = "Update CandidateTbl set CName=?,CAge=?,CGen=?,CPhoto=?,CElect=? where CId=?";
                PreparedStatement UpdateQuery = Con.prepareStatement(Query);
                UpdateQuery.setString(1,CandNameTb.getText());
                UpdateQuery.setInt(2,Integer.valueOf(CAgeTb.getText().toString()));
                UpdateQuery.setString(3,CandGenCb.getSelectedItem().toString());
                UpdateQuery.setBlob(4,img);
                UpdateQuery.setString(5,ElectionCb.getSelectedItem().toString());
                UpdateQuery.setInt(6,Key);
                if (UpdateQuery.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Candidate Updated Successfully");
                  DisplayCandidates();
                } else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }catch (Exception Ex) 
            {
                JOptionPane.showMessageDialog(this, Ex);
            }
        }
        else{
          JOptionPane.showMessageDialog(this, "Select Photo");
          CandidatePictureLbl.setIcon(null);
          CandidatePictureLbl.setText("");
        }
        imgpath = null;
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void ElectionCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionCbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionCbMouseClicked

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
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JTextField CAgeTb;
    private javax.swing.JComboBox CandGenCb;
    private javax.swing.JTextField CandNameTb;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidateTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox ElectionCb;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
