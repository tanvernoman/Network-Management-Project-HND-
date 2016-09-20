/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkDevices;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 1410453
 */
public class NetworkDevices {

    public ArrayList< DeviceRecord> rnd;

    public NetworkDevices() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (ClassNotFoundException c_) {
            System.out.println(c_.getMessage());
        }

        rnd = new ArrayList<>();

        try {
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@//10.1.9.106:1521/sw2", "tanver", "password");
            Statement s = c.createStatement();
            ResultSet rset = s.executeQuery("select * from nwdevices order by id");
            while (rset.next()) {
                DeviceRecord dr = new DeviceRecord();
                dr.setId(rset.getInt(1));
                dr.setMacaddress(rset.getString(2));
                dr.setIpaddress(rset.getString(3));
                dr.setAddressmode(rset.getString(4));
                dr.setNodetype(rset.getString(5));
                dr.setNodename(rset.getString(6));
                rnd.add(dr);
            }
        } catch (SQLException s_) {
            System.out.println(s_.getErrorCode());
        }

    }

    public void displayDeviceRecords() {
        for (DeviceRecord dr : rnd) {
            System.out.println(dr.toString());
        }
    }
}
