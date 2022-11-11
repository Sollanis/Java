package controller;

import View.Login;

public class LoginController {

    private final Login view;
    public LoginController(Login view){
        this.view = view;
    }
    
    public void fizTarefa(){
        System.out.println("Query no Banco de Dados");
        this.view.exibirMensagem("Executei a tarefa");
    }
    
}
