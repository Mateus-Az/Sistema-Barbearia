/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.codigos.models;

import java.util.Date;

public class Usuario extends Pessoa{
    protected String senha;   
    protected String nivelDeAcesso;
   
    public Usuario(int id, String nome, char sexo, String dataDeNascimento, String telefone,String email,String rg, String senha,String nivelDeAcesso) {
        super(id, nome, sexo, dataDeNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

}
