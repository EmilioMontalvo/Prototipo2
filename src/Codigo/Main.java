/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Interfaz.JFEmpleados;
import Interfaz.JFLogin;
import Interfaz.JFPrimerUsuario;
import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Validar val=new Validar();
       
        if(val.existeActivo()){
            JFLogin jf=new JFLogin();
            jf.setVisible(true);
        }else{
            JFPrimerUsuario jf=new JFPrimerUsuario();
            jf.setVisible(true);
        }
        
        
    }
}
