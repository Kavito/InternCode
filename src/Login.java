import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudi
 */
public class Login extends JFrame{
    
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JTextField fieldUsername;
    private JPasswordField fieldPassword;
    private JButton buttonLogin;
    private MouseListener onClear;
    
    public Login(){
//        super("Login");
//        setLayout(new FlowLayout());
//        labelUsername = new JLabel("Username");
//        labelUsername.setToolTipText("Please Input your Username below here. Be aware that it is NOT your email!");
//        fieldUsername = new JTextField("Insert Username her", 20);
//        labelPassword = new JLabel("Password");
//        labelPassword.setToolTipText("Please Input your Password below here. The Password is not readiable for the concernof prying eyes. ");
//        fieldPassword = new JPasswordField("password", 20);
//        buttonLogin = new JButton("Login");
//        
//        add(labelUsername);
//        add(fieldUsername);
//        add(labelPassword);
//        add(fieldPassword);
//        add(buttonLogin);
//        
//        fieldUsername.addFocusListener(new FocusAdapter() 
//        {public void focusGained(FocusEvent e){fieldUsername.setText("");}});
//        fieldPassword.addFocusListener(new FocusAdapter() 
//        {public void focusGained(FocusEvent e){fieldPassword.setText("");}});
        
    }
    
    
}
