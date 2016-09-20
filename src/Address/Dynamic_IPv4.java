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
public class Dynamic_IPv4 extends Address {

    String ipAddress;
    String subnetMask;
    Random r = new Random();

    public Dynamic_IPv4() {
        super();
        ipAddress = 192 + "." + 168 + "." + r.nextInt(256) + "." + r.nextInt(254);
        subnetMask = 255 + "." + 255 + "." + r.nextInt(50) + "." + r.nextInt(48);

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
