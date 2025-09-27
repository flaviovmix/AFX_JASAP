package br.root.app.tarefas;

import br.jasap.core.JasapRootManager;

public class TarefasManager extends JasapRootManager {
    
    @Override
    public void configGlobalFilters() throws Exception {
    
    }

    @Override
    public void config() throws Exception {
        regAction(TarefasActions.class);
        
        regAction(TarefasActions.TarefasAtivas.class);
        regAction(TarefasActions.TarefasInativas.class);
        regAction(TarefasActions.NovaTarefa.class);
        regAction(TarefasActions.ExcluirTarefas.class);
        regAction(TarefasActions.AdicionarTarefa.class);
        regAction(TarefasActions.ValorData.class);
        
    }
}
