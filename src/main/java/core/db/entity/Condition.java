/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rastislav
 */
@Entity
@Table(name = "Condition")
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "expression")
    @Size(min = 1, max = 50)
    private String expression;
    /**
     * vracia id podmienky odpovedajuce identifikatoru v tabulke Condition
     * @return id podmienky
     */
    public Long getId() {
        return id;
    }
    /**
     * nastavuje id podmienky odpovedajuce identifikatoru v tabulke Condition, AUTOINCREMENT
     * @param id id podmienky
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * vracia slovny popis podmienky
     * @return slovny popis podmienky
     */
    public String getDescription() {
        return description;
    }
    /**
     * nastavuje slovny popis podmienky, ktory vystihuje podstatu expression
     * @param description slovny popis podmienky,NotNull,lenght=<1,100>
     * @see getExpression()
     * @see setExpression(String expression)
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * vracia vyraz podmienky pomocou ktorej by sa malo vyhodnotit ci uzivatel splna danu podmienku pre danu banku
     * vyraz v urcitych pripadoch vyuziva value z BankCondition ako parameter
     * @return vyraz podmienky !!nevie sa ako by mal vizerat!!
     * @see BankCondition
     */
    public String getExpression() {
        return expression;
    }
/**
     * nastavuje vyraz podmienky pomocou ktorej by sa malo vyhodnotit ci uzivatel splna danu podmienku pre danu banku
     * vyraz v urcitych pripadoch vyuziva value z BankCondition ako parameter
     * @param expression NotNull,lenght=<1,50>  !!nevie sa ako by mal vizerat!!
     * @see BankCondition
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    
}
