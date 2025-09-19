package br.root.app.tarefas;

import br.jasap.core.AppManager;

public class TarefaController {
    
    public AppManager manager;
    
    public TarefaController() {
    }
    
    public TarefaController(AppManager manager) {
        this.manager = manager;
    }
  
    public String tarefas(boolean ativoOuInativo) throws Exception {
        TarefaComponentes componente = new TarefaComponentes(manager);
        return componente.TarefasIndividuais(ativoOuInativo);
    }
}
