/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NetworkDevices;

/**
 *
 * @author 1410453
 */
public class DeviceRecord {

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getAddressmode() {
        return addressmode;
    }

    public void setAddressmode(String addressmode) {
        this.addressmode = addressmode;
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }
    // refactor, encapsulate fields
    private int id;
    private String macaddress;
    private String ipaddress;
    private String addressmode;
    private String nodetype;
    private String nodename;
    private boolean online ;

    public DeviceRecord() {
        id = 0;
        macaddress = "";
        ipaddress = "";
        addressmode = "";
        nodetype = "";
        nodename = "";
        online = false ;
    }
    
    @Override
    public String toString(){
        String status = "" ;
        if (this.online)
            status = "online" ;
        else
            status = "offline";
        return this.id + " "
                + this.macaddress + " "
                + this.ipaddress + " "
                + this.addressmode + " "
                + this.nodetype + " "
                + this.nodename + " "
                + status;
    }
	
	// accessors/mutators omitted
}
