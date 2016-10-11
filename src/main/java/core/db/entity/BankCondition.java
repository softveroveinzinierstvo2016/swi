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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Rastislav
 */
@Entity
@Table(name = "BankCondition")
public class BankCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Column(name = "idB")
    private Long idB;

    @NotNull
    @Column(name = "idC")
    private Long idC;

    @NotNull
    @Column(name = "mark")
    private Integer mark;

    @NotNull
    @Column(name = "value")
    private Integer value;

    @NotNull
    @Column(name = "change_interest_rate")
    private Double changeInterestRate;

    public Long getId() {
        return id;
    }

    public void setIdBC(Long idBC) {
        this.id = idBC;
    }

    public Long getIdB() {
        return idB;
    }

    public void setIdB(Long idB) {
        this.idB = idB;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Double getChangeInterestRate() {
        return changeInterestRate;
    }

    public void setChangeInterestRate(Double changeInterestRate) {
        this.changeInterestRate = changeInterestRate;
    }
    
    
}
