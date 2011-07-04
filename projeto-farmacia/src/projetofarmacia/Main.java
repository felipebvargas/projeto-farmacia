package projetofarmacia;

import farmacia.apresentacao.JanelaPrincipal;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
}
