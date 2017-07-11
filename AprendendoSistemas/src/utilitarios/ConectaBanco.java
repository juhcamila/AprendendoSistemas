/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MAQLABiii
 */
public class ConectaBanco {
   public  Statement atm;//responsavel por preparar e realizar pesquisas no banco de dados 
   public  ResultSet rs;// responsavel por armazenar o resultado de uma pesquisa passada para o statement 
   private  String driver = "net.sourceforge.jtds.jdbc.Driver";// responsavel por identificar o serviço de banco de dados
    private String caminho = "jdbc:jtds:sqlserver://MAQLABIII-PC:1433/teste";// responsavel por setar o local do banco de dados
    private String usuario= "sa";
    private String senha = "dba";
    public Connection con; // responsavel pela conexao do banco de dados

public void conexao(){//método responsavel por realizar a conexao com o banco de dados
    
       try {
           System.setProperty("jdbc.Drivers", driver);// seta a propriedade do driver de conexao
           con = DriverManager.getConnection(caminho, usuario, senha);// realiza a conexao com o banco de dados
   //  JOptionPane.showMessageDialog(null, "Conectado com sucesso");
       } catch (SQLException ex) { // excessão 
          JOptionPane.showMessageDialog(null, "Erro de conexao!\n Erro:"+ ex.getMessage());
       }

    }

     public void executeSQL(String sql){
       try {
           atm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
           rs = atm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro de ExecuteSQL!\nErro: "+ex.getMessage());
       }
     }
  
public void desconecta(){
       try {
           con.close();
          // JOptionPane.showMessageDialog(null, "Desconectado com Sucesso");
      
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao!\n Erro:"+ ex.getMessage());
       
       }
}
}
