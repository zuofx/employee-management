
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author truong
 */
public class MainJFrame extends javax.swing.JFrame {
    
    //ATTRIBUTES
    public Hashtable theHT;
    public FileManager tFiles;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        
        initComponents();
        theHT = new Hashtable(10);
        tFiles = new FileManager();
        tFiles.loadToHash(theHT);
        
        // Adapted 'Close' code by mKorbel https://stackoverflow.com/a/6084220
        WindowListener exitListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showOptionDialog(
                 null, "Are You Sure to Close Application? Any unsaved data will be lost.", 
                 "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
                 JOptionPane.WARNING_MESSAGE, null, null, null);
            if (confirm == 0) {
               System.exit(0);
                }
            }
        };
        addWindowListener(exitListener);
        //
        
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
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        editFButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reloadButton = new javax.swing.JButton();
        addExamplesButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee Management");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Huy Truong's Employee Management System");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("New Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Display Employees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exitButton.setText("Save & Quit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        editFButton.setText("Manage Employees");
        editFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFButtonActionPerformed(evt);
            }
        });

        jLabel1.setText(" Search/Edit/Remove:");

        reloadButton.setText("Reload Data");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        addExamplesButton.setText("Add Example Employees");
        addExamplesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamplesButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editFButton)
                            .addComponent(jLabel1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addExamplesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(reloadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editFButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(reloadButton)
                    .addComponent(addExamplesButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // OPENS ADD J FRAME
        AddJFrame theAddJFrame = new AddJFrame();
        theAddJFrame.setVisible(true);
        theAddJFrame.setHT(theHT);
        theAddJFrame.setTF(tFiles);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // OPENS DISPLAY J FRAME
        displayJFrame displayJF = new displayJFrame();
        displayJF.setVisible(true);
        displayJF.setDHT(theHT);
        displayJF.setTF(tFiles);
        displayJF.setTitle("Display Employees");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // CLOSES EVERYTHING
        tFiles.save(theHT);
        tFiles.finish(tFiles);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void editFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFButtonActionPerformed
        // OPENS EDIT J FRAME
        searchJFrame searchJF = new searchJFrame();
        searchJF.setVisible(true);
        searchJF.setHT(theHT);
        searchJF.setTF(tFiles);
    }//GEN-LAST:event_editFButtonActionPerformed

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        // TODO add your handling code here:
        
        tFiles.loadToHash(theHT);
        System.out.println("\nReloaded Employee Data.");
        
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void addExamplesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamplesButtonActionPerformed
        // TODO add your handling code here:
        Hashtable addHT = theHT;
        PTE thePTE2 = new PTE(791564, "Huy", "Truong", 1, "Ontario", 0.21, 14, 20, 45);
        addHT.add(thePTE2);
        tFiles.writeNew(thePTE2);
        
        thePTE2 = new PTE(433829, "James", "Surray", 1, "Ontario", 0.16, 14, 20, 45);
        addHT.add(thePTE2);
        tFiles.writeNew(thePTE2);
        
        FTE theFTE2 = new FTE(123456, "Patrick", "Li", 1, "Sauga", 0.14, 69420);
        addHT.add(theFTE2);
        tFiles.writeNew(theFTE2);
        
        theFTE2 = new FTE(583420, "Andrew", "Tolmachev", 2, "Brazil", 0.18, 58302);
        addHT.add(theFTE2);
        tFiles.writeNew(theFTE2);
        
        thePTE2 = new PTE(395732, "Richard", "Nguyen", 1, "Calgary", 0.13, 30, 20, 25);
        addHT.add(thePTE2);
        tFiles.writeNew(thePTE2);
        
        thePTE2 = new PTE(293473, "Percy", "Ranger", 1, "New Brunswick", 0.11, 45, 15, 20);
        addHT.add(thePTE2);
        tFiles.writeNew(thePTE2);
        
        theFTE2 = new FTE(104843, "Tarren", "Selvic", 1, "PEI", 0.08, 197500);
        addHT.add(theFTE2);
        tFiles.writeNew(theFTE2);
        
        theFTE2 = new FTE(238459, "Martha", "Selvic", 2, "PEI", 0.09, 197500);
        addHT.add(theFTE2);
        tFiles.writeNew(theFTE2);
    }//GEN-LAST:event_addExamplesButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        tFiles.save(theHT);
        System.out.println("\nSaving data...");
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExamplesButton;
    private javax.swing.JButton editFButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton reloadButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
