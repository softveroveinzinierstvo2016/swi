/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.frames;

import core.db.entity.User;
import core.db.entity.Bank;
import core.db.entity.BankCondition;
import core.db.entity.Condition;
import core.db.impl.BankConditionDaoImpl;
import core.db.impl.BankDaoImpl;
import core.db.impl.ConditionDaoImpl;
import core.db.impl.UserDaoImpl;
import core.db.ints.BankConditionDao;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;

/**
 *
 * @author Rastislav, Martin
 */
public class bankFrame extends javax.swing.JFrame {
private User userF;

    private static BankConditionDao bankConditionDao = new BankConditionDaoImpl();
    private BankCondition bankCond;
    private static ConditionDao conditionDao = new ConditionDaoImpl();
    private static BankDao bankDao = new BankDaoImpl();
    private static UserDao userDao = new UserDaoImpl();
    

     /***
    * vlozi do tablulky všetky podmienky nastavene bankou
    */ 
    public void inicializujTabulku(){
    DefaultTableModel tableModel = (DefaultTableModel)podmienkyTable.getModel();
        List<BankCondition> podmienky = bankConditionDao.getAll();
        podmienkyTable.removeAll();
        tableModel.setNumRows(podmienky.size());
        for (int i = 0; i < podmienky.size(); i++) {
            Long id = podmienky.get(i).getId();
            Long idB = podmienky.get(i).getIdB();
            Long idC = podmienky.get(i).getIdC();
            Object[] data = {id, idB, idC};
            tableModel.setValueAt(id, i, 0);
            tableModel.setValueAt(idB, i, 1);
            tableModel.setValueAt(idC, i, 2);
            }
    }
    /**
     * Creates new form bankFrame
     * @param user prihlaseny uzivatel
     */
    public bankFrame(User user) {
        userF = user;
        initComponents();
        inicializujComboboxy();
        inicializujTabulku();
    }
    
