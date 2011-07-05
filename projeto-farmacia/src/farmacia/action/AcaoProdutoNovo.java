package farmacia.action;

import java.awt.event.ActionEvent;
import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaProdutoNovo;

public class AcaoProdutoNovo extends FWAction {

    public AcaoProdutoNovo() {
        super("Cadastrar Produto", "novo");
    }

    public void actionPerformed(ActionEvent e) {

        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaProdutoNovo());

    }
}
