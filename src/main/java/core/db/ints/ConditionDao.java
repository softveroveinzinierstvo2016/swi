/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.ints;

import core.db.entity.Condition;
import java.util.List;

/**
 *
 * @author Rastislav
 */
public interface ConditionDao {
    
    void addCondition(Condition condition);

    void deleteCondition(Condition condition);

    List<Condition> getAll();

    Condition getById(Long id);

    void updateCondition(Condition condition);
}
