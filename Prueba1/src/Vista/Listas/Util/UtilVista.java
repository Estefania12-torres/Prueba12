/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Listas.Util;

import Controlador.TDA.listas.Exception.EmptyException;
import Controlador.TramiteControl;
import Controlador.dao.Implements.ControlTramite;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Tramite;

/**
 *
 * @author Usuario
 */
public class UtilVista {
    public static void cargarcomboRolesL(JComboBox cbx) throws EmptyException{
        ControlTramite rc = new ControlTramite();
        cbx.removeAllItems();
        if (rc.getTramites().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }else{
            for (int i = 0; i < rc.getTramites().getLength(); i++) {
                cbx.addItem(rc.getTramites().getInfo(i));
            }
        }
    }
    
    public static void cargarcomboRoles(JComboBox cbx) throws EmptyException{
        ControlTramite rc = new ControlTramite();
        cbx.removeAllItems();
        for (Integer i = 0; i < rc.getTramites().getLength(); i++) {
            System.out.println(rc.getTramites().getLength());
            System.out.println(rc.getTramites().getInfo(i));
            cbx.addItem(rc.getTramites().getInfo(i));
        }
    }
    
    public static Tramite obtenerRolControl(JComboBox cbx){
        return (Tramite) cbx.getSelectedItem();
    }
    
}
