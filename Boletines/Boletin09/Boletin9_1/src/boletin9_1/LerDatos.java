
package boletin9_1;

import javax.swing.JOptionPane;

public class LerDatos {
    
    public static int LerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
       return resposta;
        
        
        //tamén
            //  return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static float lerFloatPositivo(String mensaxe){
        float dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
                return dato;
    }
    
}
