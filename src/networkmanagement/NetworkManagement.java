/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkmanagement;

import Address.Mac;
import Address.Static_IPv4;
import Router.Router;
import Switch.Switch;

/**
 *
 * @author thnom
 */
public class NetworkManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

//       Address a= new IPv4();      
//       System.out.println(a);
//       
//       Address mac= new Mac();
//       System.out.println(mac);
//       
//        Services s= new DatabaseServer("PostgreSQL");
//        System.out.println(s);
//        Services sd= new DomainControler("dhcp");
//        System.out.println(sd);
//        
//        Services ws= new WebServer("https");
//        System.out.println(ws);
//        
////        Services f1= new FileServer("TCP");
////        System.out.println(f1);
//        System.out.println("host lap");
//
//        Host lap = new Laptop(new Dynamic_IPv4(), new Mac(), "Laptop");
//        System.out.println(lap);
//        
        
        //System.out.println("The ip address using getIp "+lap.getIp());
//       lap.setName("computer");
//       
//       FindHost f= new FindHost(("WWW.GOOGLE.COM"));
        
        
//
//        Host pc = new PC(new Dynamic_IPv4(), new Mac(), "pc");
//        System.out.println(pc);
//        
//        Switch s= new Switch(new Static_IPv4("23.16.33.45","255.255.255.0"), new Mac());
//        System.out.println(s);
//        s.Register();
//        s.displayRegisteredTable();
        
//        
//        System.out.println("------------Wap----------");
//        Wap w= new Wap(new Static_IPv4("23.16.33.46","255.255.255.0"), new Mac());
//        System.out.println(w);
//        w.Register();
//        w.displayRegestrationTable();


//        Router r= new Router(new Static_IPv4("192.168.241.55", "25,25,25,25"), new Mac());
//        r.routingtable(new Address.Dynamic_IPv4(), new Address.Dynamic_IPv4());
//        System.out.println(r);
        
        
        Switch s= new Switch();
        System.out.println(s);
        
         
    }

}
