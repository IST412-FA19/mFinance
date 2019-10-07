/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.util.Random;

/**
 *
 * @author Randi Semera
 */
public class Authenticator {
    
    protected String authKey;
    protected int ranNum;
    
    public Authenticator(Security userLogin){
        
        Random rand = new Random();
        
        ranNum = rand.nextInt(9000000) + 1000000;
        
        if (userLogin.userLog == true){
            this.authKey = Integer.toString(ranNum);
        }
        else{
            this.authKey = null;
        }
        
    }

    /**
     * @return the authKey
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * @param authKey the authKey to set
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    
}
