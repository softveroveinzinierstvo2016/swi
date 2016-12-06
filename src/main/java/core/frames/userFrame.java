/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.frames;
import core.db.entity.User;
import core.db.entity.Bank;
import core.db.entity.Condition;
import core.db.impl.BankDaoImpl;
import core.db.impl.ConditionDaoImpl;
import core.db.impl.UserDaoImpl;
import core.db.ints.BankDao;
import core.db.ints.ConditionDao;
import core.db.ints.UserDao;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Rastislav, Martin
 */
public class userFrame extends javax.swing.JFrame {

    private static BankDao bankDao = new BankDaoImpl();
    
    /***
     * 
     */
    public void inicializujTabulku(){
    DefaultTableModel tableModel = (DefaultTableModel)ponukyTable.getModel();
        List<Bank> banky = bankDao.getAll();
        ponukyTable.removeAll();
        tableModel.setNumRows(banky.size());
        for (int i = 0; i < banky.size(); i++) {
            Long id = banky.get(i).getId();
            String meno = banky.get(i).getName();
            Double rating = banky.get(i).getPrimeInterestRate();
            Object[] data = {id, meno, rating};
            tableModel.setValueAt(id, i, 0);
            tableModel.setValueAt(meno, i, 1);
            tableModel.setValueAt(rating, i, 2);
            }
    }
    
    /**
     * Creates new form userFrame
     * @param user prihlaseny uzivatel
     */
    public userFrame(User user) {
        initComponents();
        //inicializujTabulku();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pocetRokovLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ponukyTable = new javax.swing.JTable();
        sumaLabel = new javax.swing.JLabel();
        sumaTextField = new javax.swing.JTextField();
        vyhladajButton = new javax.swing.JButton();
        rokyField1 = new javax.swing.JTextField();

        pocetRokovLabel.setText("Pocet rokov:");

        ponukyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Meno", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ponukyTable);

        sumaLabel.setText("Suma:");

        vyhladajButton.setText("Vyhladaj");
        vyhladajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vyhladajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pocetRokovLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rokyField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sumaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(vyhladajButton)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pocetRokovLabel)
                    .addComponent(sumaLabel)
                    .addComponent(sumaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vyhladajButton)
                    .addComponent(rokyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vyhladajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vyhladajButtonActionPerformed
        inicializujTabulku();
    }//GEN-LAST:event_vyhladajButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pocetRokovLabel;
    private javax.swing.JTable ponukyTable;
    private javax.swing.JTextField rokyField1;
    private javax.swing.JLabel sumaLabel;
    private javax.swing.JTextField sumaTextField;
    private javax.swing.JButton vyhladajButton;
    // End of variables declaration//GEN-END:variables
}
