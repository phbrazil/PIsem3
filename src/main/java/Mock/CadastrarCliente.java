/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Model.Clientes;
import Model.Produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class CadastrarCliente {

    private static List<Clientes> listaClientes = new ArrayList<Clientes>();

    public void inserirCliente(Clientes clientes) {
        listaClientes.add(clientes);

    }

    public static Clientes obterClienteLista(String CPF) {
        if (CPF != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getCPF().equals(CPF)) {
                    return listaClientes.get(i);
                }
            }
        }
        return null;
    }

    public static Clientes ExportarClientes(int contador) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i) != null) {
                return listaClientes.get(i);

            }

        }
        return null;

    }

    public int TamanhoListaCliente() {
        return listaClientes.size();
    }

}
