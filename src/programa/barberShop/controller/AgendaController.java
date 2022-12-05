/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.controller;

import java.util.ArrayList;
import programa.barberShop.codigos.models.Agendamento;
import programa.barberShop.codigos.models.Cliente;
import programa.barberShop.codigos.models.DAO.AgendamentoDAO;
import programa.barberShop.codigos.models.DAO.ClienteDAO;
import programa.barberShop.codigos.models.DAO.ServicoDAO;
import programa.barberShop.codigos.models.Servico;
import programa.barberShop.controller.Helper.AgendamentoHelper;
import programa.barberShop.view.Agenda;
import programa.barberShop.view.Menu;

public class AgendaController {
   private final Agenda view;
   private final AgendamentoHelper helper;
   
    public AgendaController(Agenda view){
        this.view = view;
        this.helper = new AgendamentoHelper(view);
        
    }
    public void atualizaTabela(){
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
       ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
       helper.preencherTabela(agendamentos);
    }

    public void voltarMenu() {
     Menu menu = new Menu();
     menu.setVisible(true);
    }
    public void atualizaClientes(){
        ClienteDAO clienteDAO = new ClienteDAO();
       ArrayList<Cliente> clientes = clienteDAO.selectAll();
       helper.preencherClientes(clientes);
    }
    public void atualizaServiço(){
        ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDAO.selectAll();
       helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
    Servico servico = helper.obterServico();
    helper.setValor(servico.getValor());
    }
   
    public void agendar() {
       Agendamento agendamento = helper.obterModelo();
       new AgendamentoDAO().insert(agendamento);
       atualizaTabela();
       helper.limparTela();
    }
}
