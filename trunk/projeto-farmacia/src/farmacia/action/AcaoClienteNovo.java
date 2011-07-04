package farmacia.action;

import java.awt.event.ActionEvent;
import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaClienteNovo;

public class AcaoClienteNovo extends FWAction {

    public AcaoClienteNovo() {
        super("Novo Cliente", "novo");
    }

    public void actionPerformed(ActionEvent e) {

        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaClienteNovo());

    }
}
