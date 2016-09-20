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
public class FileServerTest {

    public FileServerTest() {
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
     * Test of openPort method, of class FileServer.
     */
    @Test
    public void testOpenPortSMB() {
        System.out.println("openPort");
        FileServer instance = new FileServer("smb");
        int expResult = 445;
        int result = instance.openPort();
        assertEquals(expResult, result);
    }

    @Test
    public void testOpenPortTCP() {
        System.out.println("openPort");
        FileServer instance = new FileServer("TCP");
        int expResult = 139;
        int result = instance.openPort();
        assertEquals(expResult, result);
    }

    @Test
    public void testOpenPortRDP() {
        System.out.println("openPort");
        FileServer instance = new FileServer("RDP");
        int expResult = 3389;
        int result = instance.openPort();
        assertEquals(expResult, result);
    }

    @Test
    public void testOpenPortUDP() {
        System.out.println("openPort");
        FileServer instance = new FileServer("UDP");
        int expResult = 137;
        int result = instance.openPort();
        assertEquals(expResult, result);
    }
}
