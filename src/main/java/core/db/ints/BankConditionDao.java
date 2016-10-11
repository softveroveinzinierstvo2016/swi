/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.ints;

import core.db.entity.BankCondition;
import java.util.List;
/**
 *
 * @author Rastislav
 */
public interface BankConditionDao {
    
    void addBankCondition(BankCondition bankCondition);

    void deleteBankCondition(BankCondition bankCondition);

    List<BankCondition> getAll();

    BankCondition getById(Long id);

    void updateBankCondition(BankCondition bankCondition);
}
