package Tela;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private final JMenu mnCadastro, mnProdutoEstoque, mnVendas, mnFerramenta;
    private final JMenuItem miCliente, miFornecedores, miVendedores, miCadProduto, miGenProduto, miConsultarProduto, miVenda, miGenVenda,miConsultarVenda;
    private final JMenuBar barMenu;
    private final JToolBar tbarMenu;
    private final JButton btnClientes, btnFornecedores, btnVendedores, btnProdutos, btnVendas, btnConsultar;
    private final Separator Separador;

    public TelaMenus() {

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
        ImageIcon iconClientes = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\Clientes.png");
        btnClientes = new JButton("Clientes", iconClientes);
//        btnClientes.setMargin(new Insets(2, 2, 2, 2)); //ajusta o tamanho do botão
//        btnClientes.addActionListener(this);
        tbarMenu.add(btnClientes);
        
        ImageIcon iconFornecedores = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\fornecedores.png");
        btnFornecedores = new JButton("Fornecedores", iconFornecedores);
//        btnFornecedores.addActionListener(this);
        tbarMenu.add(btnFornecedores);
        
        ImageIcon iconVendedores = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\Vendedores.png");
        btnVendedores = new JButton("Vendedores",iconVendedores);
//        btnVendedores.addActionListener(this);
        tbarMenu.add(btnVendedores);
        
        Separador = new Separator();
        tbarMenu.add(Separador);
        
        ImageIcon iconProdutos = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\Produtos.png");
        btnProdutos = new JButton("Produtos",iconProdutos);
//        btnVendedores.addActionListener(this);
        tbarMenu.add(btnProdutos);
        
        ImageIcon iconVendas = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\Vendas.png");
        btnVendas = new JButton("Vendas",iconVendas);
//        btnVendedores.addActionListener(this);
        tbarMenu.add(btnVendas);
        
        ImageIcon iconConsultar = new ImageIcon("C:\\Users\\user\\Downloads\\TelaLoggin\\TelaLoggin\\Icons\\Consultar.png");
        btnConsultar = new JButton("Consultar",iconConsultar);
//        btnVendedores.addActionListener(this);
        tbarMenu.add(btnConsultar);
        
        //xxxxxxxxxxxxx
        setJMenuBar(barMenu);

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar o programa
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
