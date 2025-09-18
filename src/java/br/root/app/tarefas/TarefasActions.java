package br.root.app.tarefas;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class TarefasActions extends JasapAct{

    @Override
    public Effect execute() throws Exception {
        TarefaComponentes TarefaComponentes = new TarefaComponentes(getManager());
        update("main", TarefaComponentes.listaTarefas());
        update("cabecalho", TarefaComponentes.botoesAcion());
        return new Response();
    }
}
