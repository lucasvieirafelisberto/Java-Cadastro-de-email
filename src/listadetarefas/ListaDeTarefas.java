package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       ArrayList <Usuario> usuarios = new ArrayList();
       
       boolean run = true;
       
       while(run){
            System.out.println("1 - Cadastrar usuario");
            System.out.println("2 - Listar todos usuarios");
            System.out.println("3 - procurar por email");
            System.out.println("4 - atualizar dados");
            System.out.println("5 - remover");
            System.out.println("0 - sair");
            String opc = ler.nextLine();
        
            switch(opc){
                case "1":{
                    System.out.println("************ Cadastro ************\n");
                    System.out.println("Email");
                    String email = ler.next();
        
                    System.out.println("senha");
                    String senha = ler.next();
        
                    Usuario u = new Usuario(); 
                    u.setEmail(email);
                    u.setSenha(senha);
                    usuarios.add(u);
                
                    break;
                }
                case "2":{
                    System.out.println("******** Todos os usuários ********");
                    for(int i = 0; i<usuarios.size(); i++){
                        Usuario user = usuarios.get(i);
                        System.out.println("Codigo de usuario "+(i+1));
                        System.out.println("\temail: "+user.getEmail()); 
                        System.out.println("\tsenha: "+user.getSenha());
                    }
                    break;
                }
                case "3":{
                    System.out.println("******* Search *******");
                    System.out.println("Digite o email");
                    String email = ler.nextLine();
                    
                    boolean encontra = false;
                    
                    for(int i = 0; i<usuarios.size(); i++){
                        Usuario utemp = usuarios.get(i);
                        if(email.equals(utemp.getEmail())){
                            System.out.println("Usuario encontrado\n");
                            System.out.println("\tEmail: "+utemp.getEmail());
                            System.out.println("\tSenha: "+utemp.getSenha());
                            encontra = true;
                            break;
                        }

                    }
                        
                    if(encontra == false){
                        System.out.println("Não encontrado");
                    }
                    
                    break;
                }
                case "4":{
                    System.out.println("****** Atualização ******");
                    for(int i = 0; i<usuarios.size(); i++){
                        Usuario utemp = usuarios.get(i);
                        System.out.println("Codigo: "+i);
                        System.out.println(utemp.getEmail());
                        System.out.println("-------------------------------\n");
                    }
                    System.out.println("Digite o codigo");
                    int ref = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Novo Email");
                    String nEmail = ler.nextLine();
                    System.out.println("Nova Senha");
                    String nSenha = ler.nextLine();
                    
                    Usuario u = usuarios.get(ref);
                    u.setEmail(nEmail);
                    u.setSenha(nSenha);
                    
                    break;
                }
                case "5":{
                    System.out.println("****** Remover ******");
                    for(int i = 0; i<usuarios.size(); i++){
                        Usuario utemp = usuarios.get(i);
                        System.out.println("Codigo: "+i);
                        System.out.println(utemp.getEmail());
                        System.out.println("-------------------------------\n");
                    }
                    System.out.println("Digite o codigo");
                    int ref = ler.nextInt();
                    ler.nextLine();
                    usuarios.remove(ref);
                    break;
                }
                case "0":{
                    run = false;
                
                }
            }
       }
       
        
    }
    
}
