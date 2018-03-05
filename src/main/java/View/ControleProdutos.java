package View;

import DAO.Produtos.NovoProduto;
import Model.Produtos;
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
public class ControleProdutos extends javax.swing.JFrame {

    private int contador = 1;

    /**
     * Creates new form ControleEstoque
     */
    public ControleProdutos() {
        initComponents();
        jSpinnerQuantidadeProd.setValue(1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JFabricante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboFaixa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboGarantia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerQuantidadeProd = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        JCodigoBarras = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedValorProduto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 340, 130, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Estoque");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(265, 11, 212, 45);
        getContentPane().add(JNomeProduto);
        JNomeProduto.setBounds(30, 170, 260, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Nome do Produto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 121, 23);
        getContentPane().add(JFabricante);
        JFabricante.setBounds(320, 170, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fabricante");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 140, 160, 20);

        jComboFaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 à 12 meses", "1 à 2 anos", "3 à 4 anos", "5 à 6 anos", "7 à 8 anos", "9 à 10 anos", "11 anos ou mais" }));
        getContentPane().add(jComboFaixa);
        jComboFaixa.setBounds(550, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Faixa etária");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 140, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Prazo de Garantia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 150, 30);

        jComboGarantia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 meses", "6 meses", "1 ano"}));
        getContentPane().add(jComboGarantia);
        jComboGarantia.setBounds(30, 250, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Valor");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 220, 110, 20);
        getContentPane().add(jSpinnerQuantidadeProd);
        jSpinnerQuantidadeProd.setBounds(570, 250, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(570, 220, 90, 20);
        getContentPane().add(JCodigoBarras);
        JCodigoBarras.setBounds(30, 80, 680, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Código de Barras");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 50, 250, 20);

        jFormattedValorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(jFormattedValorProduto);
        jFormattedValorProduto.setBounds(330, 250, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // InsertBancoMySQL novoproduto = new InsertBancoMySQL();

        Model.Produtos produtos = new Produtos();

        DAO.Produtos.NovoProduto cadastrarproduto = new NovoProduto();

        String nomeproduto = "", faixaetaria = "", fabricante = "", prazogarantia = "";
        int quantidade = 0;
        int codigobarras = 0;

        double valor = 0;

        boolean tudook = false;

        //TENTA PEGAR OS DADOS DO NOVO PRODUTO
        do {
            try {
                produtos.setCodigobarras(Integer.valueOf(JCodigoBarras.getText()));
                produtos.setNomeProduto(String.valueOf(JNomeProduto.getText()));

                produtos.setFabricante(String.valueOf(JFabricante.getText()));
                produtos.setFaixaEtaria(String.valueOf(jComboFaixa.getSelectedItem()));
                produtos.setGarantia(String.valueOf(jComboGarantia.getSelectedItem()));
                //VALOR TEM UM REPLACE CASO O USER INSIRA VIRGULA EM VEZ DE PONTO
                produtos.setValor(Double.valueOf(jFormattedValorProduto.getText().replace(",", ".")));
                produtos.setQuantidade((Integer) jSpinnerQuantidadeProd.getValue());
                produtos.setValorDesconto(Double.valueOf(jFormattedValorProduto.getText().replace(",", ".")));
                tudook = true;

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Verifique os dados inseridos");
                break;
            }
        } while (tudook == false);

        //SE O NOME DO PRODUTO FOR INVALIDO
        if (JNomeProduto.getText().length() <= 3) {
            JOptionPane.showMessageDialog(null, "Nome do produto muito curto");

            //SE O NOME DO FABRINCANTE FOR INVALIDO
        } else if (JFabricante.getText().length() <= 1) {

            JOptionPane.showMessageDialog(null, "Nome de Fabricante muito curto");

            //O ELSE GRAVA UM NOVO PRODUTO
        } else if (tudook == true) {

            cadastrarproduto.InsertNovoProduto(produtos);

            JNomeProduto.setText("");
            JFabricante.setText("");
            jFormattedValorProduto.setText("");
            jSpinnerQuantidadeProd.setValue(1);
            JCodigoBarras.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JCodigoBarras;
    private javax.swing.JTextField JFabricante;
    private javax.swing.JTextField JNomeProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboFaixa;
    private javax.swing.JComboBox<String> jComboGarantia;
    private javax.swing.JFormattedTextField jFormattedValorProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinnerQuantidadeProd;
    // End of variables declaration//GEN-END:variables
}
