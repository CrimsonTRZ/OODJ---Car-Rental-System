/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ad_viewCustBookingPage extends javax.swing.JFrame {
    private String user;
    private ArrayList<List> fileContentSplit = new ArrayList<>();
    private int row, colCount;
    private String content, BookingID;
    private String[] selectedRow = new String[10];
    private String[] addtoRow = new String [10];
    private String[] columns = {"Booking ID", "Customer Name", "Customer IC/Passport", "Customer Contact No.", "Customer Email", "Car Model", "Start Date", "End Date", "Subtotal", "Status"};
    private DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form ad_viewCustBookingPage
     */
    public ad_viewCustBookingPage() {
        model.setColumnIdentifiers(columns);
        initComponents();
    }
    
    public ad_viewCustBookingPage(String user) {
        this.user = user;
        model.setColumnIdentifiers(columns);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custBookingTbl = new javax.swing.JTable();
        searchIcon = new javax.swing.JLabel();
        updateBookingBtn = new javax.swing.JButton();
        delBookingBtn = new javax.swing.JButton();
        bookingID = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitIcon = new javax.swing.JLabel();
        HomeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(120, 134, 107));

        custBookingTbl.setModel(model

        );
        custBookingTbl.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(custBookingTbl);

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
        });

        updateBookingBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBookingBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateBookingBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBookingBtn.setText("Update Booking Details");
        updateBookingBtn.setBorderPainted(false);
        updateBookingBtn.setOpaque(true);
        updateBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookingBtnActionPerformed(evt);
            }
        });

        delBookingBtn.setBackground(new java.awt.Color(0, 0, 0));
        delBookingBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        delBookingBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBookingBtn.setText("Delete Booking");
        delBookingBtn.setBorderPainted(false);
        delBookingBtn.setOpaque(true);
        delBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBookingBtnActionPerformed(evt);
            }
        });

        bookingID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bookingID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookingID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingIDActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setText("Customer Booking Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBookingBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(delBookingBtn)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookingID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, -1, 610));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        exitIcon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        exitIcon.setForeground(new java.awt.Color(255, 255, 255));
        exitIcon.setText("X");
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeIcon.png"))); // NOI18N
        HomeIcon.setText("jLabel8");
        HomeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeIcon.setPreferredSize(new java.awt.Dimension(30, 30));
        HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HomeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(HomeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 857, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitIconMouseClicked

    private void updateBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookingBtnActionPerformed
        row = custBookingTbl.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row.", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < colCount; i++){
                selectedRow[i] = String.valueOf(model.getValueAt(row, i));
            }
            ad_manageCustPage manageCust = new ad_manageCustPage(user);
            manageCust.setTextFields(selectedRow);
            CommonFunction cf = new CommonFunction();
            cf.DisplayDisposeForm(manageCust, this);
        }
    }//GEN-LAST:event_updateBookingBtnActionPerformed

    private void delBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBookingBtnActionPerformed
        row = custBookingTbl.getSelectedRow();
        if( row == -1){
            JOptionPane.showMessageDialog(this, "Please select a row.", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < colCount; i++){
                selectedRow[i] = String.valueOf(model.getValueAt(row, i));
            }
            ad_manageCustPage manageCust = new ad_manageCustPage(user);
            manageCust.setTextFields(selectedRow);
            CommonFunction cf = new CommonFunction();
            cf.DisplayDisposeForm(manageCust, this);
        }
    }//GEN-LAST:event_delBookingBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FileHandling fh = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        fh.readFile();
        colCount = model.getColumnCount();
        fileContentSplit = fh.getfileContent();
        
        for (int i = 1; i < fileContentSplit.size(); i++){
            for ( int y = 0; y < colCount; y++){
                content = fileContentSplit.get(i).get(y).toString();
                addtoRow[y] = content;
            }
            model.addRow(addtoRow);
        }
        
        bookingID.removeAllItems();
        bookingID.addItem("--Select Booking ID--");
        for (int i = 1; i < fileContentSplit.size(); i++){
            content = fileContentSplit.get(i).get(0).toString();
            bookingID.addItem(content);
        }  
    }//GEN-LAST:event_formWindowOpened

    private void bookingIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingIDActionPerformed

    }//GEN-LAST:event_bookingIDActionPerformed

    private void HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseClicked
        // TODO add your handling code here:
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new ad_IndexPage(user), this);
    }//GEN-LAST:event_HomeIconMouseClicked

    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
        // TODO add your handling code here:
        boolean searchFound = true;
        BookingID = bookingID.getSelectedItem().toString();
        
        for (int i = 1; i < fileContentSplit.size(); i++){
            if(BookingID.equals(fileContentSplit.get(i).get(0))){
                for (int y = 0; y<colCount; y++){
                    content = fileContentSplit.get(i).get(y).toString();
                    addtoRow[y] = content;
                }
                model.setRowCount(0);
                model.addRow(addtoRow);
                searchFound = true;
                break;
            }
            else{
                searchFound = false;
            }
        }
        
        if(!searchFound){
            JOptionPane.showMessageDialog(this, "<html>Customer Booking ID <b>does not</b> exist. Please Select a valid Booking ID.</html>", "Error Message", JOptionPane.ERROR_MESSAGE);
            model.setRowCount(0);
            for (int i = 1; i < fileContentSplit.size(); i++){
                for ( int y = 0; y < colCount; y++){
                    content = fileContentSplit.get(i).get(y).toString();
                    addtoRow[y] = content;
                }
                model.addRow(addtoRow);
            }
        }
    }//GEN-LAST:event_searchIconMouseClicked

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
            java.util.logging.Logger.getLogger(ad_viewCustBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ad_viewCustBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ad_viewCustBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ad_viewCustBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ad_viewCustBookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JComboBox<String> bookingID;
    private javax.swing.JTable custBookingTbl;
    private javax.swing.JButton delBookingBtn;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateBookingBtn;
    // End of variables declaration//GEN-END:variables
}
