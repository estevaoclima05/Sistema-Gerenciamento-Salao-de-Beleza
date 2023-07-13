/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.FormCadastroView;

/**
 *
 * @author estev
 */
public class UsuarioDAO {
    
    
    private String oi;
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
    
            String sql = "insert  into usuario(nome, email, telefone, usuario, senha) values ('"+ usuario.getNome()+"','"+ usuario.getEmail()+"','"+ usuario.getTelefone()+"','"+ usuario.getUsuario() +"', '"+usuario.getSenha()+"')";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            
            
       
    }   

    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where usuario = '"+ usuario.getUsuario() +"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
}

   
}