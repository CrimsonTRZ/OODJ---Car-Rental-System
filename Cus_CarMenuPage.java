/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.*;

/**
 *
 * @author iankiew
 */
public class Cus_CarMenuPage extends javax.swing.JFrame {
    private ArrayList<List> availableCarList = new ArrayList<>();
    private String[] selectedDates;
    private String user;
    /**
     * Creates new form CarMenuPage
     * 
     */
    public Cus_CarMenuPage() {
        initComponents();
    }
    
    public Cus_CarMenuPage(ArrayList<List> carList, String[] dates, String user) {
        availableCarList = carList;
        selectedDates = dates;
        this.user = user;
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
        nameLabel = new javax.swing.JLabel();
        prevIconLabel = new javax.swing.JLabel();
        nextIconLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        ExitIcon = new javax.swing.JLabel();
        HomeIcon = new javax.swing.JLabel();
        BackIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        carTypeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numSeatsTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        BookButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BrandComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(120, 134, 107));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setPreferredSize(new java.awt.Dimension(354, 28));

        prevIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PreviousIcon.png"))); // NOI18N
        prevIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevIconLabelMouseClicked(evt);
            }
        });

        nextIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NextIcon.png"))); // NOI18N
        nextIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextIconLabelMouseClicked(evt);
            }
        });

        brandLabel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandLabel.setPreferredSize(new java.awt.Dimension(354, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(prevIconLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brandLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(nextIconLabel)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(brandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prevIconLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nextIconLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 110));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        ExitIcon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setText("X");
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
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
                .addComponent(HomeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(BackIcon)
                .addGap(18, 18, 18)
                .addComponent(ExitIcon)
                .addGap(19, 19, 19))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitIcon)
                    .addComponent(BackIcon))
                .addContainerGap())
        );

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Car Type:");

        carTypeTextField.setEditable(false);
        carTypeTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of Seats:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rental Price Per Day (RM):");

        numSeatsTextField.setEditable(false);
        numSeatsTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        priceTextField.setEditable(false);
        priceTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        BookButton.setBackground(new java.awt.Color(170, 53, 65));
        BookButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        BookButton.setText("BOOK NOW");
        BookButton.setBorderPainted(false);
        BookButton.setOpaque(true);
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(carTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(numSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(carTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(numSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 500, 460));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CarMenuBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 500, 460));

        jPanel3.setBackground(new java.awt.Color(75, 82, 69));

        BrandComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        BrandComboBox.setBorder(null);
        BrandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(BrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitIconMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitIconMouseClicked

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:  
        String carSelected = brandLabel.getText() + " " + nameLabel.getText();
        //display the next form
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new Cus_BookingPage(carSelected, availableCarList, selectedDates, user), this);
    }//GEN-LAST:event_BookButtonActionPerformed

    private void BrandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandComboBoxActionPerformed
        // TODO add your handling code here:
        String brand = BrandComboBox.getSelectedItem().toString();

        Cus_AvailableCarDetails acd = new Cus_AvailableCarDetails();
        acd.setCarList(availableCarList);
        acd.setCarsFromBrand(brand);
        List<String> carInfo = acd.getCarsFromBrand().get(0);
        brandLabel.setText(carInfo.get(5));
        nameLabel.setText(carInfo.get(0));
        carTypeTextField.setText(carInfo.get(1));
        numSeatsTextField.setText(carInfo.get(2));
        priceTextField.setText(carInfo.get(3));
    }//GEN-LAST:event_BrandComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //set combo box items
        Cus_AvailableCarDetails acd = new Cus_AvailableCarDetails();
        acd.setCarList(availableCarList);
        acd.availableCarBrands().forEach((n) -> BrandComboBox.addItem(n));
        
        //display car info
        acd.setCarsFromBrand(acd.availableCarBrands().get(0));
        List<String> carInfo = acd.getCarsFromBrand().get(0);
        brandLabel.setText(carInfo.get(5));
        nameLabel.setText(carInfo.get(0));
        carTypeTextField.setText(carInfo.get(1));
        numSeatsTextField.setText(carInfo.get(2));
        priceTextField.setText(carInfo.get(3));  
    }//GEN-LAST:event_formWindowOpened

    private void nextIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextIconLabelMouseClicked
        // TODO add your handling code here:
        String brand = BrandComboBox.getSelectedItem().toString();
        
        Cus_AvailableCarDetails acd = new Cus_AvailableCarDetails();
        acd.setCarList(availableCarList);
        acd.setCarsFromBrand(brand);
        acd.setIndex("next");
        List<String> carInfo = acd.getCarsFromBrand().get(acd.getIndex());
        brandLabel.setText(carInfo.get(5));
        nameLabel.setText(carInfo.get(0));
        carTypeTextField.setText(carInfo.get(1));
        numSeatsTextField.setText(carInfo.get(2));
        priceTextField.setText(carInfo.get(3));  
    }//GEN-LAST:event_nextIconLabelMouseClicked

    private void prevIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevIconLabelMouseClicked
        // TODO add your handling code here:
        String brand = BrandComboBox.getSelectedItem().toString();
        
        Cus_AvailableCarDetails acd = new Cus_AvailableCarDetails();
        acd.setCarList(availableCarList);
        acd.setCarsFromBrand(brand);
        acd.setIndex("prev");
        List<String> carInfo = acd.getCarsFromBrand().get(acd.getIndex());
        brandLabel.setText(carInfo.get(5));
        nameLabel.setText(carInfo.get(0));
        carTypeTextField.setText(carInfo.get(1));
        numSeatsTextField.setText(carInfo.get(2));
        priceTextField.setText(carInfo.get(3));  
    }//GEN-LAST:event_prevIconLabelMouseClicked

    private void HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseClicked
        // TODO add your handling code here:
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new Cus_IndexPage(user), this);
    }//GEN-LAST:event_HomeIconMouseClicked

    private void BackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMouseClicked
        // TODO add your handling code here:
        CommonFunction cf = new CommonFunction();
        cf.DisplayDisposeForm(new Cus_SelectDatePage(user), this);
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
            java.util.logging.Logger.getLogger(Cus_CarMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus_CarMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus_CarMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus_CarMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus_CarMenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIcon;
    private javax.swing.JButton BookButton;
    public javax.swing.JComboBox<String> BrandComboBox;
    private javax.swing.JLabel ExitIcon;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField carTypeTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nextIconLabel;
    private javax.swing.JTextField numSeatsTextField;
    private javax.swing.JLabel prevIconLabel;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
