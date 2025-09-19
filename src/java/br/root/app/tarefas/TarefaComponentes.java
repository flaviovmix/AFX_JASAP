package br.root.app.tarefas;

import br.jasap.core.AppManager;
import static br.jasap.core.AppManager.url;
import br.jasap.util.Link;
import java.util.List;

public class TarefaComponentes {
    
    public static Link link(Class action) throws Exception{
        return new Link(url(action));
    }
    
    public AppManager manager;
    
    public TarefaComponentes() {
    }
    
    public TarefaComponentes(AppManager manager) {
        this.manager = manager;
    }    
    
    public String TarefasIndividuais(boolean ativoOuInativo) throws Exception {
        StringBuilder aux = new StringBuilder();

        String AtivoInativo = ativoOuInativo ? "" : "opaco";
        String checked = ativoOuInativo ? "" : "checked";
        
        TarefaDAO tarefaDao = new TarefaDAO(manager);
        List<TarefaBean> lista = tarefaDao.listarTarefas(ativoOuInativo);
        for (TarefaBean tarefa : lista) {

            aux.append("          <div class=\"task "+ tarefa.getPrioridade() +"\">\n");
            aux.append("            <div class=\"task-content\">\n");
            aux.append("              <div class=\"task-title\">\n");
            aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo " + AtivoInativo + " \" >" + tarefa.getTitulo() + "</a>\n");
            aux.append("              </div>\n");
            aux.append("              <div class=\"task-meta\">\n");
            aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo " + AtivoInativo + " \">\n");
            aux.append("                  <span class=\""  + AtivoInativo +  "\" ><i class=\"fas fa-layer-group \"></i>0 subtarefas</span>\n");
            aux.append("                </a>\n");
            aux.append("                <span class=\"" + AtivoInativo + "\" ><i class=\"fas fa-calendar-alt\"></i>" + tarefa.getData_criacao() + "</span>\n");
            aux.append("                <span class=\"" + AtivoInativo + "\" ><i class=\"fas fa-user-alt \"></i>" + tarefa.getResponsavel() + "</span>\n");
            aux.append("              </div>\n");
            aux.append("              <span class=\"descricao " + AtivoInativo + " \" >" + tarefa.getDescricao() + "</span>\n");
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
            aux.append("                      <input type=\"checkbox\" name=\"ativo\"" + checked + ">\n");
            aux.append("                    </form>\n");
            aux.append("                  </div>\n");
            aux.append("                </label>\n");
            aux.append("              </div>\n");
            aux.append("              <a href=\"#\" class=\"deletar-link\"  onclick=\"alert();"+ link(TarefasActions.ExcluirTarefas.class).putInteger("ID", tarefa.getId_tarefa()).ajax() + "\">\n");
            
