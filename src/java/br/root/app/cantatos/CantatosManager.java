package br.root.app.cantatos;

import br.root.app.dashboard.*;
import br.jasap.core.JasapRootManager;

public class CantatosManager extends JasapRootManager {

    @Override
    public void configGlobalFilters() throws Exception {
        
    }

    @Override
    public void config() throws Exception {
        regAction(CantatosAction.class);
    }
    
}
