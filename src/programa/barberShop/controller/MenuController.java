/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.barberShop.controller;

import programa.barberShop.view.Agenda;
import programa.barberShop.view.Menu;

public class MenuController {
    private final Menu view;
    
    public MenuController(Menu view){
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
    }
    
}
