/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Address;

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
public class IPv4Test {
    
    public IPv4Test() {
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
     * Test of toString method, of class IPv4.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dynamic_IPv4 instance = new Dynamic_IPv4();
        String expResult = "121.244.251.30";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
}
