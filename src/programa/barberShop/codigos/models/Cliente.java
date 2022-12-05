/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.codigos.models;

import java.util.Date;

public class Cliente extends Pessoa {
    
    private String endereço;
    private String cep;

    public Cliente(int id, String nome, char sexo, String dataDeNascimento, String telefone, String email, String rg, String endereço, String cep) {
        super(id, nome, sexo, dataDeNascimento, telefone, email, rg);
        this.endereço = endereço;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, String telefone, String endereço) {
        super( id, nome);
        this.endereço = endereço;
    }
    public Cliente(int id, String nome,String endereço, String cep) {
        super(id, nome);
        this.cep = cep;
        this.endereço = endereço;
    }
    

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
