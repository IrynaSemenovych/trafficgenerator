/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralFinishWizardPanel.java
 *
 * Created on 08-Jul-2010, 10:29:33
 */

package md.shaman.forms.wizard;

/**
 *
 * @author AlexandruC
 */
public class GeneralFinishWizardPanel extends javax.swing.JPanel {

    /** Creates new form GeneralFinishWizardPanel */
    public GeneralFinishWizardPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startNowCheckBox = new javax.swing.JCheckBox();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(md.shaman.TrafficGeneratorApp.class).getContext().getResourceMap(GeneralFinishWizardPanel.class);
        startNowCheckBox.setText(resourceMap.getString("startNowCheckBox.text")); // NOI18N
        startNowCheckBox.setName("startNowCheckBox"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(startNowCheckBox)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(startNowCheckBox)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JCheckBox startNowCheckBox;
    // End of variables declaration//GEN-END:variables

}