package br.root.app;

import static br.jasap.core.AppManager.url;
import br.jasap.util.Link;
import br.root.app.tarefas.TarefasActions;
import java.util.Date;

public class AppHome {
    
    public static Link link(Class action) throws Exception{
        return new Link(url(action));
    }
    
    public static String toHtml(String conteudo) throws Exception {
        
        Date atual = new Date();
        Long l = atual.getTime();

        StringBuilder aux = new StringBuilder();

            aux.append("<!DOCTYPE html>\n");
            aux.append("<html lang=\"pt-BR\">\n");
            aux.append("\n");
            aux.append("<head>\n");
            aux.append("  <meta charset=\"UTF-8\">\n");
            aux.append("  <title>To-Do List</title>\n");
            aux.append("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");

            // Bootstrap
            aux.append("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");

            // Ícones
            aux.append("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");

            // CSS DO INDEX
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/index-claro.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/modal-claro.css\">\n");

            // CSS MADAIS
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/sidebar.css\">\n");

            // CSS DO TAREFAS
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/guias.css\">\n");

            // CSS CONTATOS
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/contatos.css\">\n");

            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/dashboard.css\">\n");

            // CSS CARDS
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/card/card.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/card/area-info-personagem.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/card/normalize.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/card/responsividade.css\">\n");

            // CSS TAREFA MASTER DETAIL
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/radio.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/tarefaMasterDetail-claro.css\">\n");
            aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/modal-claro.css\">\n");

            aux.append("\n</head>\n");
            
            aux.append("<script src=\"res/vendors/jquery/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/vendors/jquery/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/js/XTLib.js?r="+l+"\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/js/XTLibJqueryV1.js?r="+l+"\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/js/jasapJquery.js?r="+l+"\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/js/validate.js?r="+l+"\" type=\"text/javascript\"></script>\n");
            aux.append("<script src=\"res/vendors/sweetalert/sweetalert.js?r="+l+"\" type=\"text/javascript\"></script>\n");
            
            aux.append("\n<body>\n");
            aux.append("\n");
            aux.append("    <header>\n");
            aux.append("        <div class=\"container\">\n");
            aux.append("            <div id=\"cabecalho\"> \n");

//             ------------- BLOCOS DE BOTÕES COMENTADOS -------------
//             <button class="btn-add" onclick="window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'">
//                 Nova Tarefa
//             </button>
//             <button class="btn-add" onclick="window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'">
//                 Nova Tarefa
//             </button>
//             <button class="btn-add" onclick="window.location.href='<%= url(detalhesTarefasActions.Listar.class) %>'">
//                 Nova Tarefa
//             </button>
            aux.append("            </div>\n");
            aux.append("\n");
            aux.append("\n");
            aux.append("            <div class=\"user-menu\">\n");
            aux.append("                <button class=\"user-btn\" aria-expanded=\"false\">\n");
            aux.append("                    <i class=\"fas fa-user-circle\"></i>\n");
            aux.append("                    <span class=\"user-name\">Flávio</span>\n");
            aux.append("                    <i class=\"fas fa-caret-down caret\"></i>\n");
            aux.append("                </button>\n");
            aux.append("\n");
            aux.append("                <div class=\"user-dropdown\" id=\"userDropdown\" hidden>\n");
            aux.append("                    <a href=\"#\">\n");
            aux.append("                        <i class=\"fas fa-user\"></i> <span class=\"opcoes-sub-menu\">Meu Perfil</span> </a>\n");
            aux.append("                    <a href=\"#\" onclick=\"openModalConfig(); return false;\">\n");
            aux.append("                        <i class=\"fas fa-cog\"></i> <span class=\"opcoes-sub-menu\">Configurações</span> </a>\n");
            aux.append("                    <a href=\"#\">\n");
            aux.append("                        <i class=\"fas fa-sign-out-alt\"></i><span class=\"opcoes-sub-menu\">Sair</span> </a>\n");
            aux.append("                </div>\n");
            aux.append("            </div>\n");
            aux.append("\n");
            aux.append("        </div>\n");
            aux.append("    </header>\n");
            aux.append("\n");
            // menu hamburger
            aux.append("    <button class=\"menu-btn\" aria-label=\"Abrir menu\" aria-expanded=\"false\" aria-controls=\"mySidebar\"\n");
            aux.append("        onclick=\"toggleSidebar()\">\n");
            aux.append("        <i class=\"fas fa-bars\"><span class=\"menu-lateral\">Menu lateral</span></i>\n");
            aux.append("    </button>\n");
            aux.append("\n");
            // ADICIONADO
            aux.append("      <div class=\"layout\">\n");
            // Sidebar
            aux.append("    <aside class=\"sidebar active\" id=\"mySidebar\" aria-hidden=\"true\">\n");
            aux.append("        <nav class=\"sidebar-nav\">\n");

            // <button class="sidebar-close" aria-label="Fechar menu" onclick="toggleSidebar()">
            //     <i class="fas fa-times"></i>
            // </button>
            aux.append("\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-cog\"></i>Configuração</a>\n");
            aux.append("            <hr>\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-tachometer-alt\"></i> Dashboard</a>\n");
            aux.append("            <a href=\"#\" onclick=\""+link(TarefasActions.class).ajax()+"\"><i class=\"fas fa-tasks\"></i> Tarefas</a>\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-address-book\"></i> Contatos</a>\n");
            aux.append("\n");
            aux.append("            <a href=\"javascript:void(0)\" class=\"submenu-toggle\" onclick=\"toggleSubmenu('submenu-cardadventure', this)\"\n");
            aux.append("                aria-expanded=\"false\">\n");
            aux.append("                <span><i class=\"fas fa-id-card\"></i><span class=\"titilo-side-bar\">CardAdventure</span></span>\n");
            aux.append("                <i class=\"fas fa-chevron-right caret\"></i>\n");
            aux.append("            </a>\n");
            aux.append("            <div id=\"submenu-cardadventure\" class=\"submenu\" hidden>\n");
            aux.append("                <a href=\"#\">Girls</a>\n");
            aux.append("                <a href=\"#\">vegetables</a>\n");
            aux.append("            </div>\n");
            aux.append("        </nav>\n");
            aux.append("    </aside>\n");
            aux.append("\n");
            aux.append("\n");
            aux.append("\n");
            aux.append("    <main class=\"main-content\" id=\"main\" >\n");
            aux.append("\n");
            
            
            
            aux.append(conteudo);
            
            
            
            aux.append("    </main>\n");
            aux.append("\n");
            aux.append("    <script src=\"./assets/js/menu-usuario.js\"></script>\n");
            aux.append("    <script src=\"./assets/js/sidebar.js\"></script>\n");
            aux.append("\n");
            // FECHA layout
            aux.append(" </div>\n");
            aux.append("</body>\n");
            aux.append("\n</html>\n");

        return aux.toString();
    }
}
