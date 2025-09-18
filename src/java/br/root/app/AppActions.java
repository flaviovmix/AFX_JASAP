package br.root.app;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.app.dashboard.DashboardComponentes;

public class AppActions extends JasapAct {

    @Override
    public Effect execute() throws Exception {
        getOutput().write(AppHome.toHtml(DashboardComponentes.Dashboard()));
        return new Response();
    }
    
}
