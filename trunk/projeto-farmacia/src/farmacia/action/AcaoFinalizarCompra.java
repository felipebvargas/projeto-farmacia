package farmacia.action;

import farmacia.apresentacao.GestorJanela;
import farmacia.apresentacao.JanelaInternaFinalizarCompras;
import java.awt.event.ActionEvent;

public class AcaoFinalizarCompra  extends FWAction {

    public AcaoFinalizarCompra() {
        super("Finalizar compras", "imprimir");
    }

    public void actionPerformed(ActionEvent e) {

        GestorJanela gestor = GestorJanela.getInstance();
        gestor.abrir(new JanelaInternaFinalizarCompras());

    }
}