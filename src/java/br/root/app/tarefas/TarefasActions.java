package br.root.app.tarefas;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class TarefasActions extends JasapAct{

    @Override
    public Effect execute() throws Exception {
        TarefaController Controller = new TarefaController(getManager());
        update("main", Controller.listaTarefas(true));
        update("cabecalho", Controller.botoesTarefas());
        return new Response();
    }
    
    public static class TarefasAtivas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaController Controller = new TarefaController(getManager());
            update("task-list", Controller.tarefas(true));
            return new Response();
          }  
    }
    
    public static class TarefasInativas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaController Controller = new TarefaController(getManager());
            update("task-list", Controller.tarefas(false));
            return new Response();
          }  
    }
    
    public static class NovaTarefa extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaController Controller = new TarefaController(getManager());
            update("main", Controller.novaTarefa());
            update("cabecalho", Controller.botoesNovaTarefas());
            return new Response();
          }  
    }
    
    public static class ExcluirTarefas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaController Controller = new TarefaController(getManager());
            getInput().printParameters();
            TarefaDAO dao = new TarefaDAO(getManager());
            dao.excluirTarefa(getInput().getInteger("ID"));
             update("task-list", Controller.tarefas(true));
            return new Response();
          }  
    }
}