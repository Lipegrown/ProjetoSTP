
package classes;

import java.util.Date;

public class Funcionarios {
   private String nome, cpf,rg,status,genero;
    private double valorHora;
    private int id;
    private Date data_nascimento;

    public Funcionarios( int id, String nome,String genero ,Date data_nascimento, String status,String cpf, String rg,  double valorHora ) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.status = status;
        this.genero = genero;
        this.valorHora = valorHora;
        this.id = id;
        this.data_nascimento = data_nascimento;
    }

    public Funcionarios(String nome,String genero ,Date data_nascimento, String status,String cpf, String rg,  double valorHora ) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.status = status;
        this.genero = genero;
        this.valorHora = valorHora;
        this.data_nascimento = data_nascimento;
    }
    
    

    public Funcionarios() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return id + "- " +nome;
    }

 

    
    
    
 
    
    
}
