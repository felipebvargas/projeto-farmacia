package farmacia.apresentacao;

import java.awt.Point;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class GestorJanela {


    final int ALTURA = 30; // altura entre as janelas
    final int DISTANCIA = 20; // distancia entre as janelas
    private static GestorJanela gestor;
    private JDesktopPane areaTrabalho = new JDesktopPane();

    private GestorJanela() {
    }

    public JDesktopPane getAreaTrabalho() {
        return areaTrabalho;
    }

    public static GestorJanela getInstance() {
        if (gestor == null) {
            gestor = new GestorJanela();
        }
        return gestor;
    }

   

    public void abrir(JanelaInternaBase janela ) {

        new Posicionador().posicionar(janela, areaTrabalho);

        janela.setVisible(true);
        areaTrabalho.add(janela);
        areaTrabalho.getDesktopManager().activateFrame(janela);

    }
    //tirei o metodo fecharTodasJanelas();minimizarTodasJanelas();RestaurarTodasJanelas(); pois estas
    //não estavam sendo utilizadas!!!
       
}
