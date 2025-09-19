package lixo;

import br.jasap.core.AppManager;
import br.root.app.tarefas.TarefaComponentes;
import static br.root.app.tarefas.TarefaComponentes.tarefasGuias;
import static br.root.app.tarefas.TarefaComponentes.tarefasPaginacao;

public class TarefaController {
    
    public AppManager manager;
    
    public TarefaController() {
    }
    
    public TarefaController(AppManager manager) {
        this.manager = manager;
    }
    
    public String novaTarefa() throws Exception {
        TarefaComponentes componente = new TarefaComponentes(manager);
        return componente.novaTarefa();
    }
    
    public String listaTarefas(boolean ativoOuInativo) throws Exception {
        StringBuilder aux = new StringBuilder();
        
            TarefaComponentes Componentes = new TarefaComponentes(manager);
        
            aux.append( tarefasGuias() );
            aux.append( Componentes.TarefasIndividuais(ativoOuInativo) );
            aux.append( tarefasPaginacao() );

        return aux.toString();
    }
        
    public String tarefas(boolean ativoOuInativo) throws Exception {
        TarefaComponentes componente = new TarefaComponentes(manager);
        return componente.TarefasIndividuais(ativoOuInativo);
    }
    
    public String botoesTarefas() throws Exception {
        TarefaComponentes componente = new TarefaComponentes(manager);
        return componente.botoesTarefas();
    }
    
    public String botoesNovaTarefas() throws Exception {
        TarefaComponentes componente = new TarefaComponentes(manager);
        return componente.botoesNovaTarefas();
    }   
}
