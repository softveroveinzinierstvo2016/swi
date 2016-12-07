/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.frames;

import core.db.entity.Bank;
import core.db.entity.Condition;
import core.db.entity.User;
import core.db.impl.ConditionDaoImpl;
import core.db.ints.ConditionDao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rastislav
 */
public class podmienkaFrame extends javax.swing.JFrame {

    private ConditionDao conditionDao = new ConditionDaoImpl();
    private Condition condition;

    /**
     * Creates new form podmienkaFrame
     * @param user prihlaseny uzivatel
     */
    public podmienkaFrame(User user) {
        initComponents();
        inicializujComboboxy();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hodnotaTextField = new javax.swing.JTextField();
        znamienkoComboBox = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        popisTextArea = new javax.swing.JTextArea();
        popisLabel = new javax.swing.JLabel();
        znamienkoLabel = new javax.swing.JLabel();
        hodnotaLabel = new javax.swing.JLabel();
        pridatButton = new javax.swing.JButton();
        zatvoritButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        hodnotaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hodnotaTextFieldActionPerformed(evt);
            }
        });
        hodnotaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hodnotaTextFieldKeyTyped(evt);
            }
        });

        znamienkoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        znamienkoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                znamienkoComboBoxActionPerformed(evt);
            }
        });

        popisTextArea.setColumns(20);
        popisTextArea.setRows(5);
        jScrollPane1.setViewportView(popisTextArea);

        popisLabel.setText("Popis:");

        znamienkoLabel.setText("Znamienko:");

        hodnotaLabel.setText("Hodnota:");

        pridatButton.setText("Pridat");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        zatvoritButton1.setText("Zatvorit");
        zatvoritButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatvoritButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(popisLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(znamienkoLabel)
                    .addComponent(znamienkoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hodnotaLabel)
                    .addComponent(hodnotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pridatButton))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zatvoritButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zatvoritButton1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popisLabel)
                    .addComponent(znamienkoLabel)
                    .addComponent(hodnotaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hodnotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(znamienkoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pridatButton)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void znamienkoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_znamienkoComboBoxActionPerformed
        
    }//GEN-LAST:event_znamienkoComboBoxActionPerformed

    private void hodnotaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hodnotaTextFieldActionPerformed


    }//GEN-LAST:event_hodnotaTextFieldActionPerformed
    public void inicializujComboboxy(){
        znamienkoComboBox.removeAllItems();
        znamienkoComboBox.addItem(">");
        znamienkoComboBox.addItem("<");
        znamienkoComboBox.addItem("=");}
    private void hodnotaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hodnotaTextFieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_hodnotaTextFieldKeyTyped

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        List<Boolean> vyplnenost = new ArrayList<>();
        Boolean mozesUlozit = true;
        condition = new Condition();
        if (popisTextArea.getText() != null) {
            condition.setDescription(popisTextArea.getText());
            vyplnenost.add(true);
        } else {
            popisTextArea.setText("Zadajte prosim text");
            vyplnenost.add(false);
        }
        if (znamienkoComboBox.getSelectedIndex() == 0) {
            condition.setExpression(">");
            vyplnenost.add(true);
        }
        if (znamienkoComboBox.getSelectedIndex() == 1) {
            condition.setExpression("<");
            vyplnenost.add(true);
        }
        if (znamienkoComboBox.getSelectedIndex() == 2) {
            condition.setExpression("=");
            vyplnenost.add(true);
        }
        if (popisTextArea.getText() != null) {
            condition.setDescription(popisTextArea.getText());
            vyplnenost.add(true);
        } else {
            popisTextArea.setText("Vyplne prosim popis");
            vyplnenost.add(false);
        }
        for (Boolean boolean1 : vyplnenost) {
            if (!boolean1) {
                mozesUlozit = false;
            }
        }
        if (mozesUlozit) {
            conditionDao.addCondition(condition);
        }
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void zatvoritButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatvoritButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_zatvoritButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hodnotaLabel;
    private javax.swing.JTextField hodnotaTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel popisLabel;
    private javax.swing.JTextArea popisTextArea;
    private javax.swing.JButton pridatButton;
    private javax.swing.JButton zatvoritButton1;
    private javax.swing.JComboBox<String> znamienkoComboBox;
    private javax.swing.JLabel znamienkoLabel;
    // End of variables declaration//GEN-END:variables
}