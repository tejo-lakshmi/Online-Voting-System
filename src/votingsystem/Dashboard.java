
package votingsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        DisplayElections();
    }
Connection Con = null;
   PreparedStatement Pst =null; 
   ResultSet Rs = null;
   Statement St = null;
   
    private void DisplayElections()
    {
        try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from ElectionTbl");
           ElectionsTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        WinnerLbl = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        VotesLbl = new javax.swing.JLabel();
        PercentageLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        WinnerLbl.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        WinnerLbl.setForeground(new java.awt.Color(255, 153, 0));
        WinnerLbl.setText("Name:");

        CandidatePictureLbl.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidatePictureLbl.setText("photo");

        BravoLbl.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(0, 204, 0));
        BravoLbl.setText("WINNER");

        jLabel7.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));

        jLabel12.setFont(new java.awt.Font("Serif", 3, 29)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Elections list");

        VotesLbl.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        VotesLbl.setForeground(new java.awt.Color(0, 204, 0));
        VotesLbl.setText("Votes");

        PercentageLbl.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        PercentageLbl.setForeground(new java.awt.Color(255, 102, 0));
        PercentageLbl.setText("Percentage");

        ElectionsTable.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ElectionsTable.setRowHeight(25);
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VotesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PercentageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BravoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(571, 571, 571))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(WinnerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(BravoLbl))
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WinnerLbl)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(VotesLbl)
                        .addGap(54, 54, 54)
                        .addComponent(PercentageLbl)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int Key= -1;
int WinnerId,Votes,Percentage;
private void GetWinner()
{
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
        St = Con.createStatement();
        String Query="select CandidateId, Count(CandidateId) from VotesTbl where ElectionId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1 ";
        Rs=St.executeQuery(Query);
        while (Rs.next()){
        //JOptionPane.showMessageDialog(this, ""+Rs.getInt(1));
            WinnerId = Rs.getInt(1);
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this,e);
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
int TotalVotes;
double WinPercentage;
private void GetPercentage(){
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
        St = Con.createStatement();
        String Query="select count(*) from VotesTbl where ElectionId="+Key;
        Rs=St.executeQuery(Query);
        while (Rs.next()){
        //JOptionPane.showMessageDialog(this, ""+Rs.getInt(1));
            TotalVotes = Rs.getInt(1);
            //VotesLbl.setText(Votes+"Votes");
        //JOptionPane.showMessageDialog(this, TotalVotes);
        WinPercentage=(Votes*100/TotalVotes);
        PercentageLbl.setText(new DecimalFormat("##.##").format(WinPercentage)+"%");
            
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this,e);
    }
}

private void GetVotes(){
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
        St = Con.createStatement();
        String Query="select Count(CandidateId) from VotesTbl where CandidateId="+WinnerId;
        Rs=St.executeQuery(Query);
        while (Rs.next()){
        //JOptionPane.showMessageDialog(this, ""+Rs.getInt(1));
            Votes = Rs.getInt(1);
            VotesLbl.setText(Votes+"Votes");
        //JOptionPane.showMessageDialog(this, ""+Votes);
            
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this,e);
    }
}
private void GetWinnerData(){
    String Query= "Select CPhoto,CName from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        try{
           
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
    St = Con.createStatement();
    Rs = St.executeQuery(Query);
    if(Rs.next())
    {
        CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("CPhoto")));
        WinnerLbl.setText(Rs.getString("CName"));
    }
    
        }catch (Exception e){
            
        }
}
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionsTable.getModel();
        int MyIndex = ElectionsTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        GetWinner();
        GetWinnerData();
        GetVotes();
        GetPercentage();
        //FetchPhoto();
    }//GEN-LAST:event_ElectionsTableMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel PercentageLbl;
    private javax.swing.JLabel VotesLbl;
    private javax.swing.JLabel WinnerLbl;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
