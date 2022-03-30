package DAO;

import classes.Funcionarios;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




public class ServicoBancoFuncionario {
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

private final Conection conexao = new Conection();
	
	public void insert(Funcionarios funcionario) throws SQLException{
		 
		try(PreparedStatement pst = conexao.getConexao().prepareStatement(
				"insert into funcionario (id_funcionario, nome, data_nascimento, status_funcionario, genero, cpf, valor_Hora)" + 
		"values (0,?,?,?,?,?,?,?)")){
			
                        
			pst.setString(1, funcionario.getNome());
                        pst.setString(2, formato.format(funcionario.getData_nascimento()));
                        pst.setString(3, funcionario.getStatus());
                        pst.setString(4, funcionario.getGenero());
			pst.setString(5, funcionario.getCpf());
			pst.setString(6, funcionario.getRg());
			pst.setDouble(7, funcionario.getValorHora());
			
			pst.executeUpdate();
		}
		conexao.close();
		
		this.setIdBancoFuncionario(funcionario);
	}
	
	public void update(Funcionarios funcionario)throws SQLException {
		 
		try(PreparedStatement pst = conexao.getConexao().prepareStatement(
				"update funcionario set id_funcionario = ?, nome = ?, data_nascimento = ?, status_funcionario = ?, genero = ?, cpf = ?, rg = ?, valor_Hora = ? where (id_funcionario = ?)")){
			pst.setInt(1, funcionario.getId());
			pst.setString(2, funcionario.getNome());
                        pst.setString(3, formato.format(funcionario.getData_nascimento()));
                        pst.setString(4, funcionario.getStatus());
                        pst.setString(5, funcionario.getGenero());
			pst.setString(6, funcionario.getCpf());
			pst.setString(7, funcionario.getRg());
			pst.setDouble(8, funcionario.getValorHora());
                        pst.setInt(9, funcionario.getId());
			
			pst.executeUpdate();
		}
		conexao.close();
	}
        
        
        
     
	
	public void delete (Funcionarios funcionario) throws SQLException{
		try(PreparedStatement pst = conexao.getConexao().prepareStatement(
				"delete from funcionario where (id_funcionario = ?)")){
			pst.setInt(1, funcionario.getId());
			pst.executeUpdate();
		}
		conexao.close();
	}
	
	public void setIdBancoFuncionario(Funcionarios funcionario)throws SQLException{
		Statement st = conexao.getConexao().createStatement();
		
		ResultSet rs = st.executeQuery("select las_insert_id() id_funcionario");
		
		while(rs.next()) {
			funcionario.setId(rs.getInt("id_funcionario"));
		}
		conexao.close();
	}
	
	public Funcionarios getCadastroById(int id)throws SQLException{
		try(Statement st = conexao.getConexao().createStatement();
				ResultSet rs = st.executeQuery("select * from cadastro where (id_funcionario = " + id + ")")){
			rs.first();
                        
                           return new Funcionarios((rs.getInt("id_funcionario")),
                                                    rs.getString("nome"),
                                                    rs.getString("genero"),
                                                    rs.getDate("data_nascimento"),
                                                    rs.getString("status_funcionario"),
                                                    rs.getString("rg"),
                                                    rs.getString("cpf"),
                                                    rs.getDouble("valor_Hora"));  
                                
					            
		}
	}
        
        
        public ArrayList getFuncionariobyQuery()throws SQLException{
            ArrayList dados = new ArrayList();
            try(Statement st = conexao.getConexao().createStatement();
                    ResultSet rs = st.executeQuery("select * from pagMensal order by id_fk_funcionario")){
                
                while (rs.next()){
          dados.add(new String [] { rs.getString(1),  
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5) 
                                   }); 
        }
            
            }
            
            
            return dados;
        
        }
        
        
        public ArrayList getPagMensalbyQuery()throws SQLException{
            ArrayList dados = new ArrayList();
            try(Statement st = conexao.getConexao().createStatement();
                    ResultSet rs = st.executeQuery("SELECT F.nome, F.cpf, P.salario, P.periodo FROM funcionario F, pagMensal P where id_fk_funcionario = id_funcionario;")){
                
                while (rs.next()){
          dados.add(new String [] { rs.getString(1),  
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4)
                                   }); 
        }
            
            }
            
            
            return dados;
         }
        
        
        public ArrayList getBuscarFuncionario(String a)throws SQLException{
                   ArrayList dados = new ArrayList();
        
            try(Statement st = conexao.getConexao().createStatement();
                     ResultSet rs = st.executeQuery("select * from funcionario  where nome =  \'"  + a + "\'"   )){
                
                while (rs.next()){
          dados.add(new String [] { rs.getString(1),  
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getString(6) 
                                   }); 
        }
            
            }
            
            
            return dados;
        }
        
        
         public ArrayList<Funcionarios> getFuncionarioByLista()throws SQLException{
      ArrayList<Funcionarios> lista = new ArrayList<>();
     try (Statement st = conexao.getConexao().createStatement(); 
            ResultSet rs = st.executeQuery
             ("select * from funcionario order by id_funcionario ")) {
         
        while (rs.next()){
          lista.add(new Funcionarios((rs.getInt("id_funcionario")),
                                                    rs.getString("nome"),
                                                    rs.getString("genero"),
                                                    rs.getDate("data_nascimento"),
                                                    rs.getString("status_funcionario"),
                                                    rs.getString("rg"),
                                                    rs.getString("cpf"),
                                                    rs.getDouble("valor_Hora")));   
        }
    }
    
     return lista;
 }
	
	
}
