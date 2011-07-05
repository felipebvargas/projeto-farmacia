package farmacia.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import farmacia.action.AcaoClienteListar;
import farmacia.action.AcaoClienteNovo;
import farmacia.action.AcaoFinalizarCompra;
import farmacia.action.AcaoProdutoListar;
import farmacia.action.AcaoProdutoNovo;

public class JanelaPrincipal extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 0;
    private JMenu mnSistema;
    private JMenuItem mniSair;
    private JMenu mnCliente;
    private JMenu mnProduto;
    private JMenuBar barraMenu;
    private JMenuItem mniClienteNovo;
    private JMenuItem mniClienteLista;
    private JMenuItem mniProdutoNovo;
    private JMenuItem mniProdutoLista;
    private JMenu mnRelatório;
    private JMenuItem mniFecharCompra;
    private JMenuItem mniLoginNormal;
    private JMenuItem mniLoginAdmin;

    public JanelaPrincipal() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Farmacia - FarmeVida ");
        this.setResizable(false);
        montaMenu();
        montaBarraFerramentas();
    }

    private void montaMenu() {
        barraMenu = new JMenuBar();

        this.setJMenuBar(barraMenu);

        mnSistema = new JMenu("Sistema");
        barraMenu.add(mnSistema);
        mniLoginNormal = new JMenuItem("Atendente");
        mniLoginAdmin = new JMenuItem("Supervisor");
        mnSistema.add(mniLoginNormal);
        mnSistema.add(mniLoginAdmin);

        mniSair = new JMenuItem("Sair", new ImageIcon(JanelaPrincipal.class.getResource("/farmacia/imagens/sair.png")));
        mniSair.setActionCommand("sair");
        mniSair.addActionListener(this);
        mnSistema.add(mniSair);

        mnCliente = new JMenu("Cliente");
        barraMenu.add(mnCliente);

        mniClienteNovo = new JMenuItem(acaoNovoCliente);
        mnCliente.add(mniClienteNovo);

        mniClienteLista = new JMenuItem(acaoListarClientes);
        mnCliente.add(mniClienteLista);

        mnProduto = new JMenu("Produto");
        barraMenu.add(mnProduto);


        mniProdutoNovo = new JMenuItem(acaoCadastrarProdutos);
        mnProduto.add(mniProdutoNovo);

        mniProdutoLista = new JMenuItem(acaoListarProdutos);
        mnProduto.add(mniProdutoLista);

        mnRelatório = new JMenu("Relatório");
        barraMenu.add(mnRelatório);

        mnRelatório.add(new JSeparator());

        mniFecharCompra = new JMenuItem(acaoFinalizarCompra);
        mnRelatório.add(mniFecharCompra);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = GestorJanela.getInstance().getAreaTrabalho();
        barraFerramentas = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        barraFerramentas.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(areaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JToolBar barraFerramentas;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("sair")) {
            System.exit(0);

        }
    }

    private void montaBarraFerramentas() {
        barraFerramentas.setFloatable(false);
    }
    private Action acaoListarClientes = new AcaoClienteListar();
    private Action acaoListarProdutos = new AcaoProdutoListar();
    private Action acaoNovoCliente = new AcaoClienteNovo();
    private Action acaoCadastrarProdutos = new AcaoProdutoNovo();
    private Action acaoFinalizarCompra = new AcaoFinalizarCompra();
}
