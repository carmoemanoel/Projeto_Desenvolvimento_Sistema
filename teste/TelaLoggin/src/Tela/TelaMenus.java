package Tela;

import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;

public class TelaMenus extends JFrame implements ActionListener {

    JMenu mnCadastro, mnProdutoEstoque, mnVendas, mnFerramenta;
    JMenuItem miCliente, miFornecedores, miVendedores, miCadProduto, miGenProduto, miConsultarProduto, miVenda, miGenVenda, miConsultarVenda;
    JMenuBar barMenu;
    JToolBar tbarMenu;
    JButton btnClientes, btnFornecedores, btnVendedores, btnProdutos, btnVendas, btnConsultar;
    Separator Separador;

    public TelaMenus() {

        try {
            setLayout(null);
            setTitle("Loggin CEF - Menu Inicial");// Titulo da Pagina.
            setSize(775, 320); // tamanho de janela
            setLocation(200, 100); //margens
            setResizable(false); //deixa a janela fixa

            //menu
            barMenu = new JMenuBar();

            //cadastro
            mnCadastro = new JMenu("Cadastro");
            barMenu.add(mnCadastro);

            miCliente = new JMenuItem("Cadastra Clientes");
            mnCadastro.add(miCliente);

            miFornecedores = new JMenuItem("Cadastra Fornecedores");
            mnCadastro.add(miFornecedores);

            miVendedores = new JMenuItem("Cadastra Vendedores");
            mnCadastro.add(miVendedores);

            //Produtos/Estoque
            mnProdutoEstoque = new JMenu("Produtos/Estoque");
            barMenu.add(mnProdutoEstoque);

            miCadProduto = new JMenuItem("Cadastra Produto");
            mnProdutoEstoque.add(miCadProduto);

            miGenProduto = new JMenuItem("Gerenciar Estoque");
            mnProdutoEstoque.add(miGenProduto);

            miConsultarProduto = new JMenuItem("Gerenciar Consultar");
            mnProdutoEstoque.add(miConsultarProduto);

            //Vendas
            mnVendas = new JMenu("Pedidos de Vendas");
            barMenu.add(mnVendas);

            miVenda = new JMenuItem("Fazer Pedido");
            mnVendas.add(miVenda);

            miGenVenda = new JMenuItem("Gerenciar Pedidos");
            mnVendas.add(miGenVenda);

            miConsultarVenda = new JMenuItem("Consultar Venda");
            mnVendas.add(miConsultarVenda);

            //Ferramentas
            mnFerramenta = new JMenu("Ferramentas");
            barMenu.add(mnFerramenta);

            //Barra com funções
            tbarMenu = new JToolBar();

            tbarMenu.setRollover(true);
            tbarMenu.setFloatable(false);
            getContentPane().add(tbarMenu);
            tbarMenu.setBounds(0, 0, 760, 60);

            // botão
            URL urlimgiconClientes = new URL("https://bl3302files.storage.live.com/y4mCqyTJ_xe5p2jHmPCoRDM1V-nOrlzqTitc6Q9pP9s6yyD5dcykAZf_J_l7c6xb06eAjKGfg3k72tJR8CzKf5DMXxJtQ2BWuGRm_iUzX-guAdsjp8HfINhpNfpeRrYcAT2WpgolVzpyR9uLRh77DlOaZp3zcZjwhlCmCgmpLnpTvVMm4ijsZ36zAMuHhqQGRjH7eOEOiOdLJYKRAt1T7jSBcxva3OIaPiqJ3vlHNVR-IA?encodeFailures=1&width=48&height=48");
            ImageIcon iconClientes = new ImageIcon(urlimgiconClientes);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnClientes = new JButton("Clientes", iconClientes);

            tbarMenu.add(btnClientes);

            URL urlimgiconFornecedores = new URL("https://bl3302files.storage.live.com/y4mnX6dfZDjTqtFY7K1LhQI6NLI1ofUfvSKYI2J_Xb_A6WKLpSgQ5QAk9EdHcn_y30VczyWhOUXbXbMkGw9cwzjFqfPD2MGqP_FX24v-uheQkDh56kOEZrxMAw57YmAw7Z6eS1bgtcM_NuL99xn_OrKqmD9oz-WZ5Gg7xBMUwFdPKak_ClSUfLYPMdI_qHFY_mF?width=48&height=48&cropmode=none");
            ImageIcon iconFornecedores = new ImageIcon(urlimgiconFornecedores);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnFornecedores = new JButton("Fornecedores", iconFornecedores);
//        btnFornecedores.addActionListener(this);
            tbarMenu.add(btnFornecedores);

            URL urlimgiconVendedores = new URL("https://bl3302files.storage.live.com/y4mDOdgU7yPwDBT0odrPDlkcsUA0bDCo7KhhNhfK9hLPPS9crmxzIwqT72BHNa_m3bzK9v_Oe2RjLZ2p5Ke2ecMhjw9llQjRAsY2Zn4irRCYk9PoJegqLuy7wgH4kTwswxumZOF2z5a57mf2N_s1nm3Tfsc3v5qMFSPaoanYJ0FYxbF-6yUjP1Nr4QvrscqVoDe?width=48&height=48&cropmode=none");
            ImageIcon iconVendedores = new ImageIcon(urlimgiconVendedores);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnVendedores = new JButton("Vendedores", iconVendedores);
//        btnVendedores.addActionListener(this);
            tbarMenu.add(btnVendedores);

            Separador = new Separator();
            tbarMenu.add(Separador);

            URL urlimgiconProdutos = new URL("https://bl3302files.storage.live.com/y4mOomM2n_qMR5CBI2g8LqgKNQURw1bP-ROFLqqRR-Fc-3RpjHLqDKVDOKnJy58ylboB73oxRc1I9SwnhgvsVjLxV6_9RJW4LO63NxPx1GBYWiDy3OvUQ5z_tVwaZ15JQ64ND6QMaLXaI1eawTWQTjhSOvzN3C4VAFmb-P7OuogyoHyGmK59PCFzrK8EfvdLLEV?width=48&height=48&cropmode=none");
            ImageIcon iconProdutos = new ImageIcon(urlimgiconProdutos);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnProdutos = new JButton("Produtos", iconProdutos);
//        btnVendedores.addActionListener(this);
            tbarMenu.add(btnProdutos);

            URL urlimgiconVendas = new URL("https://bl3302files.storage.live.com/y4moTp5wwAdeOqagSdo-XZI5-VG0-qhOO03h-24vw9YKg7ZUMN9dBB73oxikukjQMcT2oa-9pFO31ODUi-x3oZiTtmDGBtkc0tPbMKf-iyHk3M-_2rOFzGXZYCHvp5G6boDQAQ_T7ebr6XbYNQ7KHeGsBwfePS8gu4-DCVNA6Mpk-CScx6a2Pyb08P9tIPL8zUR?width=48&height=48&cropmode=none");
            ImageIcon iconVendas = new ImageIcon(urlimgiconVendas);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnVendas = new JButton("Vendas", iconVendas);
//        btnVendedores.addActionListener(this);
            tbarMenu.add(btnVendas);

            URL urlimgiconConsultar = new URL("https://bl3302files.storage.live.com/y4mCeOsF25t7PGLpt2-p5s9eMro0WalTaD6M-kYRvONySYui-W5Ru0tM5UK_arLS00uTloEayfaUurraqS0otUrGVjDk95xuKg9MFtIborK0KcoGn76a6rZwj1llkD1PWVZcH354W0Lyllspix-wq3GzaLfE1oVaq_ZlTti0-LwBvKBneyrI0SbPeJGw81HyurX?width=48&height=48&cropmode=none");
            ImageIcon iconConsultar = new ImageIcon(urlimgiconConsultar);
            while (iconClientes.getImageLoadStatus() == MediaTracker.LOADING);
            btnConsultar = new JButton("Consultar", iconConsultar);
//        btnVendedores.addActionListener(this);
            tbarMenu.add(btnConsultar);

//xxxxxxxxxxxxx
            setJMenuBar(barMenu);

            setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar o programa
        } catch (MalformedURLException ex) {
            Logger.getLogger(TelaMenus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
