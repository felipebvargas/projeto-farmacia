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

     public void fecharTodasJanelas() {
        JInternalFrame[] janelas = areaTrabalho.getAllFrames();

        for (JInternalFrame janela : janelas){
            janela.dispose();

         }

    }
      public void minimizarTodasJanelas() {
        JInternalFrame[] janelas = areaTrabalho.getAllFrames();

        for (JInternalFrame janela : janelas){
            try {
                janela.setIcon(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GestorJanela.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

       public void RestaurarTodasJanelas() {
        JInternalFrame[] janelas = areaTrabalho.getAllFrames();

        for (JInternalFrame janela : janelas){
            try {
                janela.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GestorJanela.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
       
       public void Reorganizar() {
        JInternalFrame[] janelas = areaTrabalho.getAllFrames();



          if ( areaTrabalho.getAllFrames().length > 0) {

          
            JInternalFrame ultimaJanela = janelas[0];

            Point novaPosicao = new Point(ultimaJanela.getX() + ALTURA, ultimaJanela.getY() + DISTANCIA);

            if ((novaPosicao.y + ultimaJanela.getHeight()) > areaTrabalho.getHeight()) {
                novaPosicao = new Point(ultimaJanela.getX() + ALTURA, 0);
            }

            if ((novaPosicao.x + ultimaJanela.getWidth()) > areaTrabalho.getWidth()) {
                novaPosicao = new Point(0, 0);
            }
             int l = 0;
             int a = 0;
             for (JInternalFrame janela : janelas){

                          
                 janela.setLocation(a, l);

                 a += 20;
                 l += 20;
            
        }
            
        }

    }


}
