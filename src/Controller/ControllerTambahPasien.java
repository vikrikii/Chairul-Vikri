/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import View.TambahPasien;
import Model.Aplikasi;
import Model.Pasien;
/**
 *
 * @author chae
 */
public class ControllerTambahPasien implements ActionListener {

    private TambahPasien view;
    private Aplikasi app;
    
    public ControllerTambahPasien(){
        app = new Aplikasi();
        view = new TambahPasien();
        view.addListener(this);
        view.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnAdd())) {
            app.addPasien(view.getTxFieldId(),view.getTxFieldNama());
            JOptionPane.showMessageDialog(null, "Pasien berhasil ditambahkan.");
        } else if (source.equals(view.getBtnBack())) {
            ControllerPilihan ch = new ControllerPilihan();
            view.dispose();
        }
    }
    
}
