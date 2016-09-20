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
public class WebServerTest {
    
    public WebServerTest() {
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
     * Test of openPort method, of class WebServer.
     */
    @Test
    public void testOpenPortHTTP() {
        System.out.println("openPort");
        WebServer instance = new WebServer("http");
        int expResult = 80;
        int result = instance.openPort();
        assertEquals(expResult, result);
        
    }
        @Test
    public void testOpenPortHTTPS() {
        System.out.println("openPort");
        WebServer instance = new WebServer("httpS");
        int expResult = 443;
        int result = instance.openPort();
        assertEquals(expResult, result);
        
    }
}
