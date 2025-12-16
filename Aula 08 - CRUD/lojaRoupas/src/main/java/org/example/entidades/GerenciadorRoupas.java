package org.example.entidades;

import java.sql.*;

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
    //Metodo para excluir roupas
    public void excluirRoupa(int id) throws SQLException {

        String sql = "DELETE FROM roupas WHERE id = ?";

        Connection conexao = getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Removido com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo para atualizar valores do cadastro
    public void atualizarRoupa(int id, String marca, String tipo, String tamanho, int quantidade, double preco) throws SQLException {
        String sql  = "UPDATE roupas SET marca = ?, tipo = ?, tamanho = ?, quantidade = ?, preco = ? WHERE  id = ?";

        Connection conexao = getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, marca);
        stmt.setString(2, tipo);
        stmt.setString(3, tamanho);
        stmt.setInt(4, quantidade);
        stmt.setDouble(5, preco);
        stmt.setInt(6, id);
        stmt.execute();
        stmt.close();
        System.out.println("Atualizado com sucesso!");
    }

    //Metodo para listar todas as roupas da tabela
    public void listarRoupas() throws SQLException {
        String sql = "SELECT * FROM roupas";

        try {
            Connection conexao = getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String tipo = rs.getString("tipo");
                String tamanho = rs.getString("tamanho");
                int quantidade = rs.getInt("quantidade");
                double preco = rs.getDouble("preco");
                System.out.println(id + " | " + marca + " | " + tipo + " | " +  tamanho + " | " + quantidade + " | " + preco);
            }
            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
