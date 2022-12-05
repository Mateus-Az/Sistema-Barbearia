/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.controller.Helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import programa.barberShop.codigos.models.Agendamento;
import programa.barberShop.codigos.models.Cliente;
import programa.barberShop.codigos.models.Servico;
import programa.barberShop.view.Agenda;


public class AgendamentoHelper implements IHelper{
    private final Agenda view;

    public AgendamentoHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
     DefaultTableModel tableModel = (DefaultTableModel) view.getjTable2Tabela().getModel();
     tableModel.setNumRows(0);
    agendamentos.forEach(agendament -> tableModel.addRow(new Object[]{
        agendament.getId(),
        agendament.getCliente().getNome(),
        agendament.getServico().getDescricao(),
        agendament.getValor(),
        agendament.getDataFormatada(),
        agendament.getHoraFormatada(),
        agendament.getObservacao()
        }));
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxCliente = (DefaultComboBoxModel) view.getComboBoxCliente().getModel();
        clientes.forEach(cliente -> comboBoxCliente.addElement(cliente));
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
         DefaultComboBoxModel comboBoxServico = (DefaultComboBoxModel) view.getComboBoxServico().getModel();
         servicos.forEach(servico -> comboBoxServico.addElement(servico));
    }

    public Servico obterServico() {
    return (Servico)view.getComboBoxServico().getSelectedItem();
    }
    public Cliente obterCliente() {
    return (Cliente)view.getComboBoxCliente().getSelectedItem();
    }

    public void setValor(double valor) {
    view.getjTextField4().setText(valor + "");
    }

    public void buscar() {
        
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getjTextField1().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextField4().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextField2().getText();
        String hora = view.getjTextField3().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea1().getText();
        Agendamento agendamento = new Agendamento(0, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getjTextField1().setText("0");
        view.getjTextField2().setText("");
        view.getjTextField3().setText("");
        view.getjTextArea1().setText("");
    }

}

    

