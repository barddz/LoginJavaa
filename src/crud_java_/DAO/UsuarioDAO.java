package crud_java_.DAO;

import java.sql.PreparedStatement;
import crud_java_.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conexao;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conexao = new ConexaoDAO().ConectaBD();

        try {
            String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";

            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuarioDAO: " + erro);
            return null;
        }

    }

}
