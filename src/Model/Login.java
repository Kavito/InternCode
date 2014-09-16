import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Rudi
 */
public class Login extends JFrame{
    
    private JLabel labelUsername;
    private JLabel labelPassword;
    
    public Login(){
        super("Login");
        setLayout(new FlowLayout());
        labelUsername = new JLabel("Username");
        labelUsername.setToolTipText("Please Input your Username below here. Be aware that it is NOT your email!");
        labelPassword = new JLabel("Password");
        labelPassword.setToolTipText("Please Input your Password below here. The Password is not readiable for the concernof prying eyes. ");
        
        add(labelUsername);
        add(labelPassword);
    }
    
}
