package listadetarefas;

public class Usuario {
    private String email;
    private String senha;
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getSenha(){
        return this.senha;
    }
}
