package br.root;

import br.jasap.core.JasapRootManager; 
import br.jasap.dao.DataBase;
import br.root.app.AppActions;
import br.root.app.cantatos.CantatosAction;
import br.root.app.dashboard.DashboardAction;
import br.root.app.dashboard.DashboardManager;
import br.root.app.girls.GirlsAction;
import br.root.app.girls.GirlsManager;
import br.root.app.tarefas.TarefasActions;
import br.root.app.tarefas.TarefasManager;
import br.root.filters.DataBaseFilter;
import br.root.filters.ErrorFilter;

public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(AppActions.class, "home.jsap");
        regAction(DashboardAction.class);
        regAction(TarefasActions.class);
        regAction(GirlsAction.class);
        regAction(CantatosAction.class);
        
        new TarefasManager().config();
        new DashboardManager().config();
        new GirlsManager().config();
        new GirlsManager().config();
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
        getGlobalFilters().add(new ErrorFilter());;
        getGlobalFilters().add(new DataBaseFilter("TAREFAS", DataBase.POSTGRES, "localhost", 5432, "LISTA_TAREFAS", "postgres", "masterkey"));
    }
}
