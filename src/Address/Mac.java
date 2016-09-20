/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Address;

import java.util.Random;

/**
 *
 * @author thnom
 */
public class Mac extends Address {
    String mac= null;
    Random rand = new Random();
    byte[] macAddr = new byte[6];

    public Mac() {
        rand.nextBytes(macAddr);
        StringBuilder sb = new StringBuilder(18);
        for (byte b : macAddr) {
            if (sb.length() > 0) {
                sb.append(":");
            } else { //first byte, we need to set some options
                b = (byte) (b | (byte) (0x01 << 6)); //locally adminstrated
                b = (byte) (b | (byte) (0x00 << 7)); //unicast

            }
            sb.append(String.format("%02x", b));
        }
        mac= sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder();
        s.append(" the mac address is ").append(this.mac);
        return s.toString();
    }
    
   

}
