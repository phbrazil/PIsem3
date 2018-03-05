package Service;


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
public class ValidaCPF {

    public boolean CPFValido(Long CPF) {

        boolean cpfvalido = false;

        int digito11, digito10, digito9, digito8, digito7, digito6, digito5, digito4, digito3, digito2, digito1;

        digito1 = Integer.parseInt(Long.toString(CPF).substring(0, 1));
        digito2 = Integer.parseInt(Long.toString(CPF).substring(1, 2));
        digito3 = Integer.parseInt(Long.toString(CPF).substring(2, 3));
        digito4 = Integer.parseInt(Long.toString(CPF).substring(3, 4));
        digito5 = Integer.parseInt(Long.toString(CPF).substring(4, 5));
        digito6 = Integer.parseInt(Long.toString(CPF).substring(5, 6));
        digito7 = Integer.parseInt(Long.toString(CPF).substring(6, 7));
        digito8 = Integer.parseInt(Long.toString(CPF).substring(7, 8));
        digito9 = Integer.parseInt(Long.toString(CPF).substring(8, 9));
        digito10 = Integer.parseInt(Long.toString(CPF).substring(9, 10));
        digito11 = Integer.parseInt(Long.toString(CPF).substring(10, 11));

        System.out.println(digito1 + "" + digito2 + "" + digito3 + "." + digito4 + digito5 + digito6 + "." + digito7 + digito8 + digito9 + "-" + digito10 + digito11);

        //PASSO 1
        int multiplo1 = (digito1 * 10);
        int multiplo2 = (digito2 * 9);
        int multiplo3 = (digito3 * 8);
        int multiplo4 = (digito4 * 7);
        int multiplo5 = (digito5 * 6);
        int multiplo6 = (digito6 * 5);
        int multiplo7 = (digito7 * 4);
        int multiplo8 = (digito8 * 3);
        int multiplo9 = (digito9 * 2);

        //PASSO 2
        int soma = (multiplo1 + multiplo2 + multiplo3 + multiplo4 + multiplo5 + multiplo6 + multiplo7 + multiplo8 + multiplo9);

        //PASSO 3
        int resto = soma % 11;

        //PASSO 4
        int restomenos11 = (11 - resto);

        //PASSO 5
        if (restomenos11 < 10 && restomenos11 == digito10 || restomenos11 > 10 && restomenos11 == 0) {

            //PASSO 6 SE 5 FOR TRUE
            int passo6multiplo1 = (digito1 * 11);
            int passo6multiplo2 = (digito2 * 10);
            int passo6multiplo3 = (digito3 * 9);
            int passo6multiplo4 = (digito4 * 8);
            int passo6multiplo5 = (digito5 * 7);
            int passo6multiplo6 = (digito6 * 6);
            int passo6multiplo7 = (digito7 * 5);
            int passo6multiplo8 = (digito8 * 4);
            int passo6multiplo9 = (digito9 * 3);
            int passo6multiplo10 = (digito10 * 2);

            //PASSO 7
            int somapasso6 = (passo6multiplo1 + passo6multiplo2 + passo6multiplo3 + passo6multiplo4 + passo6multiplo5 + passo6multiplo6 + passo6multiplo7 + passo6multiplo8 + passo6multiplo9 + passo6multiplo10);

            //PASSO 8
            int restopasso6 = (somapasso6 % 11);

            //PASSO 9 
            int restopasso6menos11 = (11 - restopasso6);

            //PASSO 10
            if (restopasso6menos11 < 10 && restopasso6menos11 == digito11 || restopasso6menos11 == 0) {

                System.out.println("CPF VÁLIDO");
                cpfvalido = true;
            } else {

                cpfvalido = false;

            }

        } else {
        }

        return cpfvalido;
    }

}
