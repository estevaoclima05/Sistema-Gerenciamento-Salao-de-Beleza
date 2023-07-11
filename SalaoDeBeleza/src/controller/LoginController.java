/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.MenuView;
import view.LoginView;



public class LoginController {

   private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        // Buscar um usuario da view
        
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senha);
        
        // Verificar se existe um no BD
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
        
        
        // Se existir direcionar para menu, se n msg error.
        if(existe) {
            MenuView telamenu = new MenuView();
            telamenu.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(view, "Usuario ou senha incorretos, tente novamente.");
        }
        
    }
   
   
    
}
