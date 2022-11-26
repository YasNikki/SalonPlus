
package main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.splash_GUI;

public class Main {

    public static void main(String[] args) {
        
        controller.Conexao_BD.carregaDriver();
        
        model.autenticacao_DAO.DateAuth();
        try {
            model.autenticacao_DAO.Auth();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new splash_GUI().setVisible(true);
        
    }
    
}