            aux.append("                <i class=\"fas fa-trash\"></i>\n");
            aux.append("              </a>\n");
            aux.append("            </div>\n");
            aux.append("          </div>\n\n");
            
       }
        
        return aux.toString();
    }
    
    //cria os botões da pagina
    public static String botoesTarefas() throws Exception{
        StringBuilder aux = new StringBuilder();

        aux.append("<button class=\"btn-add\" onclick=\""+link(TarefasActions.NovaTarefa.class).ajax() +"\">\n");
        aux.append("    Nova Tarefa\n");
        aux.append("</button>\n");

        return aux.toString();
    }
    
    public static String botoesNovaTarefas() throws Exception{
        StringBuilder aux = new StringBuilder();

        aux.append("<button class=\"btn-add vermelho\" onclick=\""+link(TarefasActions.class).ajax() +"\">\n");
        aux.append("    Cancelar\n");
        aux.append("</button>\n");

        return aux.toString();
    }
    
    
    //cria as guias da pagina
    public static String tarefasGuias() throws Exception{
        StringBuilder aux = new StringBuilder();
        
        
        
        aux.append("<div class=\"content\" id=\"pageContent\">\n");
        aux.append("  <div class=\"task-list\">\n");
        aux.append("    <div class=\"tabs\">\n\n");

        aux.append("      <input type=\"radio\" name=\"tabs\" id=\"tab-inativas\">\n");
        aux.append("      <input type=\"radio\" name=\"tabs\" id=\"tab-ativas\" checked>\n\n");

        aux.append("        <label \">\n");
        aux.append("          <a href=\"#\" onclick=\""+link(TarefasActions.TarefasAtivas.class).ajax() + "\" class=\"link-sem-estilo\">\n");
        aux.append("            Ativas\n");
        aux.append("          </a>\n");
        aux.append("        </label>\n\n");

        aux.append("        <label \">\n");
        aux.append("          <a href=\"#\" onclick=\""+link(TarefasActions.TarefasInativas.class).ajax() + "\" class=\"link-sem-estilo\">\n");
        aux.append("            Inativas\n");
        aux.append("          </a>\n");
        aux.append("        </label>\n\n");


        aux.append("      <div class=\"tab-content content-ativas\">\n");
        aux.append("        <div class=\"task-list\" id=\"task-list\">\n\n");
        
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
    
    
    public String novaTarefa() {
        
        StringBuilder aux = new StringBuilder();

        aux.append("  <div class=\"container-tarefa-master-detail\">\n");
        aux.append("\n");
        aux.append("    <!-- MASTER -->\n");
        aux.append("    <div class=\"area-principal\">\n");
        aux.append("\n");
        aux.append("      <h2>Tarefa</h2>\n");
        aux.append("\n");
        aux.append("      <form id=\"formTarefa\" method=\"get\" action=\"#\">\n");
        aux.append("\n");
        aux.append("        <div id=\"formTarefa\" class=\"\">\n");
        aux.append("          <input type=\"hidden\" name=\"id_tarefa\" id=\"id_tarefa\" value=\"118\">\n");
        aux.append("          <input type=\"text\" name=\"titulo\" id=\"titulo\" placeholder=\"Título da tarefa\" value=\"\" required>\n");
        aux.append("          <input type=\"text\" name=\"responsavel\" id=\"responsavel\" placeholder=\"Responsável da tarefa\" value=\"\" required>\n");
        aux.append("\n");
        aux.append("          <textarea name=\"descricao\" id=\"descricao\" placeholder=\"Descrição da tarefa\"></textarea>\n");
        aux.append("          \n");
        aux.append("          <div class=\"area-radio\">\n");
        aux.append("\n");
        aux.append("            <div class=\"radio-group\">\n");
        aux.append("              <span class=\"texto-prioridade\">Prioridade</span>\n");
        aux.append("              <label class=\"radio radio--baixa\">\n");
        aux.append("                <input type=\"radio\" name=\"prioridade\" value=\"baixa\" required checked>\n");
        aux.append("                <span class=\"dot\"></span>\n");
        aux.append("                <span>Baixa</span>\n");
        aux.append("              </label>\n");
        aux.append("\n");
        aux.append("              <label class=\"radio radio--media\">\n");
        aux.append("                <input type=\"radio\" name=\"prioridade\" value=\"media\">\n");
        aux.append("                <span class=\"dot\"></span>\n");
        aux.append("                <span>Média</span>\n");
        aux.append("              </label>\n");
        aux.append("\n");
        aux.append("              <label class=\"radio radio--alta\">\n");
        aux.append("                <input type=\"radio\" name=\"prioridade\" value=\"alta\">\n");
        aux.append("                <span class=\"dot\"></span>\n");
        aux.append("                <span>Alta</span>\n");
        aux.append("              </label>\n");
        aux.append("            </div>\n");
        aux.append("          </div>\n");
        aux.append("          <label for=\"data\" class=\"label-data-prevista\">Data prevista para conclusão</label>\n");
        aux.append("          <input type=\"date\" name=\"data_conclusao\" id=\"data_conclusao\" value=\"\">\n");
        aux.append("        </div>\n");
        aux.append("\n");
        aux.append("        <div class=\"botoes\">\n");
        aux.append("          <button id=\"btn-editar\" type=\"reset\" class=\"editar verde\" onclick=\"link('#')\">Salvar</button>\n");
        aux.append("        </div>\n");
        aux.append("\n");
        aux.append("      </form>\n");
        aux.append("\n");
        
        aux.append("\n");
        aux.append("      <h2 class=\" opaco title-detalhe-tarefa \">Detalhes da Tarefa</h2>\n");
        aux.append("      <form id=\"form-subtarefa\" class=\"form opaco\" action=\"#\" method=\"post\">\n");
        aux.append("        <div>\n");
        aux.append("          <input type=\"hidden\" name=\"fk_tarefa\" id=\"fk_tarefa\" value=\"118\">\n");
        aux.append("\n");
        aux.append("          <div class=\"campo\">\n");
        aux.append("            <textarea name=\"descricao\" id=\"descricaoDetail\" placeholder=\"Digite a descrição...\" required></textarea>\n");
        aux.append("          </div>\n");
        aux.append("\n");
        aux.append("          <button type=\"submit\" class=\"salvar\">Adicionar subtarefa</button>\n");
        aux.append("        </div>\n");
        aux.append("      </form>\n");
        aux.append("\n");
        aux.append("    </div>\n");
        aux.append("\n");
        aux.append("    <!-- DETAIL -->\n");
        aux.append("    <div id=\"area-detail\" class=\"detail\">\n");
        aux.append("\n");
        aux.append("      <h3 class=\" opaco \" >Lista de detalhes</h3>\n");
        
        aux.append("    </div>\n");
        aux.append("\n");
        aux.append("  </div>\n");
        return aux.toString();
    }
    
}