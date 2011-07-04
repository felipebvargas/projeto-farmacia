package farmacia.apresentacao;

import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class Posicionador {


    final int ALTURA = 30; // altura entre as janelas
    final int DISTANCIA = 20; // distancia entre as janelas

    public Posicionador() {
    }



    public void posicionar(JanelaInternaBase janela, JDesktopPane areaTrabalho) {

        if (areaTrabalho.getAllFrames().length > 0) {

            JInternalFrame[] frames = areaTrabalho.getAllFrames();
            JInternalFrame ultimaJanela = frames[0];

            Point novaPosicao = new Point(ultimaJanela.getX() + ALTURA, ultimaJanela.getY() + DISTANCIA);

            if ((novaPosicao.y + ultimaJanela.getHeight()) > areaTrabalho.getHeight()) {
                novaPosicao = new Point(ultimaJanela.getX() + ALTURA, 0);
            }

            if ((novaPosicao.x + ultimaJanela.getWidth()) > areaTrabalho.getWidth()) {
                novaPosicao = new Point(0, 0);
            }

            janela.setLocation(novaPosicao.x, novaPosicao.y);
        }

    }



  }
