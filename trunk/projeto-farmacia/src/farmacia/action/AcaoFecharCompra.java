package farmacia.action;

import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaComprarProduto;
import java.awt.event.ActionEvent;

public class AcaoFecharCompra  extends FWAction {

    public AcaoFecharCompra() {
        super("Comprar Produto", "imprimir");
    }

    public void actionPerformed(ActionEvent e) {

        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaComprarProduto());

    }
}
