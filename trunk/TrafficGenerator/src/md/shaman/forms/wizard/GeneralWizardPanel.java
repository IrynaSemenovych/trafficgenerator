/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralWizardForm.java
 *
 * Created on 30-Jun-2010, 12:25:24
 */

package md.shaman.forms.wizard;

import java.awt.event.ActionListener;
import md.shaman.protocols.Protocol;
import md.shaman.protocols.Protocol.Direction;

/**
 *
 * @author AlexandruC
 */
public class GeneralWizardPanel extends javax.swing.JPanel {

    /** Creates new form GeneralWizardForm */
    public GeneralWizardPanel() {
        initComponents();
    }

    public Protocol.Type getProtocolType()
    {
        return Protocol.Type.valueOf(protocolTypeComboBox.getSelectedItem().toString());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        protocolTypeLabel = new javax.swing.JLabel();
        protocolTypeComboBox = new javax.swing.JComboBox();
        directionLabel = new javax.swing.JLabel();
        directionComboBox = new javax.swing.JComboBox();

        setName("Form"); // NOI18N

        protocolTypeLabel.setLabelFor(protocolTypeComboBox);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(md.shaman.TrafficGeneratorApp.class).getContext().getResourceMap(GeneralWizardPanel.class);
        protocolTypeLabel.setText(resourceMap.getString("protocolTypeLabel.text")); // NOI18N
        protocolTypeLabel.setName("protocolTypeLabel"); // NOI18N

        for(Protocol.Type s : Protocol.Type.values())
        protocolTypeComboBox.addItem(s.toString());
        protocolTypeComboBox.setName("protocolTypeComboBox"); // NOI18N

        directionLabel.setText(resourceMap.getString("directionLabel.text")); // NOI18N
        directionLabel.setName("directionLabel"); // NOI18N

        for(Protocol.Direction s : Protocol.Direction.values())
        directionComboBox.addItem(s.toString());
        directionComboBox.setName("directionComboBox"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(protocolTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(directionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(protocolTypeComboBox, 0, 150, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protocolTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(protocolTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directionLabel)
                    .addComponent(directionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox directionComboBox;
    private javax.swing.JLabel directionLabel;
    protected javax.swing.JComboBox protocolTypeComboBox;
    private javax.swing.JLabel protocolTypeLabel;
    // End of variables declaration//GEN-END:variables

}
