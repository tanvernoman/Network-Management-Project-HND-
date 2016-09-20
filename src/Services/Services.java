/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.net.ServerSocket;

/**
 *
 * @author thnom
 */
public abstract class Services {

    protected static  ServerSocket serverSocket;
    protected static int port = 0;

    public Services() {
        Services.port = 0;
    }

    public int openPort() {
        return port;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("the open port is : ").append(Services.port);
        return s.toString();

    }

    //    public void closePort(){
//        try {
//            serverSocket.close();
//            System.out.println("port is closed");
//        } catch (IOException ex) {
//            System.out.println("Problem during close port");
//        }
//        
//    }
}
