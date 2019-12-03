package edu.ijse.gdse41.dominos.model;

/**
 *
 * @author SHEHANKA
 */
public class Login {
    private String userName;
    private String password;
    private String email;
    
    public Login(){}
    
    public Login(String userName,String password, String email){
        this.userName=userName;
        this.password=password;
         this.email=email;
    }
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
