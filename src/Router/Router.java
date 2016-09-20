/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Router;

import Address.Dynamic_IPv4;
import Address.Mac;
import Address.Static_IPv4;
import NetworkDevices.NetworkDevices;
import Switch.Switch;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thnom
 */
public class Router {

    private static final int router_id=200;
     String router_ip;
     String router_mac;
     String router_node_name;
     String router_node_type;
     String router_address_mode;
    Map<String, Dynamic_IPv4> map;

    Address.Dynamic_IPv4 outside_ip;
    Address.Dynamic_IPv4 inside_ip;
    
    NetworkDevices net= null;

    public Router(Static_IPv4 router_ip, Mac router_mac) {
        try {
            net= new NetworkDevices();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.router_ip = net.rnd.get(router_id).getIpaddress();
        this.router_mac = net.rnd.get(router_id).getMacaddress();
        this.router_node_name=net.rnd.get(router_id).getNodename();
        this.router_node_type= net.rnd.get(router_id).getNodetype();
        this.router_address_mode=net.rnd.get(router_id).getAddressmode();
        
        
       // Switch s = new Switch(new Static_IPv4("22.33.55.66", "255.255.255.0"), new Mac());
        //s.Register();
        //s.displayRegisteredTable();

    }


    
    public void routingtable(Address.Dynamic_IPv4 inside,Address.Dynamic_IPv4 outside){
        this.inside_ip=inside;
        this.outside_ip=outside;      
        
    }
    
    
       @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Router ip ").append(this.router_ip);
        s.append("Router mac ").append(this.router_mac);
        


        
        return s.toString();
    }
    

}

//
//    public Dynamic_IPv4 getInside_ip() {
//        return inside_ip;
//    }
//
//    public void setInside_ip(Dynamic_IPv4 inside_ip) {
//        this.inside_ip = inside_ip;
//    }
//
//    public void setOutside_ip(Dynamic_IPv4 outside_ip) {
//        this.outside_ip = outside_ip;
//    }
//
//    public Dynamic_IPv4 getOutside_ip() {
//        return outside_ip;
//    }