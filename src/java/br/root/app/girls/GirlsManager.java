package br.root.app.girls;

import br.jasap.core.JasapRootManager;

public class GirlsManager extends JasapRootManager {

    @Override
    public void configGlobalFilters() throws Exception {
        
    }

    @Override
    public void config() throws Exception {
        regAction(GirlsAction.class);
    }
    
}
