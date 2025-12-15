package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciadorRoupas {
    private final String url = "jdbc:mysql://localhost:3306/loja";
    private final String user = "root";
    private final String password = "admin";

    //Metodo para conectar ao banco
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }

    //Metodo para cadastrar roupas ao banco
    public void cadastrarRoupa(Roupa roupa){

        String sql = "INSERT INTO roupas (marca, tipo, tamanho, quantidade, preco)"
                + " VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, roupa.getMarca());
            stmt.setString(2, roupa.getTipo());
            stmt.setString(3, roupa.getTamanho());
            stmt.setInt(4, roupa.getQuantidade());
            stmt.setDouble(5, roupa.getPreco() );

            stmt.execute();
            System.out.println("Cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}
