/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo.bezerra
 */
public class VendasCanceladasEfetuadas {

    int tamanho = 10;
    private int[] idvenda = new int[tamanho];
    private String[] cpfcliente = new String[tamanho];
    private double[] valortotal = new double[tamanho];
    private String[] datavenda = new String[tamanho];
    private int[] quantidadeitens = new int[tamanho];
    private boolean[] statusvenda = new boolean[tamanho];

    public void VendasConcluidas(int contador, String cpfcliente, double valortotal, String datavenda, int quantidadeitens, boolean statusvenda) {

        this.cpfcliente[contador] = cpfcliente;
        this.valortotal[contador] = valortotal;
        this.datavenda[contador] = datavenda;
        this.quantidadeitens[contador] = quantidadeitens;
        this.statusvenda[contador] = statusvenda;

        
    }

}
