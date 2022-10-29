package view;

import model.Agendamento;
import model.Cliente;
import model.Pessoa;
import model.Servico;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico(1, "Barba", 30);
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1,"Ze", "rua xpto", "2440590");
        System.out.println(cliente.getNome());
        
        Usuario user = new Usuario(1,"Cin", "123");
        System.out.println(user.getSenha());
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "28/12/1987 18:21");
        System.out.println(agendamento.getCliente().getNome());
    }
}
