/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.db.impl;

import core.db.entity.Bank;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Slavomír
 */
public class BankDaoImplTest {
    
    public BankDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class BankDaoImpl.
     */
    @Test
    public void testGetAll() {
        /*OK*/
        System.out.println("getAll");
        BankDaoImpl instance = new BankDaoImpl();
        List<Bank> expResult = null;
        List<Bank> result = instance.getAll();
        System.out.println("Vysledok:");
        int expecteds = 17;
        int actuals = result.size();
        assertEquals(expecteds, actuals);
    }

    /**
     * Test of getById method, of class BankDaoImpl.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Long id = 16L;
        BankDaoImpl instance = new BankDaoImpl();
        Bank expResult = new Bank();
        expResult.setId(id);
        expResult.setName("testSaveBank");
        expResult.setPrimeInterestRate(12.0);
        Bank result = instance.getById(id);
        
        assertEquals(expResult.getId(),result.getId() );
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getPrimeInterestRate(), result.getPrimeInterestRate());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveBank method, of class BankDaoImpl.
     */
    @Test
    public void testSaveBank() {
        /*OK*/
        System.out.println("saveBank");
        Bank bank = new Bank();
        bank.setName("testSaveBank");
        bank.setPrimeInterestRate(12.0);
        BankDaoImpl instance = new BankDaoImpl();
        
        int expCount = instance.getAll().size()+1;
        instance.saveBank(bank);
        int actualCount = instance.getAll().size();
        assertEquals(expCount, actualCount);
        // TODO review the generated test code and remove the default call to fail.
          // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBank method, of class BankDaoImpl.
     */
    @Test
    public void testDeleteBank() {
        System.out.println("deleteBank");

        BankDaoImpl instance = new BankDaoImpl();
        int expCount = instance.getAll().size()-1;
        Bank bank = new Bank();
        bank.setId(16L);
        bank.setName("testSaveBank");
        bank.setPrimeInterestRate(12.0);
        instance.deleteBank(bank);
        
        int actualCount = instance.getAll().size();
        assertEquals(expCount, actualCount);
                
    }
    
}
