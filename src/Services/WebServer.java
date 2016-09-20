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
public class WebServer extends Services {

    int http_port = 80;
    int https_port = 443;

    public WebServer(String name) {
        super();
        if (name.equalsIgnoreCase("http")) {
            WebServer.port = this.http_port;
        } else if (name.equalsIgnoreCase("https")) {
            WebServer.port = this.https_port;
        }else{
            System.out.println("Unknow webserber");
        }

    }

    @Override
    public int openPort() {
        try {
            serverSocket= new ServerSocket(port);
        } catch (IOException | SecurityException io) {
            System.out.println("Unable to open to port "+port+ "because of"+ io.getMessage() );
        }
       return  port;
    }
    
    

}
