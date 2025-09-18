package br.root.app.girls;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class GirlsAction extends JasapAct {
    
    @Override
    public Effect execute() throws Exception {
        update("main", GirlsComponentes.Girls());
        update("cabecalho", GirlsComponentes.botoesAcion());
        return new Response();
    } 
    
}
