package br.root.app;

import br.jasap.core.JasapRootManager;

public class AppManager extends JasapRootManager {

    @Override
    public void configGlobalFilters() throws Exception {
        
    }

    @Override
    public void config() throws Exception {
        regAction(AppActions.class);
    }
    
}
