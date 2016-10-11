/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.ints;

import core.db.entity.AccountStatements;
import java.util.List;

/**
 *
 * @author Rastislav
 */
public interface AccountStatementsDao {

    void addAccountStatements(AccountStatements accountStatements);

    void deleteAccountStatements(AccountStatements accountStatements);

    List<AccountStatements> getAll();

    AccountStatements getById(Long id);

    void updateAccountStatements(AccountStatements accountStatements);

}
