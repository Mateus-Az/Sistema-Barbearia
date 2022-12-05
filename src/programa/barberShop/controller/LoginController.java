/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.controller;

import programa.barberShop.codigos.models.DAO.UsuarioDAO;
import programa.barberShop.codigos.models.Usuario;
import programa.barberShop.controller.Helper.LoginHelper;
import programa.barberShop.view.Login;
import programa.barberShop.view.Menu;

public class LoginController {
    private final Login view;
    private final LoginHelper helper;
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void entrarNoSistema(){
     Usuario usuario = helper.obterModelo(view);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticacao = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticacao != null){
            Menu menu = new Menu();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou Senha inválidos");
        }
    }
}
