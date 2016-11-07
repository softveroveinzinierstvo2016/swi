/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.ints;

import core.db.entity.Bank;
import java.util.List;

/**
 *
 * @author Rastislav
 */
public interface BankDao {
    
    List<Bank> getAll();

    Bank getById(Long id);
    
    void saveBank(Bank bank);
    
    void deleteBank(Bank bank);

}
