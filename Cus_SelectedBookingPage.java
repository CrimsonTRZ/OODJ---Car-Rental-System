/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author iankiew
 */
public class Cus_SelectedBookingPage extends javax.swing.JFrame {
    private String user;
    private ArrayList<String> bookData;

    /**
     * Creates new form Cus_SelectedBookingPage
     */
    public Cus_SelectedBookingPage() {
        initComponents();
    }
    
    public Cus_SelectedBookingPage(String user, ArrayList<String> bookData) {
        this.user = user;
        this.bookData = bookData;
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

        HeaderPanel = new javax.swing.JPanel();
        ExitIcon = new javax.swing.JLabel();
        HomeIcon1 = new javax.swing.JLabel();
        BackIcon = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        startTextField = new javax.swing.JTextField();
        endTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        ActionButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        ExitIcon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setText("X");
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
            }
        });

        HomeIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeIcon.png"))); // NOI18N
        HomeIcon1.setText("jLabel8");
        HomeIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeIcon1.setPreferredSize(new java.awt.Dimension(30, 30));
        HomeIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeIcon1MouseClicked(evt);
            }
        });

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackIcon.png"))); // NOI18N
        BackIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HomeIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(BackIcon)
                .addGap(18, 18, 18)
                .addComponent(ExitIcon)
                .addGap(19, 19, 19))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackIcon)
                    .addComponent(ExitIcon))
                .addContainerGap())
        );

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Status:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        statusTextField.setEditable(false);
        getContentPane().add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 330, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Booking ID:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Car Model:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pick Up Date:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Return Date:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Subtotal (RM):");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        idTextField.setEditable(false);
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 330, 30));

        modelTextField.setEditable(false);
        getContentPane().add(modelTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, 30));

        startTextField.setEditable(false);
        getContentPane().add(startTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 330, 30));

        endTextField.setEditable(false);
        getContentPane().add(endTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 330, 30));

        totalTextField.setEditable(false);
        getContentPane().add(totalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, 30));

        ActionButton.setBackground(new java.awt.Color(120, 134, 107));
        ActionButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ActionButton.setForeground(new java.awt.Color(255, 255, 255));
        ActionButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActionButton.setBorderPainted(false);
        ActionButton.setOpaque(true);
        ActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ActionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 140, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SelectedBookingBackground.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitIconMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitIconMouseClicked

    private void ActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionButtonActionPerformed
        // TODO add your handling code here:
        Cus_SelectedBooking sb = new Cus_SelectedBooking();
        CommonFunction cf = new CommonFunction();
        if(bookData.get(5).equals("PENDING")){
            //cancel booking
            int choice = JOptionPane.showConfirmDialog(this,"Are u sure?", "Cancel Booking",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(choice == JOptionPane.YES_OPTION){
               sb.cancelBooking(bookData.get(0));
               JOptionPane.showMessageDialog(this, "Booking is CANCELLED");
               cf.DisplayDisposeForm(new Cus_BookingStatusPage(user), this);
            }
        } else if (bookData.get(5).equals("APPROVED")) {
            cf.DisplayDisposeForm(new Cus_PaymentPage(user, bookData), this);
        } else {
            cf.DisplayDisposeForm(new Cus_ReceiptPage(user, bookData.get(0)), this);
        }
        
        
    }//GEN-LAST:event_ActionButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        idTextField.setText(bookData.get(0));
        modelTextField.setText(bookData.get(1));
        startTextField.setText(bookData.get(2));
        endTextField.setText(bookData.get(3));
        totalTextField.setText(bookData.get(4));
        statusTextField.setText(bookData.get(5));
        
        Cus_SelectedBooking sb = new Cus_SelectedBooking();
        String[] btn = sb.buttonDesign(bookData.get(5));
        ActionButton.setBackground(Color.decode(btn[0]));
        ActionButton.setText(btn[1]);
    }//GEN-LAST:event_formWindowOpened

    private void HomeIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIcon1MouseClicked
        // TODO add your handling code here:
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new Cus_IndexPage(user), this);
    }//GEN-LAST:event_HomeIcon1MouseClicked

    private void BackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMouseClicked
        // TODO add your handling code here:
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new Cus_BookingStatusPage(user), this);
    }//GEN-LAST:event_BackIconMouseClicked

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
            java.util.logging.Logger.getLogger(Cus_SelectedBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus_SelectedBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus_SelectedBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus_SelectedBookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus_SelectedBookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActionButton;
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel ExitIcon;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HomeIcon1;
    private javax.swing.JTextField endTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField startTextField;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
