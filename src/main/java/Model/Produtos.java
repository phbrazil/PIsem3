/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author killuminatti08
 */
public class Produtos {
    
    private int codigobarras;
    private String nomeproduto;
    private double valor ;
    private double valordesconto;
    private String FaixaEtaria;
    private String Fabricante;
    private String PrazoGarantia;
    private int Quantidade;
    private int idproduto;
    
    
    public Integer getCodigobarras() {
        return codigobarras;
    }
    
    public void setCodigobarras(Integer codigobarras) {
        this.codigobarras = codigobarras;
    }
    
    public String getNomeProduto(){
        return nomeproduto;
    }
    
    public void setNomeProduto(String nomeproduto){
        this.nomeproduto = nomeproduto;
    }
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValorDesconto(){
        return valordesconto;
    }
    
    public void setValorDesconto(double valordesconto){
        
        this.valordesconto = valor*0.2;
    }
    public String getFaixaEtaria(){
        return FaixaEtaria;
    }
    public void setFaixaEtaria(String faixaetaria){
        this.FaixaEtaria = faixaetaria;
        
    }
    public String getFabricante(){
        return Fabricante;
    }
    public void setFabricante(String fabricante){
        this.Fabricante = fabricante;
    }
    
    public String getGarantia(){
        return PrazoGarantia;
    }
    public void setGarantia(String prazogarantia){
        this.PrazoGarantia = prazogarantia;
    }
    
    public Integer getQuantidade(){
        return Quantidade;
    }
    
    public void setQuantidade(Integer quantidade){
        this.Quantidade = quantidade;
    }
    public Integer getIdProduto(){
        return idproduto;
    }
    
    public void setIdProduto(Integer idproduto){
        this.idproduto = idproduto;
    }
    
    
}
