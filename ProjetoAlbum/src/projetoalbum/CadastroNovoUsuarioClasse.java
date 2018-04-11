
package projetoalbum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CadastroNovoUsuarioClasse {
    private Connection conexao;
            

    
    public CadastroNovoUsuarioClasse(){
        try {
            this.conexao = CriarConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
    
    public void inserirusuario(){
     
     String sql;
     sql = "";
    
  
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();      
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
    
    
    

    
}






