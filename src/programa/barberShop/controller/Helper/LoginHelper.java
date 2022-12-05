/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.controller.Helper;

import javax.swing.text.View;
import programa.barberShop.codigos.models.Usuario;
import programa.barberShop.view.Login;

public class LoginHelper implements IHelper{
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario obterModelo(Login view){
        String user = view.getjTextField1User().getText();
        String password = view.getjPasswordField1().getText();
        Usuario usuario = new Usuario(0, user, password);
        return usuario;
        
    }

    public void setModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getjTextField1User().setText(nome);
        view.getjPasswordField1().setText(senha);
    }
    public void limparTela(){
        view.getjTextField1User().setText("");
        view.getjPasswordField1().setText("");         
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
