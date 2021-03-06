package br.senac.sp.View;

import br.senac.sp.DAO.Produtos.Alterar;
import br.senac.sp.Model.Produtos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.bezerra
 */
public class AlterarProdutoTela extends javax.swing.JFrame {

    private int contador = 1;

    /**
     * Creates new form ControleEstoque
     */
    public AlterarProdutoTela() {
        initComponents();

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
        jLabel8 = new javax.swing.JLabel();
        JCodigoBarrasAlterar = new javax.swing.JTextField();
        JPesquisarProduto = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        JNomeProdutoAlterar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JPrecoCompra = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        JPrecoVenda = new javax.swing.JFormattedTextField();
        GravarAltProd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerQuantidadeProdAlterar = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 40, 212, 45);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Código de Barras");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 102, 250, 20);
        getContentPane().add(JCodigoBarrasAlterar);
        JCodigoBarrasAlterar.setBounds(150, 128, 375, 30);

        JPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa_icon.png"))); // NOI18N
        JPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPesquisarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(JPesquisarProduto);
        JPesquisarProduto.setBounds(537, 128, 41, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Nome do Produto ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 164, 121, 23);
        getContentPane().add(JNomeProdutoAlterar);
        JNomeProdutoAlterar.setBounds(150, 190, 375, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Descricao");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 235, 160, 14);
        getContentPane().add(JDescricao);
        JDescricao.setBounds(150, 255, 375, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Preço Compra");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 303, 110, 14);

        JPrecoCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(JPrecoCompra);
        JPrecoCompra.setBounds(150, 332, 81, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Preço Venda");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(272, 303, 110, 14);

        JPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(JPrecoVenda);
        JPrecoVenda.setBounds(266, 332, 81, 30);

        GravarAltProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GravarAltProd.setText("Gravar");
        GravarAltProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarAltProdActionPerformed(evt);
            }
        });
        getContentPane().add(GravarAltProd);
        GravarAltProd.setBounds(301, 405, 130, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 303, 90, 14);
        getContentPane().add(jSpinnerQuantidadeProdAlterar);
        jSpinnerQuantidadeProdAlterar.setBounds(440, 323, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPesquisarProdutoActionPerformed

        
        br.senac.sp.DAO.Produtos.Alterar alterarproduto = new Alterar();
        br.senac.sp.Model.Produtos produtos = new Produtos();

        boolean tudook = false;

        do {
            try {

                produtos = alterarproduto.PesquisarProduto(Integer.valueOf(JCodigoBarrasAlterar.getText()));
                tudook = true;
                if (produtos.getNomeProduto() == null) {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado");
                } else {
                    JCodigoBarrasAlterar.setEditable(false);
                    JNomeProdutoAlterar.setText(String.valueOf(produtos.getNomeProduto()));
                    JDescricao.setText(String.valueOf(produtos.getDescricao()));
                    JPrecoVenda.setText(String.valueOf(produtos.getPrecoVenda()));
                    JPrecoCompra.setText(String.valueOf(produtos.getPrecoCompra()));
                    jSpinnerQuantidadeProdAlterar.setValue(Integer.valueOf(produtos.getQuantidade()));

                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira o código de barras");
                break;
            }
        } while (tudook == false);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_JPesquisarProdutoActionPerformed

    private void GravarAltProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarAltProdActionPerformed

        br.senac.sp.Model.Produtos produtos = new Produtos();

        br.senac.sp.DAO.Produtos.Alterar updateprod = new Alterar();

        produtos.setCodigobarras(Integer.valueOf(JCodigoBarrasAlterar.getText()));
        produtos.setNomeProduto(String.valueOf(JNomeProdutoAlterar.getText()));
        produtos.setDescricao(String.valueOf(JDescricao.getText()));
        produtos.setPrecoCompra(Double.valueOf(JPrecoCompra.getText().replace(",", ".")));
        produtos.setPrecoVenda(Double.valueOf(JPrecoVenda.getText().replace(",", ".")));
        produtos.setQuantidade((Integer) jSpinnerQuantidadeProdAlterar.getValue());
        
        updateprod.AtualizarProduto(produtos);
        JOptionPane.showMessageDialog(null, "Produto " + produtos.getNomeProduto() + " alterado!");

        JCodigoBarrasAlterar.setText("");
        JCodigoBarrasAlterar.setEditable(true);
        JNomeProdutoAlterar.setText("");
        JDescricao.setText("");
        jSpinnerQuantidadeProdAlterar.setValue(1);
        JPrecoVenda.setText("");
        JPrecoCompra.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_GravarAltProdActionPerformed
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GravarAltProd;
    public javax.swing.JTextField JCodigoBarrasAlterar;
    public javax.swing.JTextField JDescricao;
    public javax.swing.JTextField JNomeProdutoAlterar;
    private javax.swing.JToggleButton JPesquisarProduto;
    public javax.swing.JFormattedTextField JPrecoCompra;
    public javax.swing.JFormattedTextField JPrecoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JSpinner jSpinnerQuantidadeProdAlterar;
    // End of variables declaration//GEN-END:variables
}
