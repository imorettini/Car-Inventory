package view;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        NimbusLookAndFeel nimbus = new NimbusLookAndFeel();
        try {
            UIManager.setLookAndFeel(nimbus);
FrmCarros FrmCarros = new FrmCarros();
FrmCarros.setVisible(true);

        
        } catch (Exception e){
            JOptionPane.showMessageDialog (null, 
                    "Ocorreu um erro:\n" + e.getMessage(),
                    "Erro:", JOptionPane.ERROR_MESSAGE);
        }
    
    }

}