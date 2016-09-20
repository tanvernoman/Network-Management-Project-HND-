/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Host;

import Address.Dynamic_IPv4;
import Address.Mac;

/**
 *
 * @author thnom
 */
public abstract class Host {

 
    protected  Address.Dynamic_IPv4 ip;
    protected  Address.Mac mac;
    protected  String name;

    public Host(Dynamic_IPv4 ip, Mac mac, String name) {
        this.ip = ip;
        this.mac = mac;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.ip).append("\n");
        s.append(this.mac).append("\n");
        s.append("The name is ").append(this.name);
        return s.toString();
    }
   public Dynamic_IPv4 getIp() {
        return ip;
    }

    public Mac getMac() {
        return mac;
    }

    public String getName() {
        return name;
    }

  
}
