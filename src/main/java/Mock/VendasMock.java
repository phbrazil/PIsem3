/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Model.Clientes;
import Model.Vendas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author killuminatti08
 */
public class VendasMock {
    
    private static List<Vendas> listaVendas = new ArrayList<Vendas>();

    public void inserirVenda(Vendas vendas) {
        listaVendas.add(vendas);

    }
    
     public static Vendas ExportarVendas(int contador) {
        for (int i = 0; i < listaVendas.size(); i++) {
            if (listaVendas.get(i) != null) {
                return listaVendas.get(i);

            }

        }
        return null;

    }
     public int TamanhoListaVendas(){
        return listaVendas.size();
    }
    
    
    
}
