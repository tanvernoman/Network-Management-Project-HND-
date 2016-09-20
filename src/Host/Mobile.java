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
public class Mobile extends Host {

    public Mobile(Dynamic_IPv4 ip, Mac mac, String name) {
        super(ip, mac, name);
    }

 
    @Override
    public  Mac getMac() {
        return this.mac;
    }

    @Override
    public Dynamic_IPv4 getIp() {
        return this.ip; 
    }

    @Override
    public String getName() {
        return this.name; 
    }
    

    
   
    
    
}
