/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Funcionarios;
import classes.PagMensal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class ServicoBancoPagMensal {
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

private final Conection conexao = new Conection();
	
	public void insert(PagMensal pagamento) throws SQLException{
		 
		try(PreparedStatement pst = conexao.getConexao().prepareStatement(
				"insert into pagMensal (id_pagMensal, id_fk_funcionario, salario, periodo)" + 
		"values (0,?,?,?)")){
			
                        
			pst.setInt(1, pagamento.getId_funcioanrio());
                        pst.setDouble(2, pagamento.getSalario());
                        pst.setDate(3, new java.sql.Date(pagamento.getPeriodo().getTime()));
                        
			
			pst.executeUpdate();
		}
		conexao.close();
		
		this.setIdBancoPagMensal(pagamento);
	}
        
        
        
        
        public void setIdBancoPagMensal(PagMensal pagamento)throws SQLException{
		Statement st = conexao.getConexao().createStatement();
		
		ResultSet rs = st.executeQuery("select las_insert_id() id_pagMensal");
		
		while(rs.next()) {
			pagamento.setId_pagMensal(rs.getInt("id_pagMensal"));
		}
		conexao.close();
	}
        
        public void update(PagMensal pagamento)throws SQLException {
		 
		try(PreparedStatement pst = conexao.getConexao().prepareStatement(
				"update pagMensal set id_pagMensal = ?, id_fk_funcionario = ?, salario = ?, periodo = ? where (id_pagMensal = ?)")){
			
                        pst.setInt(1, pagamento.getId_pagMensal());
                        pst.setInt(2, pagamento.getId_funcioanrio());
                        pst.setDouble(3, pagamento.getSalario());
                        pst.setDate(4, new java.sql.Date(pagamento.getPeriodo().getTime()));
                        pst.setInt(5, pagamento.getId_pagMensal());
                        
			
			pst.executeUpdate();
		}
		conexao.close();
	}
	
    
}
