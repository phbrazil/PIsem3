package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo.hbezerra
 */
public class CarrinhoProdutos {

    public class Carrinho {

        //Atributos
        private Integer id;
        private Long numero;
        private Long andar;
        private String tipo;

        //Métodos de acesso
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Long getNumero() {
            return numero;
        }

        public void setNumero(Long numero) {
            this.numero = numero;
        }

        public Long getAndar() {
            return andar;
        }

        public void setAndar(Long andar) {
            this.andar = andar;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

}
