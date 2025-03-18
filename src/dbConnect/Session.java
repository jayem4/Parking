/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnect;

/**
 *
 * @author Bentastic
 */
public class Session {
    
    private static Session instance;
    private int uid;
    private String fn;
    private String ln;
    private String lnum;
    private String usn;
    private String r_type;
    private String r_status;
    
    private Session(){
       //Private cons.prevents instance 
    }

    public static synchronized Session getInstance() {
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty(){
        return instance == null;
    }

        public int getRid() {
        return uid;
    }

    public void setRid(int uid) {
        this.uid = uid;
    }
    
    public String getFname() {
        return fn;
    }

    public void setFname(String rfn) {
        this.fn = rfn;
    }

    public String getLname() {
        return ln;
    }

    public void setLname(String rln) {
        this.ln = rln;
    }

    public String getLicense() {
        return lnum;
    }

    public void setLicense(String License) {
        this.lnum = License;
    }

    public String getUsername() {
        return usn;
    }

    public void setUsername(String username) {
        this.usn = username;
    }

    public String getType() {
        return r_type;
    }

    public void setType(String type) {
        this.r_type = type;
    }

    public String getStatus() {
        return r_status;
    }

    public void setStatus(String status) {
        this.r_status = status;
    }

    public String getuid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getlnum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
