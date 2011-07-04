package farmacia.action;

import java.awt.event.ActionEvent;
import farmacia.apresentacao.GestorJanela;

public class AcaoClienteAbrir extends FWAction {

    public AcaoClienteAbrir() {
        super("Cliente Abrir", "abrir");
    }

    public void actionPerformed(ActionEvent e) {
        GestorJanela gestor = GestorJanela.getInstance();
    }
}
