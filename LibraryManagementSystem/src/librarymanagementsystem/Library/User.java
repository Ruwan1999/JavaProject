
package librarymanagementsystem.Library;

public class User {
    protected String name;
    protected String email;
    protected String phonenumber;
    
    public User() {}
    
    public User(String name){
        this.name = name;
    }
    
    public User(String name, String email, String phonenumber){
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }

    
    Object getPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
