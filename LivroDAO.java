
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {

    // Método para cadastrar um novo livro no banco de dados
    public boolean salvar(String titulo, String autor, double preco, int usuarioId) {
        String sql = "INSERT INTO Livro (titulo, autor, preco, usuario_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setDouble(3, preco);
            stmt.setInt(4, usuarioId);

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao salvar livro: " + e.getMessage());
            return false;
        }
    }
}