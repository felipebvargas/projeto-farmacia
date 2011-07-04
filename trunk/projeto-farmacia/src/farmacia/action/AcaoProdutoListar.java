package farmacia.action;

import java.awt.event.ActionEvent;
import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaProdutoLista;


public class AcaoProdutoListar extends FWAction {

    public AcaoProdutoListar() {
        super("Produtos", "tabela");
    }

    public void actionPerformed(ActionEvent e) {
        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaProdutoLista());
    }
}