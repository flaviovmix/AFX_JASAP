package br.root.app.tarefas;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class TarefasActions extends JasapAct{

    @Override
    public Effect execute() throws Exception {
        TarefaComponentes componente = new TarefaComponentes(getManager());
        update("main", componente.listaTarefas(true));
        update("cabecalho", componente.botoesTarefas());
        return new Response();
    }
    
    public static class TarefasAtivas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes componente = new TarefaComponentes(getManager());
            update("task-list", componente.TarefasIndividuais(true));
            eval("document.getElementById(\"guia-ativa\").classList.add(\"check\")");
            eval("document.getElementById(\"guia-inativa\").classList.remove(\"check\")");
            return new Response();
          }  
    }
    
    public static class TarefasInativas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes componente = new TarefaComponentes(getManager());
            update("task-list", componente.TarefasIndividuais(false));
            eval("document.getElementById(\"guia-ativa\").classList.remove(\"check\")");
            eval("document.getElementById(\"guia-inativa\").classList.add(\"check\")");
            return new Response();
          }  
    }
    
    public static class NovaTarefa extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes componente = new TarefaComponentes(getManager());
            update("main", componente.novaTarefa());
            update("cabecalho", componente.botoesNovaTarefas());
            return new Response();
          }  
    }
    
    public static class ExcluirTarefas extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            TarefaComponentes componente = new TarefaComponentes(getManager());
            getInput().printParameters();
            TarefaDAO dao = new TarefaDAO(getManager());
            dao.excluirTarefa(getInput().getInteger("ID"));
            update("task-list", componente.TarefasIndividuais(true));
            return new Response();
          }  
    }
    
    public static class AdicionarTarefa extends TarefasActions{
        @Override
          public Effect execute() throws Exception {
            getInput().printParameters();
            TarefaComponentes componente = new TarefaComponentes(getManager());
            TarefaDAO dao = new TarefaDAO(getManager());
            TarefaBean bean = new TarefaBean();
            bean.setTitulo(getInput().getString("titulo"));
            bean.setTitulo(getInput().getString("responsavel"));
            bean.setTitulo(getInput().getString("descricao"));
            dao.adicionarTarefa(bean);
            update("task-list", componente.TarefasIndividuais(true));
            return new Response();
          }  
    }
}

