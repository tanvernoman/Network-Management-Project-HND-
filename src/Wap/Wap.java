/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wap;

import Address.Dynamic_IPv4;
import Address.Mac;
import Address.Static_IPv4;
import Host.Host;
import Host.Laptop;
import Host.Mobile;
import Host.PC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author thnom
 */
public class Wap {

    Address.Static_IPv4 wap_ip;
    Address.Mac wap_mac;

    Map<String, Mac> map;
    int maxHost = 48;

   
    Host lap = new Laptop(new Dynamic_IPv4(), new Mac(), "Laptop");

    Host mob = new Mobile(new Dynamic_IPv4(), new Mac(), "Mobile");

    public Wap(Static_IPv4 wap_ip, Mac mac) {
        this.wap_ip = wap_ip;
        this.wap_mac = mac;
    }

    public void Register() {
        map = new HashMap<>();
        if (map.size() < maxHost) {

            map.put(lap.getName(), lap.getMac());
            map.put(mob.getName(), mob.getMac());
        } else {
            System.out.println("Maximum host exceded");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Wap ip  address is :").append(this.wap_ip).append("\n");
        s.append("Wap mac  address is :  ").append(this.wap_mac).append("\n");

        return s.toString();
    }

    public void displayRegestrationTable() {

        for (Map.Entry<String, Mac> entry : map.entrySet()) {
            String key = entry.getKey();
            Mac value = entry.getValue();
            System.out.println("The key is " + key + " and value : " + value);
        }
        System.out.println("the regestered host in wap is :  "+map.size());
    }

}
