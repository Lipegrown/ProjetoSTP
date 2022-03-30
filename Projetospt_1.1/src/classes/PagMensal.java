/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.util.Date;

public class PagMensal {
     private int id_pagMensal, horas_trabalhadas, id_funcioanrio;
     private double salario;
    private Date periodo;

    public PagMensal(int id_pagMensal, int horas_trabalhadas, int id_funcioanrio, double salario, Date periodo) {
        this.id_pagMensal = id_pagMensal;
        this.horas_trabalhadas = horas_trabalhadas;
        this.id_funcioanrio = id_funcioanrio;
        this.salario = salario;
        this.periodo = periodo;
    }

    public PagMensal(int horas_trabalhadas, int id_funcioanrio, double salario, Date periodo) {
        this.horas_trabalhadas = horas_trabalhadas;
        this.id_funcioanrio = id_funcioanrio;
        this.salario = salario;
        this.periodo = periodo;
    }

    

    public int getId_funcioanrio() {
        return id_funcioanrio;
    }

    public void setId_funcioanrio(int id_funcioanrio) {
        this.id_funcioanrio = id_funcioanrio;
    }
    
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    public PagMensal() {
    }

    @Override
    public String toString() {
        return "PagMensal{" + "id_pagMensal=" + id_pagMensal + ", horas_trabalhadas=" + horas_trabalhadas + ", periodo=" + periodo + '}';
    }
    
    

    public int getId_pagMensal() {
        return id_pagMensal;
    }

    public void setId_pagMensal(int id_pagMensal) {
        this.id_pagMensal = id_pagMensal;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }
    
  
}
  