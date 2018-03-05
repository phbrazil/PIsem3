/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Model.Produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class CadastrarProduto {

    private static List<Produtos> listaProdutos = new ArrayList<Produtos>();

    public void inserirProduto(Produtos produtos) {
        listaProdutos.add(produtos);

    }

    public static Produtos obterProdutoLista(Integer codigobarras) {
        if (codigobarras != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getCodigobarras() == codigobarras) {
                    return listaProdutos.get(i);
                
                }
            }
        }
        return null;
    }
    
    public int TamanhoListaProduto(){
        return listaProdutos.size();
    }

}
