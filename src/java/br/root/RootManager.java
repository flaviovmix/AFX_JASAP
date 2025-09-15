package br.root;

import br.jasap.core.JasapRootManager; 
import br.root.app.dashboard.DashboardAction;

public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(DashboardAction.PaginaSubmit.class, "home.jsap");
        //regAction(HomeAction.setNomes.class);
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {

    }
}
