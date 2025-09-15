package br.root.app;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.app.dashboard.DashboardPagina;

public class AppActions extends JasapAct {

    @Override
    public Effect execute() throws Exception {
        getOutput().write(AppHome.toHtml(DashboardPagina.toHtml()));
        return new Response();
    }
    
}
