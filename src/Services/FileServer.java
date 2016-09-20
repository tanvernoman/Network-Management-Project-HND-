/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thnom
 */
public class FileServer extends Services {

   private static final  Integer tcp_smb = 445;
   private static final Integer tcp_rdp = 3389;
   private static final Integer tcp_udp = 137;
   private static final Integer tcp = 139;

    public FileServer(String server_name) {
        if(server_name.equalsIgnoreCase("TCP")){
            FileServer.port=FileServer.tcp;
        }else if(server_name.equalsIgnoreCase("SMB")){
            FileServer.port=FileServer.tcp_smb;
        }else if(server_name.equalsIgnoreCase("RDP")){
            FileServer.port=FileServer.tcp_rdp;
        }else if(server_name.equalsIgnoreCase("UDP")){
            FileServer.port=FileServer.tcp_udp;
        }else{
            System.out.println("Unkown server port name");
        }
    }

    @Override
    public int openPort() {
       try {
           serverSocket= new ServerSocket(port);
       } catch (IOException | SecurityException ex) {
            System.out.println("Unable to open to port "+port+ "because of"+ ex.getMessage() );
       }
       return port;
    }

}
