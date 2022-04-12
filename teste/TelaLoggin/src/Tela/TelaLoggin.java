package Tela;

import Data.CEF_Dao;
import Data.Usuarios;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaLoggin extends JFrame implements ActionListener {

    private final JLabel lblCEF, lblCpf, lblSenha, lblCadastrar;
    private final JTextField txtCpf, pwdSenha;
    private final JButton btnEntra, btnCadastrar;

    private boolean status;

    public TelaLoggin() throws ParseException {

        //Projetando tela
        setLayout(null);
        setTitle("Loggin CEF - Manager Inventory");// Titulo da Pagina.
        setSize(370, 270); // tamanho de janela
        setLocation(200, 100); //margens
        setResizable(false); //deixa a janela fixa

        //Elementos da Janela
//        .setFont(new java.awt.Font("Dialog", 0, 24));   altera tamanho da fonte
        //CEF
        lblCEF = new JLabel("CEF - Login");
        lblCEF.setSize(200, 40);
        lblCEF.setLocation(120, 5);
        lblCEF.setFont(new Font("Dialog", 1, 30));
        add(lblCEF);

        //usuario
        lblCpf = new JLabel("Usuario: ");
        lblCpf.setSize(80, 30);
        lblCpf.setLocation(30, 60);
        add(lblCpf);

        txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCpf.setSize(95, 30);
        txtCpf.setLocation(100, 60);
        add(txtCpf);

        //senha
        lblSenha = new JLabel("Senha: ");
        lblSenha.setSize(80, 30);
        lblSenha.setLocation(30, 100);
        add(lblSenha);

        pwdSenha = new JPasswordField();
        pwdSenha.setSize(200, 30);
        pwdSenha.setLocation(100, 100);
        add(pwdSenha);

        //botões
        //entra        
        btnEntra = new JButton("Entrar");
        btnEntra.setSize(75, 30);
        btnEntra.setLocation(225, 140);
        btnEntra.addActionListener(this);
        add(btnEntra);

        //cadastrar        
        lblCadastrar = new JLabel("Não possui Cadastro ?");
        lblCadastrar.setSize(135, 30);
        lblCadastrar.setLocation(145, 195);
        add(lblCadastrar);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setSize(95, 30);
        btnCadastrar.setLocation(265, 195);

        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadastrar.setForeground(new Color(0, 0, 255));

        btnCadastrar.addActionListener(this);
        add(btnCadastrar);

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar o programa

    }

    public static void main(String[] args) throws ParseException {

        //chamar o construtor da tela de loggin.
        TelaLoggin Loggin;
        Loggin = new TelaLoggin();
        Loggin.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Programar botões
        if (e.getSource() == btnEntra) {

            TelaMenus iniciar;
            iniciar = new TelaMenus();
            iniciar.setVisible(true);
            dispose();
//            Usuarios usuarios;
//            usuarios = new Usuarios();
//            
//            usuarios.setLoggin_usuario(txtCpf.getText());
//            usuarios.setLoggin_senha(pwdSenha.getText());
//            
//            CEF_Dao dao;
//
//            dao = new CEF_Dao();
//            
//            dao.conexao();
//            
//            status = dao.autenticar(usuarios);
//            
//            if (!status) {
//
//                JOptionPane.showMessageDialog(null, "Error: Usuario/Senha Incorreto");
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Bem Vindo !");
//                TelaMenus iniciar;
//                iniciar = new TelaMenus();
//                iniciar.setVisible(true);
//                dispose();
//            }

        } else if (e.getSource() == btnCadastrar) {
            TelaCadUser telacaduser;
            telacaduser = new TelaCadUser();
            telacaduser.setVisible(true);
        }
        // else if (e.getSource() = btnEntra)
        // programar proximo botão
    }

}
