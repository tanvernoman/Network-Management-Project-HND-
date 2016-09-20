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
public class DatabaseServer extends Services {

    private static final int oracle_port = 1521;
    private static final int mysql_port = 3306;
    private static final int postgresql_port = 5432;

    public DatabaseServer(String server_name) {

        super();
        if (server_name.equalsIgnoreCase("oracle")) {
            DatabaseServer.port = DatabaseServer.oracle_port;
        } else if (server_name.equalsIgnoreCase("mysql")) {
            DatabaseServer.port = DatabaseServer.mysql_port;
        } else if (server_name.equalsIgnoreCase("PostgreSQL")) {
            DatabaseServer.port = DatabaseServer.postgresql_port;
        } else {
            System.out.println("Unknown database server");
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
