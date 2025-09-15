package br.root.app.dashboard;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.core.NoDBAct;
import br.jasap.effect.Response;
import br.root.app.AppHome;

public abstract class DashboardAction extends JasapAct {
    
    public DashboardAction(){
    }
    
    public static class PaginaSubmit extends DashboardAction implements NoDBAct {
        @Override
        public Effect execute() throws Exception {
            
            //AppHome corpoPagina = new AppHome();
            StringBuilder aux = new StringBuilder();
            
                aux.append("<h1>TESTE</h1>");

            //getOutput().write(corpoPagina.toHtml(aux.toString()));
            
            return new Response();
        }
    }  
    
}
