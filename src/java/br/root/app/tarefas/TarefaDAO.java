package br.root.app.tarefas;

import br.jasap.core.AppManager;
import br.jasap.dao.JasapDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO extends JasapDAO {
    
    public TarefaDAO() {
    }
    
    public TarefaDAO(AppManager manager) {
        this.manager = manager;
    }
    
    public List<TarefaBean> listarTarefas(boolean ativoOuInativo) {
        
        List<TarefaBean> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefas  WHERE ativo = ? ORDER BY id_tarefa";
        
        try (PreparedStatement ps = getDataBase().getConn().prepareStatement(sql.toString())) {
            ps.setBoolean(1, ativoOuInativo);
            try (ResultSet resultado = ps.executeQuery()) {
                while (resultado.next()) {
                    TarefaBean tarefa = new TarefaBean();
                    
                    tarefa.setId_tarefa(resultado.getInt("id_tarefa"));
                    tarefa.setTitulo(resultado.getString("titulo"));
                    tarefa.setDescricao(resultado.getString("descricao"));
                    tarefa.setStatus(resultado.getString("status"));
                    tarefa.setPrioridade(resultado.getString("prioridade"));
                    tarefa.setResponsavel(resultado.getString("responsavel"));
                    tarefa.setData_criacao(resultado.getDate("data_criacao"));
                    tarefa.setData_conclusao(resultado.getDate("data_conclusao"));
                    tarefa.setAtivo(resultado.getBoolean("ativo"));
                                        
                    lista.add(tarefa);
                }
            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
        return lista;
    }
    
    public void adicionarTarefa(TarefaBean tarefa) {

        String sql = "INSERT INTO tarefas (titulo, descricao, status, prioridade, responsavel, data_conclusao) " +
                     "VALUES (?, ?, ?, ?, ?, ?) RETURNING id_tarefa;";

        try (PreparedStatement ps = getDataBase().getConn().prepareStatement(sql.toString())) {

            ps.setString(1, tarefa.getTitulo());
            ps.setString(2, tarefa.getDescricao());
            ps.setString(3, tarefa.getStatus());
            ps.setString(4, tarefa.getPrioridade());
            ps.setString(5, tarefa.getResponsavel());
            ps.setDate(6, tarefa.getData_conclusao());

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    tarefa.setId_tarefa(rs.getInt("id_tarefa"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluirTarefa(Integer id_tarefa) {

        String sql = ("DELETE FROM tarefas WHERE id_tarefa = ?");
        
        try (PreparedStatement ps = getDataBase().getConn().prepareStatement(sql.toString())) {
            
            ps.setInt(1, id_tarefa);
            
            ps.executeUpdate();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
}
