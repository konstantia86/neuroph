package org.neuroph.netbeans.visual.dialogs;

import java.util.ArrayList;
import org.neuroph.core.Layer;
import org.neuroph.core.Neuron;
import org.neuroph.core.transfer.TransferFunction;
import org.neuroph.netbeans.visual.NeuralNetworkEditor;
import org.neuroph.netbeans.visual.widgets.NeuralNetworkScene;
import org.neuroph.util.Neuroph;
import org.openide.util.Exceptions;

/**
 *
 * @author Uros
 */
public class ChangeTransferFunctionDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChangeTransferFunctionDialog
     */
    Neuron neuron;
    Layer layer;
    NeuralNetworkScene scene;
    NeuralNetworkEditor editor;
    
    public ChangeTransferFunctionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillCombo();
        
    }
    
    public ChangeTransferFunctionDialog(java.awt.Frame parent, boolean modal, Neuron neuron, NeuralNetworkScene scene) {
        super(parent, modal);
        this.neuron = neuron;
        this.scene = scene;
        editor = scene.getNeuralNetworkEditor();
        initComponents();
        fillCombo();        
    }
    
    public ChangeTransferFunctionDialog(java.awt.Frame parent, boolean modal, Layer layer, NeuralNetworkScene scene) {
        super(parent, modal);
        this.layer = layer;
        this.scene = scene;
        editor = scene.getNeuralNetworkEditor();
        initComponents();
        fillCombo();        
    }
    
    public final void fillCombo() {
        
        ArrayList transferFuncs = Neuroph.getInstance().getTransferFunctions();
        javax.swing.DefaultComboBoxModel transferFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(transferFuncs.toArray()));
        transferFunctionTypeComboBox.setModel(transferFunctionComboBoxModel);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        transferFunctionTypeLabel = new javax.swing.JLabel();
        transferFunctionTypeComboBox = new javax.swing.JComboBox();
        changeTransferFunctionButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(ChangeTransferFunctionDialog.class, "ChangeTransferFunctionDialog.title")); // NOI18N
        setResizable(false);

        org.openide.awt.Mnemonics.setLocalizedText(transferFunctionTypeLabel, org.openide.util.NbBundle.getMessage(ChangeTransferFunctionDialog.class, "ChangeTransferFunctionDialog.transferFunctionTypeLabel.text")); // NOI18N

        transferFunctionTypeComboBox.setToolTipText(org.openide.util.NbBundle.getMessage(ChangeTransferFunctionDialog.class, "ChangeTransferFunctionDialog.transferFunctionTypeComboBox.toolTipText")); // NOI18N
        transferFunctionTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferFunctionTypeComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(changeTransferFunctionButton, org.openide.util.NbBundle.getMessage(ChangeTransferFunctionDialog.class, "ChangeTransferFunctionDialog.changeTransferFunctionButton.text")); // NOI18N
        changeTransferFunctionButton.setMaximumSize(new java.awt.Dimension(65, 23));
        changeTransferFunctionButton.setMinimumSize(new java.awt.Dimension(65, 23));
        changeTransferFunctionButton.setPreferredSize(new java.awt.Dimension(65, 23));
        changeTransferFunctionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTransferFunctionButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(ChangeTransferFunctionDialog.class, "ChangeTransferFunctionDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferFunctionTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(transferFunctionTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(changeTransferFunctionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferFunctionTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferFunctionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeTransferFunctionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeTransferFunctionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTransferFunctionButtonActionPerformed
        try {            
            Class<? extends TransferFunction> transferFunctionClass = (Class<? extends TransferFunction>) Class.forName("org.neuroph.core.transfer." + ((String) transferFunctionTypeComboBox.getSelectedItem()).trim());
            
            if (neuron != null) {
                editor.setNeuronTransferFunction(neuron, transferFunctionClass.newInstance());
            } else {
                editor.setLayerTransferFunction(layer, transferFunctionClass);
                
            }
            
            this.dispose();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_changeTransferFunctionButtonActionPerformed
    
    private void transferFunctionTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferFunctionTypeComboBoxActionPerformed
        
        
    }//GEN-LAST:event_transferFunctionTypeComboBoxActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeTransferFunctionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeTransferFunctionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeTransferFunctionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeTransferFunctionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeTransferFunctionDialog dialog = new ChangeTransferFunctionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeTransferFunctionButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox transferFunctionTypeComboBox;
    private javax.swing.JLabel transferFunctionTypeLabel;
    // End of variables declaration//GEN-END:variables
}
