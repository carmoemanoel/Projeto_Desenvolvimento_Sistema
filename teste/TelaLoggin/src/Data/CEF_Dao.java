package Data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CEF_Dao {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/cef";
    private final String USER = "root";
    private final String PASS = "";

    Connection con;
    Statement st;
    PreparedStatement sql;

    public boolean conexao() {

        try {

            Class.forName(DRIVER);

            con = DriverManager.getConnection(URL, USER, PASS);

            st = con.createStatement();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {

            return false;

        }

    }

    public boolean salvar(Usuarios usuarios) {

        //coloca a classe da tela loggin para receber os dados dentro ()
        try {

            sql = con.prepareStatement("INSERT INTO usuarios VALUES (null, ? , ? , ? , ? ,'sem cargo', ? ,'999.999.999-99', ?)");

            sql.setString(1, usuarios.getUser_NomeCompleto());

            sql.setString(2, usuarios.getUser_CPF());

            sql.setString(3, usuarios.getUser_DataNasc());

            sql.setString(4, usuarios.getUser_Email());

            sql.setString(5, usuarios.getUser_Senha());

            String dataAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            

            System.out.println(dataAtual);
            sql.setString(6, dataAtual);

            sql.executeUpdate();

            return true;

        } catch (SQLException ex) {return false;}

    }

    public boolean autenticar(Usuarios usuarios) {

        try {

            sql = con.prepareStatement("SELECT * FROM usuarios WHERE User_CPF = ? AND User_Senha = ?");

            sql.setString(1, usuarios.getLoggin_usuario());

            sql.setString(2, usuarios.getLoggin_senha());

            ResultSet rs = sql.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }

    }

    public void desconectar() {

        try {

            con.close();

        } catch (SQLException ex) {

        }

    }

}
