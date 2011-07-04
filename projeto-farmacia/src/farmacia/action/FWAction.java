package farmacia.action;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import farmacia.apresentacao.JanelaPrincipal;

public abstract class FWAction extends AbstractAction {

    public FWAction(String nomeAcao, String nomeIcone) {
        super(nomeAcao,
                new ImageIcon(JanelaPrincipal.class.getResource("/farmacia/imagens/" + nomeIcone + ".png")));
    }

    public FWAction(String nomeAcao) {
        super(nomeAcao);
    }


}
