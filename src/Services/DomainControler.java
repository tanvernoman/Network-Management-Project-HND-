/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author thnom
 */
public class DomainControler extends Services {

    private static final Integer dhcp_port = 67;
    private static final Integer dns_port = 53;

    public DomainControler(String domainControler_name) {
        super();
        if (domainControler_name.equalsIgnoreCase("DHCP")) {
            DomainControler.port = DomainControler.dhcp_port;

        } else if (domainControler_name.equalsIgnoreCase("DNS")) {
            DomainControler.port = DomainControler.dns_port;
        } else {
            System.out.println("Unkown domain controller");
        }
    }

    @Override
    public int openPort() {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException | SecurityException ex) {
            System.out.println("Unable to open to port " + port + "because of" + ex.getMessage());
        }
        return port;
    }

}
