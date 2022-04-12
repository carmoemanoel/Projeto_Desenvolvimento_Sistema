package Data;


//INSERT INTO `Usuarios`(`User_ID`, `User_NomeCompleto`, `User_CPF`, `User_DataNasc`, `User__Email`, `User_Cargo`, `User_Senha`, `CPF_Adm`, `User_DataCadastro`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]','[value-9]')
//INSERT INTO `Usuarios`(`User_NomeCompleto`, `User_CPF`, `User_DataNasc`, `User__Email`, `User_Cargo`, `User_Senha`, `CPF_Adm`, `User_DataCadastro`) VALUES ('Admin','999.999.999-99','00000000','admin@admin.com','admin','admin','999.999.999-99','00000000')
public class Usuarios {
    
    int User_ID;
    String User_NomeCompleto;
    String User_CPF;
    String User_DataNasc;
    String User_Email;
    String User_Cargo;
    String User_Senha;
    String CPF_Adm;
    String User_DataCadastro;
    String Loggin_usuario;
    String Loggin_senha;

    public Usuarios() {
        
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getUser_NomeCompleto() {
        return User_NomeCompleto;
    }

    public void setUser_NomeCompleto(String User_NomeCompleto) {
        this.User_NomeCompleto = User_NomeCompleto;
    }

    public String getUser_CPF() {
        return User_CPF;
    }

    public void setUser_CPF(String User_CPF) {
        this.User_CPF = User_CPF;
    }

    public String getUser_DataNasc() {
        return User_DataNasc;
    }

    public void setUser_DataNasc(String User_DataNasc) {
        this.User_DataNasc = User_DataNasc;
    }

    public String getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(String User_Email) {
        this.User_Email = User_Email;
    }

    public String getUser_Cargo() {
        return User_Cargo;
    }

    public void setUser_Cargo(String User_Cargo) {
        this.User_Cargo = User_Cargo;
    }

    public String getUser_Senha() {
        return User_Senha;
    }

    public void setUser_Senha(String User_Senha) {
        this.User_Senha = User_Senha;
    }

    public String getCPF_Adm() {
        return CPF_Adm;
    }

    public void setCPF_Adm(String CPF_Adm) {
        this.CPF_Adm = CPF_Adm;
    }

    public String getUser_DataCadastro() {
        return User_DataCadastro;
    }

    public void setUser_DataCadastro(String User_DataCadastro) {
        this.User_DataCadastro = User_DataCadastro;
    }

    public String getLoggin_usuario() {
        return Loggin_usuario;
    }

    public void setLoggin_usuario(String Loggin_usuario) {
        this.Loggin_usuario = Loggin_usuario;
    }

    public String getLoggin_senha() {
        return Loggin_senha;
    }

    public void setLoggin_senha(String Loggin_senha) {
        this.Loggin_senha = Loggin_senha;
    }
        
}
