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
@Table(name = "Bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "prime_interest_rate")
    private Double primeInterestRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrimeInterestRate() {
        return primeInterestRate;
    }

    public void setPrimeInterestRate(Double primeInterestRate) {
        this.primeInterestRate = primeInterestRate;
    }
    
    
}
