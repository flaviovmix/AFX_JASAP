package br.root.app.cantatos;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public class CantatosAction extends JasapAct {
    
    @Override
    public Effect execute() throws Exception {
        update("main", CantatosComponentes.Cantatos());
        update("cabecalho", CantatosComponentes.botoesAcion());
        return new Response();
    } 
    
}
