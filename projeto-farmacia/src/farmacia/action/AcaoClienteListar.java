package farmacia.action;

import java.awt.event.ActionEvent;
import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaClienteLista;

public class AcaoClienteListar extends FWAction {

    public AcaoClienteListar() {
        super("Listar Cliente", "tabela");
    }

    public void actionPerformed(ActionEvent e) {
        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaClienteLista());
    }
}
