/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thnom
 */
public class DomainControlerTest {
    
    public DomainControlerTest() {
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
     * Test of openPort method, of class DomainControler.
     */
    @Test
    public void testOpenPortDHCP() {
        System.out.println("openPort");
        DomainControler instance = new DomainControler("DHCP");
        int expResult = 67;
        int result = instance.openPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOpenPortDNS() {
        System.out.println("openPort");
        DomainControler instance = new DomainControler("DNS");
        int expResult = 53;
        int result = instance.openPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
