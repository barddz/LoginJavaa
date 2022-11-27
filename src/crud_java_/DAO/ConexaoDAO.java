package crud_java_.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection ConectaBD (){
        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancousuarios?user=root&password=";
            conexao = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        } 
        return conexao;
    }
    }
