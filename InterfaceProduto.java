/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhoag3.TrabalhoAG3;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sabri
 */
public class InterfaceProduto extends javax.swing.JFrame {
    private EstoqueProduto listaProduto;
    private String modo;
    ArrayList<Produto> listProduto;
    /**
     * Creates new form InterfaceProduto
     */
    public InterfaceProduto(EstoqueProduto listaProduto) {
        initComponents();
        this.listaProduto=listaProduto;
        
        listProduto = new ArrayList();
        modo="Navegar";
        ManipularInterface();
    }
    public void LoadTableProduto(){
        DefaultTableModel modeloProduto = new DefaultTableModel(new Object [] {"Código","Nome", "Descrição","Quantidade", "Preço"},0);

            for(int i=0;i<listProduto.size();i++){
                Object linha []=new Object[]{listProduto.get(i).getCodigo(),listProduto.get(i).getNome(),listProduto.get(i).getDescricao(), listProduto.get(i).getQuantidade(), listProduto.get(i).getPreco()};
                modeloProduto.addRow(linha);
            }
            tblProduto.setModel(modeloProduto);
    }
    
    
    public void ManipularInterface(){
        switch(modo){
            case "Navegar":
                btnSalvarProduto.setEnabled(false);
                btnCancelarProduto.setEnabled(false);
                txtNome.setEnabled(false);
                txtDescricao.setEnabled(false);
                txtQuantidade.setEnabled(false);
                txtPreco.setEnabled(false);
                btnNovoProduto.setEnabled(true);
                btnEditarProduto.setEnabled(false);
                btnExcluirProduto.setEnabled(false);               
                break;
            case "Novo":
                btnSalvarProduto.setEnabled(true);
                btnCancelarProduto.setEnabled(true);
                txtNome.setEnabled(true);
                txtDescricao.setEnabled(true);
                txtQuantidade.setEnabled(true);
                txtPreco.setEnabled(true);
                btnNovoProduto.setEnabled(false);
                btnEditarProduto.setEnabled(false);
                btnExcluirProduto.setEnabled(false); 
                break;
            case "Editar":
                btnSalvarProduto.setEnabled(true);
                btnCancelarProduto.setEnabled(true);
                txtNome.setEnabled(true);
                txtDescricao.setEnabled(true);
                txtQuantidade.setEnabled(true);
                txtPreco.setEnabled(true);
                btnNovoProduto.setEnabled(false);
                btnEditarProduto.setEnabled(false);
                btnExcluirProduto.setEnabled(false); 
                break;
            case "Excluir":
                btnSalvarProduto.setEnabled(false);
                btnCancelarProduto.setEnabled(false);
                txtNome.setEnabled(false);
                txtDescricao.setEnabled(false);
                txtQuantidade.setEnabled(false);
                txtPreco.setEnabled(false);
                btnNovoProduto.setEnabled(true);
                btnEditarProduto.setEnabled(false);
                btnExcluirProduto.setEnabled(false);
                break;
            case "Selecao":
                btnSalvarProduto.setEnabled(false);
                btnCancelarProduto.setEnabled(false);
                txtNome.setEnabled(false);
                txtDescricao.setEnabled(false);
                txtQuantidade.setEnabled(false);
                txtPreco.setEnabled(false);
                btnNovoProduto.setEnabled(true);
                btnEditarProduto.setEnabled(true);
                btnExcluirProduto.setEnabled(true); 
                break;
        
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnNovoProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnCancelarProduto = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Produtos");

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição", "Quantidade", "Preço"
            }
        ));
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        btnNovoProduto.setText("Novo");
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar")));

        nome.setText("Nome: ");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Quantidade: ");

        jLabel5.setText("Preço:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnSalvarProduto.setText("Salvar ");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnSalvarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarProduto)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProduto)
                    .addComponent(btnSalvarProduto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovoProduto)
                                .addGap(204, 204, 204)
                                .addComponent(btnEditarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirProduto))
                            .addComponent(jScrollPane2))
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto)
                    .addComponent(btnEditarProduto)
                    .addComponent(btnExcluirProduto))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Produto", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
        modo="Editar";
        ManipularInterface();
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
        int index = tblProduto.getSelectedRow();
        
        if (index>=0 && index<listProduto.size()){
            listProduto.remove(index);
        }
        LoadTableProduto();
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtPreco.setText("");
        modo="Novo";
        ManipularInterface();
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtPreco.setText("");
        modo="Navegar";
        ManipularInterface();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        // TODO add your handling code here:
        if(modo.equals("Novo")){
            
            Produto p = new Produto();
            
            String nome =txtNome.getText();
            String descricao = txtDescricao.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            double preco = Double.valueOf(txtPreco.getText()).doubleValue();
            
            p.setNome(nome);
            p.setDescricao(descricao);
            //do{
                try {
                    p.setQuantidade(quantidade);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            //}while(quantidade==0);
            p.setPreco(preco);
            
            //listaProduto.add(p);
            listProduto.add(p);
                
            JOptionPane.showMessageDialog(null, "Produto adicionado!");         
                
        }else if(modo.equals("Editar")){
            int index = tblProduto.getSelectedRow();
            
            listProduto.get(index).setNome(txtNome.getText());
            listProduto.get(index).setDescricao(txtDescricao.getText());
            try {
                listProduto.get(index).setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());            }
            listProduto.get(index).setPreco(Double.valueOf(txtPreco.getText()).doubleValue());
        
            JOptionPane.showMessageDialog(null, "Produto modificado!");         
                
        }
        LoadTableProduto();
        
        modo="Navegar";
        ManipularInterface();
        txtNome.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtPreco.setText("");
        
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        // TODO add your handling code here:
        int index = tblProduto.getSelectedRow();
        
        if (index>=0 && index<listProduto.size()){
            Produto p =  listProduto.get(index);
            
            txtNome.setText(p.getNome());
            txtDescricao.setText(String.valueOf(p.getDescricao()));
            txtQuantidade.setText(String.valueOf(p.getQuantidade()));
            txtPreco.setText(String.valueOf(p.getPreco()));
            
            modo="Selecao";
            ManipularInterface();
        }
    }//GEN-LAST:event_tblProdutoMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfaceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nome;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
