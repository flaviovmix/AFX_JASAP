package br.root.app.tarefas;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class TarefasActions extends JasapAct{

    @Override
    public Effect execute() throws Exception {
        TarefaComponentes TarefaComponentes = new TarefaComponentes(getManager());
        update("main", TarefaComponentes.listaTarefas(true));
        update("cabecalho", TarefaComponentes.botoesAcion());
        return new Response();
    }
    
    public static class TarefasAtivas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes TarefaComponentes = new TarefaComponentes(getManager());
            update("task-list", TarefaComponentes.TarefasIndividuais(true));
            return new Response();
          }  
    }
    
    public static class TarefasInativas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes TarefaComponentes = new TarefaComponentes(getManager());
            update("task-list", TarefaComponentes.TarefasIndividuais(false));
            return new Response();
          }  
    }
}
