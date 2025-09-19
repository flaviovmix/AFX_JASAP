package br.root.app.dashboard;

import br.jasap.core.JasapRootManager;

public class DashboardManager extends JasapRootManager {

    @Override
    public void configGlobalFilters() throws Exception {
        
    }

    @Override
    public void config() throws Exception {
        regAction(DashboardAction.class);

    }
    
}
