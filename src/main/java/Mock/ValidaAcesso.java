/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class ValidaAcesso {

    public boolean ValidaAcesso(String Username, String password) {

        boolean acesso = false;

        if (Username.equals("Paulo.Bezerra") || Username.equals("Lucas.Medeiros") || Username.equals("Pedro.Paulo")|| Username.equals("Andre.Pereira") && password.equals("mortadela1") ||
                Username.equals("professor") && password.equals("professor")) {

            acesso = true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
        }

        return acesso;

    }

}
