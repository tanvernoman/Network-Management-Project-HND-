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
public class DatabaseServerTest {
    
    public DatabaseServerTest() {
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
     * Test of openPort method, of class DatabaseServer.
     */
    @Test
    public void testOpenPort() {
        System.out.println("OpenPort");
        DatabaseServer instance = new DatabaseServer("oracle");
        int expResult = 1521;
        int result = instance.openPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test 
    public void testOpenPortMysql(){
        System.out.println("Open port");
        DatabaseServer instance= new DatabaseServer("MYSQL");
        int result= instance.openPort();
        assertEquals(3306, result);
        
    }
    
    @Test 
    public void testOpenPortPostGreSql(){
        System.out.println("Open port");
        DatabaseServer instance= new DatabaseServer("postgresql");
        int result= instance.openPort();
        assertEquals(5432, result);
    }
    
    @Test 
    public void testOpenPortNull(){
        System.out.println("Open port");
        DatabaseServer instance= new DatabaseServer("");
        int result= instance.openPort();
        assertEquals(0, result);
    }
}