    public void inicializujComboboxy(){
        MarkComboBox1.removeAllItems();
        MarkComboBox1.addItem(">");
        MarkComboBox1.addItem(">=");
        MarkComboBox1.addItem("<");
        MarkComboBox1.addItem("<=");
        MarkComboBox1.addItem("=");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        podmienkyTable = new javax.swing.JTable();
        pridatPodmienkuButton = new javax.swing.JButton();
        vymazButton2 = new javax.swing.JButton();
        MarkComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ValueTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        changeRateTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idBTextField1 = new javax.swing.JTextField();
        idCTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        podmienkyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "IdB", "IdC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(podmienkyTable);

        pridatPodmienkuButton.setText("Pridat podmienku");
        pridatPodmienkuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatPodmienkuButtonActionPerformed(evt);
            }
        });

        vymazButton2.setText("Vymaz podmienku");
        vymazButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vymazButton2ActionPerformed(evt);
            }
        });

        MarkComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Mark");

        ValueTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueTextField1ActionPerformed(evt);
            }
        });
        ValueTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValueTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Value");

        jLabel3.setText("ChangeRate");

        jLabel4.setText("ID banky");

        jLabel5.setText("ID Podmienky");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatPodmienkuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MarkComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(idBTextField1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ValueTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(changeRateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idCTextField2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vymazButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pridatPodmienkuButton)
                        .addComponent(ValueTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MarkComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeRateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(vymazButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridatPodmienkuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatPodmienkuButtonActionPerformed
        List<Boolean> vyplnenost = new ArrayList<>();
        Boolean mozesUlozit = true;
        Long idBanky;
        bankCond = new BankCondition();
        if (ValueTextField1.getText() != null || ValueTextField1.getText().equals("")) {
            bankCond.setValue(Integer.parseInt(ValueTextField1.getText()));
            vyplnenost.add(true);
        } else {
            ValueTextField1.setText("Zadajte prosim hodnotu");
            vyplnenost.add(false);
        }
        if (MarkComboBox1.getSelectedIndex() == 0) {
            bankCond.setMark(2);
            vyplnenost.add(true);
        }
        if (MarkComboBox1.getSelectedIndex() == 1) {
            bankCond.setMark(1);
            vyplnenost.add(true);
        }
        if (MarkComboBox1.getSelectedIndex() == 2) {
            bankCond.setMark(-2);
            vyplnenost.add(true);
        }
        if (MarkComboBox1.getSelectedIndex() == 3) {
            bankCond.setMark(-1);
            vyplnenost.add(true);
        }
        if (MarkComboBox1.getSelectedIndex() == 4) {
            bankCond.setMark(0);
            vyplnenost.add(true);
        }
        if (changeRateTextField1.getText() != null || changeRateTextField1.getText().equals("")) {
            bankCond.setChangeInterestRate(Double.parseDouble(changeRateTextField1.getText()));
            vyplnenost.add(true);
        } else {
            changeRateTextField1.setText("Zadajte prosim zmenu rate");
            vyplnenost.add(false);
        }
         if (idBTextField1.getText() != null || idBTextField1.getText().equals("")) {
            bankCond.setIdB(Long.parseLong(idBTextField1.getText()));
            vyplnenost.add(true);
        } else {
            idBTextField1.setText("Zadajte prosim id Banky");
            vyplnenost.add(false);
        }
          if (idCTextField2.getText() != null || idCTextField2.getText().equals("")) {
            bankCond.setIdC(Long.parseLong(idCTextField2.getText()));
            vyplnenost.add(true);
        } else {
            idCTextField2.setText("Zadajte prosim id Podmienky");
            vyplnenost.add(false);
        }
        for (Boolean boolean1 : vyplnenost) {
            if (!boolean1) {
                mozesUlozit = false;
            }
        }
        if (mozesUlozit) {
            Condition condZmena = conditionDao.getById(bankCond.getIdC());
            Bank bankZmena = bankDao.getById(bankCond.getIdB());
            switch (bankCond.getMark()) {
                case 0: 
                    if (bankCond.getValue() == Integer.parseInt(condZmena.getExpression()))
                        bankZmena.setPrimeInterestRate(bankZmena.getPrimeInterestRate() - bankCond.getChangeInterestRate());
                case -1:
                    if (bankCond.getValue() <= Integer.parseInt(condZmena.getExpression()))
                        bankZmena.setPrimeInterestRate(bankZmena.getPrimeInterestRate() - bankCond.getChangeInterestRate());
                case 1:
                    if (bankCond.getValue() >= Integer.parseInt(condZmena.getExpression()))
                        bankZmena.setPrimeInterestRate(bankZmena.getPrimeInterestRate() - bankCond.getChangeInterestRate());
                case -2:
                    if (bankCond.getValue() < Integer.parseInt(condZmena.getExpression()))
                        bankZmena.setPrimeInterestRate(bankZmena.getPrimeInterestRate() - bankCond.getChangeInterestRate());
                case 2:
                    if (bankCond.getValue() > Integer.parseInt(condZmena.getExpression()))
                        bankZmena.setPrimeInterestRate(bankZmena.getPrimeInterestRate() - bankCond.getChangeInterestRate());
                  
            }
            
            bankConditionDao.addBankCondition(bankCond);
        }
    }//GEN-LAST:event_pridatPodmienkuButtonActionPerformed

    private void ValueTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValueTextField1ActionPerformed

    private void ValueTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValueTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_ValueTextField1KeyTyped

    private void vymazButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vymazButton2ActionPerformed
         bankConditionDao.deleteBankCondition(bankConditionDao.getById((long) podmienkyTable.getValueAt(podmienkyTable.getSelectedRow(), 0)));
        inicializujTabulku();
    }//GEN-LAST:event_vymazButton2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MarkComboBox1;
    private javax.swing.JTextField ValueTextField1;
    private javax.swing.JTextField changeRateTextField1;
    private javax.swing.JTextField idBTextField1;
    private javax.swing.JTextField idCTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable podmienkyTable;
    private javax.swing.JButton pridatPodmienkuButton;
    private javax.swing.JButton vymazButton2;
    // End of variables declaration//GEN-END:variables
}
