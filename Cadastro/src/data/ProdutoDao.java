
package data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ProdutoDao {
    Connection conn;
    Statement st; //PreparedStateman st;
    
    //Método que conecta com o banco de dados 
    public boolean conectar(){     
        try {
     //Depois que instalar o conector do banco do Mysql só iremos usar a pasta com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");            
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","");
           st = conn.createStatement();
             return true;
        } catch (ClassNotFoundException ex) {
           return false;
        } catch (SQLException ex) {
             return false;
        }
           
    }
    //Método que salva as informações no banco de dados
    public boolean salvar(Produto produto){
        try {
            String sql;
            sql = "INSERT INTO produto VALUES ('"+ produto.getCod()+"','"+produto.getProduto()+"',"+produto.getQuantidade()+","+produto.getPrecoCompra()+","+produto.getPrecoVenda()+",'"+produto.getFornecedor()+"')";
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
                
    }
    //Método para desconectar
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
    }
    
    
    
}
