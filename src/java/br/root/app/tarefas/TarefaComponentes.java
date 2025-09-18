package br.root.app.tarefas;

import br.jasap.core.AppManager;
import java.util.List;

public class TarefaComponentes {
    
    public AppManager manager;
    
    public TarefaComponentes() {
    }
    
    public TarefaComponentes(AppManager manager) {
        this.manager = manager;
    }
  
    public String listaTarefas() throws Exception {
        TarefaDAO tarefaDao = new TarefaDAO(manager);
        StringBuilder aux = new StringBuilder();
        
        aux.append( tarefasGuias() );
        
        List<TarefaBean> lista = tarefaDao.listarTarefas(true);
        
        for (TarefaBean tarefa : lista) {

            aux.append("          <!-- TAREFA ATIVA -->\n");
            aux.append("          <div class=\"task "+ tarefa.getPrioridade() +"\">\n");
            aux.append("            <div class=\"task-content\">\n");
            aux.append("              <div class=\"task-title\">\n");
            aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">" + tarefa.getTitulo() + "</a>\n");
            aux.append("              </div>\n");
            aux.append("              <div class=\"task-meta\">\n");
            aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">\n");
            aux.append("                  <span><i class=\"fas fa-layer-group\"></i>0 subtarefas</span>\n");
            aux.append("                </a>\n");
            aux.append("                <span><i class=\"fas fa-calendar-alt\"></i>" + tarefa.getData_criacao() + "</span>\n");
            aux.append("                <span><i class=\"fas fa-user-alt\"></i>" + tarefa.getResponsavel() + "</span>\n");
            aux.append("              </div>\n");
            aux.append("              <span class=\"descricao\">" + tarefa.getDescricao() + "</span>\n");
            aux.append("            </div>\n\n");

            aux.append("            <div class=\"task-actions\">\n");
            aux.append("              <div>\n");
            aux.append("                <label class=\"checkbox-container\">\n");
            aux.append("                  <div class=\"usuario_concluir\">\n");
            aux.append("                    <div class=\"assigned\"><strong>" + tarefa.getData_conclusao() + "</strong></div>\n");
            aux.append("                    <form action=\"#\" method=\"get\" style=\"display:inline;\">\n");
            aux.append("                      <input type=\"hidden\" name=\"estado_atual\" value=\"true\">\n");
            aux.append("                      <input type=\"hidden\" name=\"ativa\" value=\"0\">\n");
            aux.append("                      <input type=\"hidden\" name=\"id_tarefa\" value=\"118\">\n");
            aux.append("                      <input type=\"checkbox\" name=\"ativo\">\n");
            aux.append("                    </form>\n");
            aux.append("                  </div>\n");
            aux.append("                </label>\n");
            aux.append("              </div>\n");
            aux.append("              <a href=\"#\" class=\"deletar-link\">\n");
            aux.append("                <i class=\"fas fa-trash\"></i>\n");
            aux.append("              </a>\n");
            aux.append("            </div>\n");
            aux.append("          </div>\n\n");
            
       }
        
        aux.append( tarefasPaginacao() );

        return aux.toString();
    }
    
    //cria os botões da pagina
    public static String botoesAcion(){
        StringBuilder aux = new StringBuilder();

        aux.append("<button class=\"btn-add\" onclick=\"window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'\">\n");
        aux.append("    Nova Tarefa\n");
        aux.append("</button>\n");

        return aux.toString();
    }
    
    
    //cria as guias da pagina
    public static String tarefasGuias(){
        StringBuilder aux = new StringBuilder();
    
        aux.append("<div class=\"content\" id=\"pageContent\">\n");
        aux.append("  <div class=\"task-list\">\n");
        aux.append("    <div class=\"tabs\">\n\n");

        aux.append("      <input type=\"radio\" name=\"tabs\" id=\"tab-inativas\">\n");
        aux.append("      <input type=\"radio\" name=\"tabs\" id=\"tab-ativas\" checked>\n\n");

        aux.append("      <div class=\"tabs\">\n");
        aux.append("        <label class=\"<%= check_ativa %>\"\n");
        aux.append("          onclick=\"window.location.href='<%-- url(TarefasActions.ListarAtivas.class) --%>'\">\n");
        aux.append("          Ativas\n");
        aux.append("        </label>\n\n");

        aux.append("        <label class=\"<%= check_inativa %>\"\n");
        aux.append("          onclick=\"window.location.href='<%-- url(TarefasActions.ListarInativas.class) --%>'\">\n");
        aux.append("          Inativas\n");
        aux.append("        </label>\n");
        aux.append("      </div>\n\n");

        aux.append("      <div class=\"tab-content content-ativas\">\n");
        aux.append("        <div class=\"task-list\">\n\n");
        
        return aux.toString();
    }
    
    //cria a paginacao da pagina
    public static String tarefasPaginacao(){
        StringBuilder aux = new StringBuilder();
    
        aux.append("        </div>\n");
        aux.append("      </div>\n\n");

        aux.append("    </div>\n");
        aux.append("  </div>\n");
        aux.append("</div>\n");
        
        return aux.toString();
    }
    
    
    
    
}