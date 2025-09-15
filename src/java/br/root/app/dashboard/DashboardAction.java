package br.root.app.dashboard;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.core.NoDBAct;
import br.jasap.effect.Response;
import br.root.AppHome;

public abstract class DashboardAction extends JasapAct {
    
    public DashboardAction(){
    }
   
    public static class PaginaSubmit extends DashboardAction implements NoDBAct {
        @Override
        public Effect execute() throws Exception {
            
            AppHome corpoPagina = new AppHome();
            StringBuilder aux = new StringBuilder();
            
            aux.append("<div class=\"dashboard-container\">\n");
            aux.append("  <h2 class=\"dashboard-title\"><i class=\"fas fa-tachometer-alt\"></i> Dashboard</h2>\n");

            aux.append("  <div class=\"dashboard-grid\">\n");

            // Card Tarefas
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-icon bg-tarefas\">\n");
            aux.append("        <i class=\"fas fa-tasks\"></i>\n");
            aux.append("      </div>\n");
            aux.append("      <h5 class=\"card-title\">Tarefas</h5>\n");
            aux.append("      <p class=\"card-text\">Gerencie suas tarefas ativas e concluídas.</p>\n");
            aux.append("      <a href=\"#\" class=\"dashboard-btn btn-green\">Acessar</a>\n");
            aux.append("    </div>\n");

            // Card Contatos
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-icon bg-contatos\">\n");
            aux.append("        <i class=\"fas fa-address-book\"></i>\n");
            aux.append("      </div>\n");
            aux.append("      <h5 class=\"card-title\">Contatos</h5>\n");
            aux.append("      <p class=\"card-text\">Veja e edite sua lista de contatos.</p>\n");
            aux.append("      <a href=\"#\" class=\"dashboard-btn btn-blue\">Acessar</a>\n");
            aux.append("    </div>\n");

            // Card com Carousel (Garotas, Atletas, Vegetais)
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-carousel\">\n");

            // Slide 1
            aux.append("        <div class=\"carousel-item active\">\n");
            aux.append("          <div class=\"dashboard-icon bg-garotas\">\n");
            aux.append("            <i class=\"fas fa-female\"></i>\n");
            aux.append("          </div>\n");
            aux.append("          <h5 class=\"card-title\">Garotas</h5>\n");
            aux.append("          <p class=\"card-text\">Galeria de personagens femininas.</p>\n");
            aux.append("          <a href=\"#\" class=\"dashboard-btn btn-pink\">Acessar</a>\n");
            aux.append("        </div>\n");

            // Slide 2
            aux.append("        <div class=\"carousel-item\">\n");
            aux.append("          <div class=\"dashboard-icon bg-atletas\">\n");
            aux.append("            <i class=\"fas fa-running\"></i>\n");
            aux.append("          </div>\n");
            aux.append("          <h5 class=\"card-title\">Atletas</h5>\n");
            aux.append("          <p class=\"card-text\">Acompanhe os destaques do mundo esportivo.</p>\n");
            aux.append("          <a href=\"#\" class=\"dashboard-btn btn-green\">Acessar</a>\n");
            aux.append("        </div>\n");

            // Slide 3
            aux.append("        <div class=\"carousel-item\">\n");
            aux.append("          <div class=\"dashboard-icon bg-vegetais\">\n");
            aux.append("            <i class=\"fas fa-carrot\"></i>\n");
            aux.append("          </div>\n");
            aux.append("          <h5 class=\"card-title\">Vegetais</h5>\n");
            aux.append("          <p class=\"card-text\">Informações sobre vegetais.</p>\n");
            aux.append("          <a href=\"#\" class=\"dashboard-btn btn-blue\">Acessar</a>\n");
            aux.append("        </div>\n");

            // Controles
            aux.append("        <button class=\"carousel-btn prev\"><i class=\"fas fa-chevron-left\"></i></button>\n");
            aux.append("        <button class=\"carousel-btn next\"><i class=\"fas fa-chevron-right\"></i></button>\n");

            aux.append("      </div>\n");
            aux.append("    </div>\n");

            // Card Relatórios
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-icon bg-relatorios\">\n");
            aux.append("        <i class=\"fas fa-chart-bar\"></i>\n");
            aux.append("      </div>\n");
            aux.append("      <h5 class=\"card-title\">Relatórios</h5>\n");
            aux.append("      <p class=\"card-text\">Visualize relatórios e métricas detalhadas.</p>\n");
            aux.append("      <a href=\"#\" class=\"dashboard-btn btn-red\">Acessar</a>\n");
            aux.append("    </div>\n");

            // Card Projetos
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-icon bg-projetos\">\n");
            aux.append("        <i class=\"fas fa-project-diagram\"></i>\n");
            aux.append("      </div>\n");
            aux.append("      <h5 class=\"card-title\">Projetos</h5>\n");
            aux.append("      <p class=\"card-text\">Acompanhe os projetos em andamento.</p>\n");
            aux.append("      <a href=\"#\" class=\"dashboard-btn btn-purple\">Acessar</a>\n");
            aux.append("    </div>\n");

            // Card Configurações
            aux.append("    <div class=\"dashboard-card\">\n");
            aux.append("      <div class=\"dashboard-icon bg-config\">\n");
            aux.append("        <i class=\"fas fa-cogs\"></i>\n");
            aux.append("      </div>\n");
            aux.append("      <h5 class=\"card-title\">Configurações</h5>\n");
            aux.append("      <p class=\"card-text\">Personalize temas, preferências e opções do sistema.</p>\n");
            aux.append("      <a href=\"#\" class=\"dashboard-btn btn-yellow\">Acessar</a>\n");
            aux.append("    </div>\n");

            aux.append("  </div>\n");
            aux.append("</div>\n");

            aux.append("\n<script src=\"./assets/js/dashboard.js\" ></script>\n");


            getOutput().write(corpoPagina.toHtml(aux.toString()));
            
            return new Response();
        }
    }


    public static class setNomes extends DashboardAction {
        @Override
        public Effect execute() throws Exception {
            
            if(getInput().hasParameter("dadoInput_1")){
                update("teste1", "Dado INPUT_1: " + getInput().getString("dadoInput_1"));
            }
            
            if(getInput().hasParameter("dadoInput_2")){
                update("teste2", "Dado INPUT_2: " + getInput().getString("dadoInput_2"));
            }
            
            return new Response();
        }
    }    
    
}
