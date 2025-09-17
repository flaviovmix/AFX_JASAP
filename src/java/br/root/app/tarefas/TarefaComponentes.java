package br.root.app.tarefas;

public class TarefaComponentes {
  
    public static String botoesAcion(){
        StringBuilder aux = new StringBuilder();

        aux.append("<button class=\"btn-add\" onclick=\"window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'\">\n");
        aux.append("    Nova Tarefa\n");
        aux.append("</button>\n");
        aux.append("<button class=\"btn-add\" onclick=\"window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'\">\n");
        aux.append("    Nova Tarefa\n");
        aux.append("</button>\n");
        aux.append("<button class=\"btn-add\" onclick=\"window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'\">\n");
        aux.append("    Nova Tarefa\n");
        aux.append("</button>\n");

        return aux.toString();
    }
    
    public static String listaTarefas(){
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

        aux.append("          <!-- TAREFA ATIVA -->\n");
        aux.append("          <div class=\"task baixa\">\n");
        aux.append("            <div class=\"task-content\">\n");
        aux.append("              <div class=\"task-title\">\n");
        aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">TAREFA ATIVA</a>\n");
        aux.append("              </div>\n");
        aux.append("              <div class=\"task-meta\">\n");
        aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">\n");
        aux.append("                  <span><i class=\"fas fa-layer-group\"></i>0 subtarefas</span>\n");
        aux.append("                </a>\n");
        aux.append("                <span><i class=\"fas fa-calendar-alt\"></i>14 ago - 2025</span>\n");
        aux.append("                <span><i class=\"fas fa-user-alt\"></i>Pedro Henrique</span>\n");
        aux.append("              </div>\n");
        aux.append("              <span class=\"descricao\">AQUI VAI A DESCRICAO DA TAREFA</span>\n");
        aux.append("            </div>\n\n");

        aux.append("            <div class=\"task-actions\">\n");
        aux.append("              <div>\n");
        aux.append("                <label class=\"checkbox-container\">\n");
        aux.append("                  <div class=\"usuario_concluir\">\n");
        aux.append("                    <div class=\"assigned\"><strong>Quinta-feira, 14 ago - 2025</strong></div>\n");
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

        aux.append("          <!-- TAREFA INATIVA -->\n");
        aux.append("          <div class=\"task baixa\">\n");
        aux.append("            <div class=\"task-content\">\n");
        aux.append("              <div class=\"task-title opaco\">\n");
        aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">TAREFA INATIVA</a>\n");
        aux.append("              </div>\n");
        aux.append("              <div class=\"task-meta opaco\">\n");
        aux.append("                <a href=\"novaTarefa.html\" class=\"link-sem-estilo\">\n");
        aux.append("                  <span><i class=\"fas fa-layer-group\"></i>0 subtarefas</span>\n");
        aux.append("                </a>\n");
        aux.append("                <span><i class=\"fas fa-calendar-alt\"></i>14 ago - 2025</span>\n");
        aux.append("                <span><i class=\"fas fa-user-alt\"></i>Pedro Henrique</span>\n");
        aux.append("              </div>\n");
        aux.append("              <span class=\"descricao opaco\">AQUI VAI A DESCRICAO DA TAREFA</span>\n");
        aux.append("            </div>\n\n");

        aux.append("            <div class=\"task-actions\">\n");
        aux.append("              <div>\n");
        aux.append("                <label class=\"checkbox-container\">\n");
        aux.append("                  <div class=\"usuario_concluir\">\n");
        aux.append("                    <div class=\"assigned\"><strong>Quinta-feira, 14 ago - 2025</strong></div>\n");
        aux.append("                    <form action=\"#\" method=\"get\" style=\"display:inline;\">\n");
        aux.append("                      <input type=\"hidden\" name=\"estado_atual\" value=\"true\">\n");
        aux.append("                      <input type=\"hidden\" name=\"inativo\" value=\"0\">\n");
        aux.append("                      <input type=\"hidden\" name=\"id_tarefa\" value=\"118\">\n");
        aux.append("                      <input type=\"checkbox\" name=\"inativo\" checked>\n");
        aux.append("                    </form>\n");
        aux.append("                  </div>\n");
        aux.append("                </label>\n");
        aux.append("              </div>\n");
        aux.append("              <a href=\"#\" class=\"deletar-link\">\n");
        aux.append("                <i class=\"fas fa-trash\"></i>\n");
        aux.append("              </a>\n");
        aux.append("            </div>\n");
        aux.append("          </div>\n\n");

        aux.append("        </div>\n");
        aux.append("      </div>\n\n");

        aux.append("    </div>\n");
        aux.append("  </div>\n");
        aux.append("</div>\n");

        return aux.toString();
    }
}
