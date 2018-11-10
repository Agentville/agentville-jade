/*****************************************************************
JADE - Java Agent DEvelopment Framework is a framework to develop 
multi-agent systems in compliance with the FIPA specifications.
Copyright (C) 2000 CSELT S.p.A. 

GNU Lesser General Public License

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, 
version 2.1 of the License. 

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA  02111-1307, USA.
*****************************************************************/

package jade.tools.persistence;

/**
 *
 * @author  rimassa
 */
class ConnectMetaDBDlgBody extends javax.swing.JPanel {
    
    /** Creates new form ConnectMetaDBDlgBody */
    public ConnectMetaDBDlgBody() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        firstColumnPanel = new javax.swing.JPanel();
        aliasLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        secondColumnPanel = new javax.swing.JPanel();
        aliasText = new javax.swing.JTextField();
        urlText = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        firstColumnPanel.setLayout(new javax.swing.BoxLayout(firstColumnPanel, javax.swing.BoxLayout.Y_AXIS));

        aliasLabel.setLabelFor(aliasText);
        aliasLabel.setText("Alias: ");
        aliasLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        firstColumnPanel.add(aliasLabel);

        urlLabel.setLabelFor(urlText);
        urlLabel.setText("URL: ");
        urlLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        firstColumnPanel.add(urlLabel);

        add(firstColumnPanel);

        secondColumnPanel.setLayout(new javax.swing.BoxLayout(secondColumnPanel, javax.swing.BoxLayout.Y_AXIS));

        aliasText.setColumns(40);
        secondColumnPanel.add(aliasText);

        urlText.setColumns(40);
        secondColumnPanel.add(urlText);

        add(secondColumnPanel);

    }//GEN-END:initComponents

    public String getURL() {
        return urlText.getText();
    }
    
    public String getAlias() {
        return aliasText.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aliasLabel;
    private javax.swing.JTextField aliasText;
    private javax.swing.JPanel firstColumnPanel;
    private javax.swing.JPanel secondColumnPanel;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlText;
    // End of variables declaration//GEN-END:variables
    
}
