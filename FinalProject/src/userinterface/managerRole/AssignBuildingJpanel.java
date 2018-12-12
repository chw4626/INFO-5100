/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managerRole;

import business.building.Building;
import business.building.BuildingDirectory;
import business.enterprise.EnterpriseDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haowenchang
 */
public class AssignBuildingJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignBuilding
     */
    private EnterpriseDirectory enterprisedirectory;
    private BuildingDirectory buildingdirectory;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    public AssignBuildingJpanel(JPanel userProcessContainer, EnterpriseDirectory enterprisedirectory,BuildingDirectory buildingdirectory,UserAccount useraccount) {
        initComponents();
        this.enterprisedirectory = enterprisedirectory;
        this.buildingdirectory = buildingdirectory;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = useraccount;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuildings = new javax.swing.JTable();
        BackJBtn = new javax.swing.JButton();
        Selectagent = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 166, 234));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buildings' Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 21, 285, 31));

        tbBuildings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Cost", "Level", "Num of room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBuildings);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 89, 591, 187));

        BackJBtn.setText("<<<Back");
        BackJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJBtnActionPerformed(evt);
            }
        });
        add(BackJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 310, -1, -1));

        Selectagent.setText("Select Agent");
        Selectagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectagentActionPerformed(evt);
            }
        });
        add(Selectagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 310, 114, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel dtm=(DefaultTableModel)tbBuildings.getModel();
        dtm.setRowCount(0);
        
        for(Building building: buildingdirectory.getBuildinglist()){
    
            Object row[]= new Object[dtm.getColumnCount()];
            
            row[0] = building.getName();
            row[1] = building;
            row[2] = building.getCost();
            row[3] = building.getLevel();
            row[4] = building.getNpl();
            dtm.addRow(row);
        }
    }
    private void SelectagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectagentActionPerformed
        // TODO add your handling code here:

        int selectedrow=tbBuildings.getSelectedRow();

        if(selectedrow>=0){
            //Building building = (Building)tbBuildings.getValueAt(selectedrow, 0);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to agnecy this building??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Building building = (Building)tbBuildings.getValueAt(selectedrow, 1);

                SelectAgentJpanel sendBuildingJpanel = new SelectAgentJpanel(userProcessContainer, building, enterprisedirectory, userAccount);
                userProcessContainer.add("sendBuildingJpanel", sendBuildingJpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            /*int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Building building = (Building)tbBuildings.getValueAt(selectedrow, 0);
                buildingDir.delBuilding(building);
                populateTable();*/
            }
        else
            JOptionPane.showMessageDialog(null,"Please select any row");

    }//GEN-LAST:event_SelectagentActionPerformed

    private void BackJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJBtn;
    private javax.swing.JButton Selectagent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBuildings;
    // End of variables declaration//GEN-END:variables
}
