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
public class Static_IPv4 extends Address{
    String ipAddress;
    String subnetMask;
   

 

    public Static_IPv4(String ipAddress, String subnetMask) {
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
    }
    
    public String getIpAddress() {
        return ipAddress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("The ip address is ").append(ipAddress).append("\n");
        s.append("The subnet mask ").append(subnetMask).append("");

        return s.toString();
    }

}
