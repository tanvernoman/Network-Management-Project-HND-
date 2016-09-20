/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import Address.Dynamic_IPv4;
import Address.Mac;
import Address.Static_IPv4;
import Host.Host;
import Host.PC;
import NetworkDevices.NetworkDevices;
import Wap.Wap;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thnom
 */
public class Switch {

    String sw_ip;
    String sw_mac;
    String sw_node_name;
    String sw_node_type;
    String sw_address_mode;
    boolean state;

    Host pc = new PC(new Dynamic_IPv4(), new Mac(), "PC");
    Host pc2 = new PC(new Dynamic_IPv4(), new Mac(), "PC2");

    Map<String, Mac> map;
    int maxHost = 48;

    public Switch() {
        NetworkDevices network=null;
        try {
            network = new NetworkDevices();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Switch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Switch.class.getName()).log(Level.SEVERE, null, ex);
        }
       // System.out.println(network.rnd.get(200));
//        network.rnd.get(199).setOnline(true);
//        System.out.println(network.rnd.get(199).getIpaddress());;
//        System.out.println(network.rnd.get(199));
        
        sw_ip=network.rnd.get(199).getIpaddress();
        sw_mac= network.rnd.get(199).getMacaddress();
        sw_node_name= network.rnd.get(199).getNodename();
        sw_node_type= network.rnd.get(199).getNodetype();
        sw_address_mode=network.rnd.get(199).getAddressmode();
        state= network.rnd.get(199).isOnline();
        network.rnd.get(199).setOnline(true);
        
        
        
    }

    public void Register() {
        map = new HashMap<String, Mac>();
        if (map.size() < maxHost) {
            map.put(pc.getName(), pc.getMac());
            map.put(pc2.getName(), pc2.getMac());
        } else {
            System.out.println("Maximum host exceded");
        }
        Wap w = new Wap(new Static_IPv4("22.58.69.55", "58.25.87.96"), new Mac());
        w.Register();
        w.displayRegestrationTable();
        System.out.println(w);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Switch ip :").append(sw_ip).append("\n");
        s.append("Switch mac :  ").append(sw_mac).append("\n");
        s.append("Switch node name :  ").append(sw_node_name).append("\n");
        s.append("Switch node type :  ").append(sw_node_type).append("\n");
        s.append("Switch address mode :  ").append(sw_address_mode).append("\n");
        s.append("Switch state ").append(state).append("\n");

        return s.toString();
    }

    public Switch displayRegisteredTable() {
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            Mac value = map.get(key);
            System.out.println("The key is " + key + " " + " and value : " + value);
        }
        System.out.println("Registerd host in  switch is : " + map.size());
        return this;
    }
}
