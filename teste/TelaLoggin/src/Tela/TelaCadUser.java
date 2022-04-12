package Tela;

import Data.CEF_Dao;
import Data.Usuarios;
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

public class TelaCadUser extends JFrame implements ActionListener {

    private boolean status;

    JLabel lblCabecalho, lblNome, lblCpf, lblDataNasc, lblEmail, lblSenha, lblRSenha;
    JTextField txtNome, txtCpf, txtDataNasc, txtEmail, txtSenha, txtRSenha;
    JButton btnCadastrar;

    public TelaCadUser() {

        //cabecalho
        lblCabecalho = new JLabel("CEF - Cadastro");
        lblCabecalho.setSize(230, 40);
        lblCabecalho.setLocation(120, 5);
        lblCabecalho.setFont(new Font("Dialog", 1, 30));
        add(lblCabecalho);

        setLayout(null);
        setTitle("Loggin CEF - Admin - Cadastro");// Titulo da Pagina.
        setSize(430, 320); // tamanho de janela
        setLocation(200, 100); //margens
        setResizable(false); //deixa a janela fixa

        setDefaultCloseOperation(HIDE_ON_CLOSE);

        //nome
        lblNome = new JLabel("Nome Completo:");
        lblNome.setSize(100, 30);
        lblNome.setLocation(30, 60);
        add(lblNome);

        txtNome = new JFormattedTextField();
        txtNome.setSize(260, 30);
        txtNome.setLocation(135, 60);
        add(txtNome);

        //cpf
        lblCpf = new JLabel("CPF:");
        lblCpf.setSize(40, 30);
        lblCpf.setLocation(30, 95);
        add(lblCpf);

        //DataNasc
        lblDataNasc = new JLabel("Data de Nascimento:");
        lblDataNasc.setSize(130, 30);
        lblDataNasc.setLocation(170, 95);
        add(lblDataNasc);

        //Email
        lblEmail = new JLabel("E-Mail:");
        lblEmail.setSize(40, 30);
        lblEmail.setLocation(30, 130);
        add(lblEmail);

        txtEmail = new JFormattedTextField();
        txtEmail.setSize(200, 30);
        txtEmail.setLocation(75, 130);
        add(txtEmail);

        //Senha
        lblSenha = new JLabel("Senha:");
        lblSenha.setSize(40, 30);
        lblSenha.setLocation(30, 165);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setSize(200, 30);
        txtSenha.setLocation(75, 165);
        add(txtSenha);

        lblRSenha = new JLabel("Repita a Senha:");
        lblRSenha.setSize(100, 30);
        lblRSenha.setLocation(30, 200);
        add(lblRSenha);

        txtRSenha = new JPasswordField();
        txtRSenha.setSize(200, 30);
        txtRSenha.setLocation(135, 200);
        add(txtRSenha);

        try {
            MaskFormatter formatCPF = new MaskFormatter("###.###.###-##");
            txtCpf = new JFormattedTextField(formatCPF);
            txtCpf.setSize(95, 30);
            txtCpf.setLocation(65, 95);
            add(txtCpf);

            MaskFormatter formatDataNasc = new MaskFormatter("##/##/####");
            txtDataNasc = new JFormattedTextField(formatDataNasc);
            txtDataNasc.setSize(95, 30);
            txtDataNasc.setLocation(300, 95);
            add(txtDataNasc);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

        //Botão
        //Registrar
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setSize(95, 30);
        btnCadastrar.setLocation(300, 235);
        btnCadastrar.addActionListener(this);
        add(btnCadastrar);

        }

    public static void main(String[] args) {

        TelaCadUser t;
        t = new TelaCadUser();
        t.setVisible(true);

//        Usuarios user;
//        user = new Usuarios();
//        
//        user.setUser_CPF("teste");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {

            Usuarios usuarios;
            usuarios = new Usuarios();

            usuarios.setUser_CPF(txtCpf.getText());
            usuarios.setUser_NomeCompleto(txtNome.getText());
            usuarios.setUser_DataNasc(txtDataNasc.getText());
            usuarios.setUser_Email(txtEmail.getText());
            usuarios.setUser_Senha(txtSenha.getText());
            String RepitaSenha = txtRSenha.getText();

            if (txtSenha.getText().equals(txtRSenha.getText())) {
                CEF_Dao dao;

                dao = new CEF_Dao();

                status = dao.conexao();

                if (!status) {

                    JOptionPane.showMessageDialog(null, "Error: Conexão Banco de Dados");

                } else {

                    status = dao.salvar(usuarios);

                    if (!status) {

                        JOptionPane.showMessageDialog(null, "Error ao Cadastrar Usuario !");

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso !");
                        dispose();
                    }

                    dao.desconectar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error ao cadastrarSenha Diferentes !! ");
            }

        }
    }
}
