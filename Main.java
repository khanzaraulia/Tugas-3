
package user;
        
        
        
public class main {
    public static void main(String[] args) {
        User petani = new User();
        
        petani.setUsername("Petani");
        petani.setPassword("Javaclass");
        
        System.out.println("Username :" + petani.getUsername());
        System.out.println("Password :" + petani.getPassword());
    }
}
