/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author chae
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import View.Login;
import View.Pilihan;
public class ControllerLogin implements ActionListener {
    private Login view;
    private String id = "chae";
    private String pass = "123";
    public ControllerLogin() {
        view = new Login();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())) {
            if ((view.getUsername().equals(id)) && (view.getPassword().equals(pass))) {
                ControllerPilihan ch = new ControllerPilihan();
                view.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah.");
            }
            
        }
    }
}

