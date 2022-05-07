
package votingsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Voting extends javax.swing.JFrame {

    
    public Voting() {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
    }
    
    int VotingId;
    public Voting(int VoterId){
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
        VotingId =VoterId;
        //JOptionPane.showMessageDialog(this, VotingId);
    }
Connection Con = null;
PreparedStatement Pst =null; 
ResultSet Rs = null;
Statement St = null;
    private void DisplayCandidates(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St = Con.createStatement();
            Rs=St.executeQuery("Select * from CandidateTbl");
            CandidatesTable.setModel(DbUtils.resultSetToTableModel(Rs));   
        } catch(Exception e)
        {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CNameLbl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidatesTable = new javax.swing.JTable();
        voteadd = new javax.swing.JButton();
        CandidatePictureLbl = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        CNameLbl.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        CNameLbl.setForeground(new java.awt.Color(255, 102, 0));
        CNameLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameLblActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Voting time");

        jLabel10.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Your Candidate:");

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E - Voting Platform");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(512, 512, 512)
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

        jLabel8.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Name:");

        CandidatesTable.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        CandidatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CandidatesTable.setRowHeight(25);
        CandidatesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidatesTable);

        voteadd.setBackground(new java.awt.Color(102, 255, 51));
        voteadd.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        voteadd.setForeground(new java.awt.Color(255, 102, 0));
        voteadd.setText("Vote");
        voteadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voteaddMouseClicked(evt);
            }
        });
        voteadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteaddActionPerformed(evt);
            }
        });

        CandidatePictureLbl.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));

        BravoLbl.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(0, 204, 0));
        BravoLbl.setText("VoteCounted!! Bravo");

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

        jLabel12.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("List of candidates :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel10)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(BravoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(515, 515, 515)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(voteadd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(556, 556, 556))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BravoLbl)
                            .addComponent(voteadd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voteaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voteaddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CNameLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameLblActionPerformed
int Key=-1;
int ElecId;

    private void CandidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CandidatesTable.getModel();
        int MyIndex = CandidatesTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CNameLbl.setText(model.getValueAt(MyIndex, 1).toString());
        ElecId = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
        VotingId = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
        FetchPhoto();
        
    }//GEN-LAST:event_CandidatesTableMouseClicked
int VId;
Statement St1 = null;
ResultSet Rs1 = null;
    
    private void VCount()
{
    try{
    St1 = Con.createStatement();
    Rs1= St1.executeQuery("select Max(VoteId) from VotesTbl");
    Rs1.next();
    VId=Rs1.getInt(1)+1;
    } catch(Exception Ex){
        
    }
       
}
int VNumber;
    private void VCheck()
{
    try{
    St1 = Con.createStatement();
    Rs1= St1.executeQuery("select * from VotesTbl where  VoterId="+VotingId+" and ElectionId="+ElecId);
   if(Rs1.next()){
       VNumber=1;
   }else
   {
       VNumber=0;
   }
    } catch(Exception Ex)
    {
        JOptionPane.showMessageDialog(this,Ex);
        
}
}
    private void voteaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteaddMouseClicked
        VCheck();
        if(Key==-1 )
        {
            JOptionPane.showMessageDialog(this,"Select your Candidate");
        }else if(VNumber>0){//>0->>1
            JOptionPane.showMessageDialog(this,"You Can Not Vote Twice!!!");            
        }else
        {
            try{
              VCount();
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into VotesTbl values(?,?,?,?) ");
                Add.setInt(1, VId);
                //voterID
                Add.setInt(2,VotingId);
                Add.setInt(3,ElecId);
                Add.setInt(4,Key);
                int row = Add.executeUpdate();
                
                //JOptionPane.showMessageDialog(this,"Vote Counted");
                Con.close();
                BravoLbl.setVisible(true);
                //DisplayCandidates();
                voteadd.setVisible(false);
            } catch (Exception e){
           JOptionPane.showMessageDialog(this,e);     
            }
        }
    }//GEN-LAST:event_voteaddMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

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
    /**
     *
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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JTextField CNameLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidatesTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton voteadd;
    // End of variables declaration//GEN-END:variables
}
