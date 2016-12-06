/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.impl;

import core.db.entity.BankCondition;
import core.db.ints.BankConditionDao;
import java.util.List;


/**
 *
 * @author Rastislav
 */
public class BankConditionDaoImpl implements BankConditionDao{

    /**
     * prida Podmienku pre Banku do databazy
     * @param bankCondition objekt BankCondition na pridanie
     * @see BankCondition
    */
    @Override
    public void addBankCondition(BankCondition bankCondition) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  /**
     * zmaze Podmienku pre Banku z databazy
     * @param bankCondition objekt BankCondition na zmazanie
     * @see BankCondition
    */
    @Override
    public void deleteBankCondition(BankCondition bankCondition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /**
   * vrati vsetky Podmienky pre Banku z databazy
     * @return zoznam Podmienok pre Banku
     * @see BankCondition
    */
    @Override
    public List<BankCondition> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /**
   * vrati Podmienku pre Banku podla id z databazy
     * @param id identifikator Podmienky pre Banku
     * @return objekt BankCondition
     * @see BankCondition
    */
    @Override
    public BankCondition getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /**
   *  upravi Podmienku pre Banku v databaze
     * @param bankCondition ako sa ma Podmienka pre Banku upravit
     * @see BankCondition
    */
    @Override
    public void updateBankCondition(BankCondition bankCondition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
