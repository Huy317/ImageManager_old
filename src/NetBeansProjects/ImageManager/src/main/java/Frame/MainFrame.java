/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        searchCategories = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        folderList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        propertiesList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        displayImage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        imagePreview = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveData = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        importMenu = new javax.swing.JMenu();
        importFolder = new javax.swing.JMenuItem();
        importImage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Image Manager");
        setBackground(new java.awt.Color(245, 237, 220));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        toolBar.setRollover(true);

        searchCategories.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        searchCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        toolBar.add(searchCategories);

        searchField.setColumns(10);
        searchField.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        toolBar.add(searchField);

        search.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        search.setText("Search");
        search.setFocusable(false);
        search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        toolBar.add(search);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        folderList.setLayout(new java.awt.CardLayout());

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        jList1.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        folderList.add(jScrollPane1, "card2");

        mainPanel.add(folderList, java.awt.BorderLayout.LINE_START);

        propertiesList.setLayout(new java.awt.CardLayout());

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        jList2.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        propertiesList.add(jScrollPane2, "card2");

        mainPanel.add(propertiesList, java.awt.BorderLayout.LINE_END);

        displayImage.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Image Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        displayImage.setLayout(new java.awt.CardLayout());

        imagePreview.setLayout(null);
        jScrollPane3.setViewportView(imagePreview);

        displayImage.add(jScrollPane3, "card2");

        mainPanel.add(displayImage, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("SFU Futura", 1, 12)); // NOI18N

        saveData.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        saveData.setText("Save Data");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        fileMenu.add(saveData);

        exit.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        exit.setText("Exit");
        fileMenu.add(exit);

        MenuBar.add(fileMenu);

        importMenu.setText("Import");
        importMenu.setFont(new java.awt.Font("SFU Futura", 1, 12)); // NOI18N

        importFolder.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        importFolder.setText("Import Folder");
        importFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFolderActionPerformed(evt);
            }
        });
        importMenu.add(importFolder);

        importImage.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        importImage.setText("Import Image");
        importImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importImageActionPerformed(evt);
            }
        });
        importMenu.add(importImage);

        MenuBar.add(importMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFolderActionPerformed
        // TODO add your handling code here:
         BufferedImage[] allImages;
        JFileChooser fileChooser = new JFileChooser(new File 
        (System.getProperty("user.home") + System.getProperty("file.separator")+ "Pictures"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Open");
        if (x == JFileChooser.APPROVE_OPTION) {
            File path = new File(fileChooser.getSelectedFile().toString());
            fileChooser.setAcceptAllFileFilterUsed(false);
            File allFiles[] = path.listFiles();
            allImages = new BufferedImage[allFiles.length];
            JButton button[] = new JButton[allFiles.length];
            imagePreview.setLayout(new GridLayout( (int) Math.round(Math.ceil(allFiles.length / 5)) ,5 ));
            for(int i = 0; i < allFiles.length; i++){
                try {
                    allImages[i] = ImageIO.read(allFiles[i]);
                    button[i] = new JButton();
                    ImageIcon icon = new ImageIcon(allImages[i]);
                    Image image = icon.getImage();
                    Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
                    ImageIcon iconNew = new ImageIcon(newimg);
                    button[i].setBackground(Color.WHITE);
                    button[i].setPreferredSize(new Dimension(100,100));
                    button[i].setIcon(iconNew);
                    imagePreview.add(button[i]);
                } catch (Exception e) {
                    
                }
            }
            setVisible(true);
            
        }
       
       
    }//GEN-LAST:event_importFolderActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveDataActionPerformed

    private void importImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importImageActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel displayImage;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel folderList;
    private javax.swing.JPanel imagePreview;
    private javax.swing.JMenuItem importFolder;
    private javax.swing.JMenuItem importImage;
    private javax.swing.JMenu importMenu;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel propertiesList;
    private javax.swing.JMenuItem saveData;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchCategories;
    private javax.swing.JTextField searchField;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
