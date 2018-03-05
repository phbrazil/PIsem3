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
public class Clientes {

    private int clienteid;
    private String nome;
    private String logradouro;
    private String RG;
    private String CPF;
    private String numero;
    private String cidade;
    private String estado;
    private String UF;
    private String cep;
    private String telefone;
    private String celular;
    private String email;
    private String sexo;
    private String estadocivil;
    private String nascimento;

    public Integer getClienteid() {

        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getLogradouro() {
        return logradouro;

    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;

    }

    public String getRG() {
        return RG;

    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;

    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumero() {
        return numero;

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String Cep) {
        this.cep = Cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadocivil;
    }

    public void setEstadoCivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

}
