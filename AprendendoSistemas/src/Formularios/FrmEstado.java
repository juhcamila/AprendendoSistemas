/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import utilitarios.ConectaBanco;
import utilitarios.ModeloTabela;

/**
 *
 * @author MAQLABiii
 */
public class FrmEstado extends javax.swing.JFrame {

   ConectaBanco conecta = new ConectaBanco();
    
    public FrmEstado() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from estados order by idestado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeEstado = new javax.swing.JTextField();
        sigla = new javax.swing.JTextField();
        novo = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEstado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        codigoEstado = new javax.swing.JTextField();
        ultimo = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        primeiro = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jLabel2.setText("Nome do Estado:");

        jLabel3.setText("Sigla:");

        nomeEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nomeEstado.setEnabled(false);

        sigla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sigla.setEnabled(false);

        novo.setText("Novo");
        novo.setToolTipText("");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.setEnabled(false);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.setEnabled(false);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        tableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEstado);

        jLabel4.setText("Código");

        codigoEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        codigoEstado.setEnabled(false);

        ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/110717125134_16.png"))); // NOI18N
        ultimo.setToolTipText("Ultimo");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/110717125605_16.png"))); // NOI18N
        anterior.setToolTipText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        primeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/110717125039_16.png"))); // NOI18N
        primeiro.setToolTipText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });

        proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/110717125107_16.png"))); // NOI18N
        proximo.setToolTipText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(codigoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvar)
                        .addGap(18, 18, 18)
                        .addComponent(alterar)
                        .addGap(18, 18, 18)
                        .addComponent(excluir)
                        .addGap(18, 18, 18)
                        .addComponent(primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codigoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(primeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proximo))
                            .addComponent(novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ultimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de cadastro de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(757, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

       try {
           PreparedStatement pst = conecta.con.prepareStatement("insert into estados(nomeEstado, siglaEstado) values (?,?)");
           
           pst.setString(1, nomeEstado.getText());
           pst.setString(2, sigla.getText());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(this, "Salvo com sucesso");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro de inserção!\n Erro:"+ex);
       }
       
        limparCampos();
       nomeEstado.setEnabled(false);
       sigla.setEnabled(false);
       alterar.setEnabled(false);
       excluir.setEnabled(false);
       novo.setEnabled(true);
       salvar.setEnabled(false);
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
       try {
           //conecta.executeSQL("delete from estados where siglaEstado='"+sigla.getText()+"'");
           // JOptionPane.showMessageDialog(rootPane, "Excuido com sucesso");
           PreparedStatement pst = conecta.con.prepareStatement("delete from estados where siglaEstado=?");
          pst.setString(1, sigla.getText());
          pst.execute();
          JOptionPane.showMessageDialog(this, "Excluido com sucesso!");
     
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro de exclusão!\n Erro:"+ex);
     
       }
      
      
    }//GEN-LAST:event_excluirActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        limparCampos();
       nomeEstado.setEnabled(true);
       sigla.setEnabled(true);
       alterar.setEnabled(true);
       excluir.setEnabled(true);
       novo.setEnabled(false);
       salvar.setEnabled(true);
       
    }//GEN-LAST:event_novoActionPerformed

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
         alterar.setEnabled(true);
         excluir.setEnabled(true);
        nomeEstado.setEnabled(true);
         sigla.setEnabled(true);
       try {
          conecta.executeSQL("select * from estados");
          conecta.rs.first();
          codigoEstado.setText(String.valueOf(conecta.rs.getInt("idestado")));
          nomeEstado.setText(conecta.rs.getString("nomeEstado"));
          sigla.setText(conecta.rs.getString("siglaEstado"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro ao mostrar dados!\n Erro:"+ex);
       }
    }//GEN-LAST:event_primeiroActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
         
        alterar.setEnabled(true);
         excluir.setEnabled(true);
        nomeEstado.setEnabled(true);
         sigla.setEnabled(true);
        try {
          conecta.executeSQL("select * from estados");
          conecta.rs.last();
          codigoEstado.setText(String.valueOf(conecta.rs.getInt("idestado")));
          nomeEstado.setText(conecta.rs.getString("nomeEstado"));
          sigla.setText(conecta.rs.getString("siglaEstado"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro ao mostrar dados!\n Erro:"+ex);
       }
    }//GEN-LAST:event_ultimoActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
      
       alterar.setEnabled(true);
         excluir.setEnabled(true);
        nomeEstado.setEnabled(true);
         sigla.setEnabled(true);
        try {
           conecta.rs.previous();
           codigoEstado.setText(String.valueOf(conecta.rs.getInt("idestado")));
          nomeEstado.setText(conecta.rs.getString("nomeEstado"));
          sigla.setText(conecta.rs.getString("siglaEstado")); 
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro ao mostrar dados!\n Erro:"+ex);
       }
          
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
       alterar.setEnabled(true);
         excluir.setEnabled(true);
        nomeEstado.setEnabled(true);
         sigla.setEnabled(true);
        try {
           conecta.rs.next();
           codigoEstado.setText(String.valueOf(conecta.rs.getInt("idestado")));
          nomeEstado.setText(conecta.rs.getString("nomeEstado"));
          sigla.setText(conecta.rs.getString("siglaEstado")); 
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro ao mostrar dados!\n Erro:"+ex);
       }
    }//GEN-LAST:event_proximoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
      
        try {
           PreparedStatement pst = conecta.con.prepareStatement("update estados set nomeEstado= ?, siglaEstado=? where idestado = ?");
           
           pst.setString(1, nomeEstado.getText());
           pst.setString(2, sigla.getText());
           pst.setInt(3, Integer.parseInt(codigoEstado.getText()));
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(this, "Alterado com sucesso");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Erro ao alterar!\n Erro:"+ex);
       }
    }//GEN-LAST:event_alterarActionPerformed
     public void preencherTabela(String SQL){
         ArrayList dados = new ArrayList();
         
         String[] colunas= new String[]{"ID", "NOME","SIGLA"};
         
      
         conecta.executeSQL(SQL);
       try {
           conecta.rs.first();
           do{
               
               dados.add(new Object[]{conecta.rs.getInt("idestado"),conecta.rs.getString("nomeEstado"), conecta.rs.getString("siglaEstado")});
           }while(conecta.rs.next());
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher o ArrayList!\n Erro:"+ex);
       }
       ModeloTabela modelo = new ModeloTabela (dados,colunas);     
       tableEstado.setModel(modelo);
       tableEstado.getColumnModel().getColumn(0).setPreferredWidth(80);
       tableEstado.getColumnModel().getColumn(0).setResizable(false);
       tableEstado.getColumnModel().getColumn(1).setPreferredWidth(80);
       tableEstado.getColumnModel().getColumn(1).setResizable(false);
       tableEstado.getColumnModel().getColumn(2).setPreferredWidth(80);
       tableEstado.getColumnModel().getColumn(2).setResizable(false);
       tableEstado.getTableHeader().setReorderingAllowed(false);
       tableEstado.setAutoResizeMode(tableEstado.AUTO_RESIZE_OFF);
       tableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton anterior;
    private javax.swing.JTextField codigoEstado;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeEstado;
    private javax.swing.JButton novo;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField sigla;
    private javax.swing.JTable tableEstado;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
     
    
    public void limparCampos(){
        sigla.setText("");
        nomeEstado.setText("");
    }


}
