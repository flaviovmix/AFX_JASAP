package br.root.app.cantatos;

public class CantatosComponentes {
    
    public static String botoesAcion(){
        StringBuilder aux = new StringBuilder();

        aux.append("");

        return aux.toString();
    }

    public static String Cantatos() {
        
        StringBuilder aux = new StringBuilder();

        aux.append("  <!-- Formulário -->\n");
        aux.append("  <section>\n");
        aux.append("    <h2 class=\"titulo-centro\">Cadastrar Contato</h2>\n");
        aux.append("    <form>\n");
        aux.append("      <table>\n");
        aux.append("        <tr>\n");
        aux.append("          <td><i class=\"fas fa-user\"></i> Nome</td>\n");
        aux.append("          <td><input type=\"text\" name=\"nome\" placeholder=\"Ex: João da Silva\"></td>\n");
        aux.append("        </tr>\n");
        aux.append("        <tr>\n");
        aux.append("          <td><i class=\"fas fa-phone\"></i> Telefone</td>\n");
        aux.append("          <td><input type=\"text\" name=\"telefone\" placeholder=\"(99) 99999-9999\"></td>\n");
        aux.append("        </tr>\n");
        aux.append("        <tr>\n");
        aux.append("          <td><i class=\"fas fa-envelope\"></i> E-mail</td>\n");
        aux.append("          <td><input type=\"email\" name=\"email\" placeholder=\"email@exemplo.com\"></td>\n");
        aux.append("        </tr>\n");
        aux.append("        <tr>\n");
        aux.append("          <td><i class=\"fas fa-map-marker-alt\"></i> Endereço</td>\n");
        aux.append("          <td><input type=\"text\" name=\"endereco\" placeholder=\"Rua, nº, bairro\"></td>\n");
        aux.append("        </tr>\n");
        aux.append("      </table>\n");
        aux.append("      <div class=\"actions\">\n");
        aux.append("        <button type=\"submit\" class=\"save-btn\">Salvar</button>\n");
        aux.append("        <button type=\"reset\" class=\"cancel-btn\">Cancelar</button>\n");
        aux.append("      </div>\n");
        aux.append("    </form>\n");
        aux.append("  </section>\n");
        aux.append("\n");
        aux.append("  <!-- Tabela de contatos -->\n");
        aux.append("<section>\n");
        aux.append("  <h2 class=\"titulo-centro\">Contatos Cadastrados</h2>\n");
        aux.append("  <table class=\"tabela-contatos\">\n");
        aux.append("    <tr>\n");
        aux.append("      <th>Nome</th>\n");
        aux.append("      <th>Telefone</th>\n");
        aux.append("      <th>E-mail</th>\n");
        aux.append("      <th></th>\n");
        aux.append("    </tr>\n");
        aux.append("    <tr>\n");
        aux.append("      <td><i class=\"fas fa-user\"></i>João Silva</td>\n");
        aux.append("      <td><i class=\"fas fa-phone\"></i>(21) 99999-1111</td>\n");
        aux.append("      <td><i class=\"fas fa-envelope\"></i>joao@email.com</td>\n");
        aux.append("      <td class=\"acoes\">\n");
        aux.append("        <button class=\"acao-btn edit\" title=\"Editar\"><i class=\"fas fa-pen\"></i></button>\n");
        aux.append("        <button class=\"acao-btn delete\" title=\"Excluir\"><i class=\"fas fa-trash\"></i></button>\n");
        aux.append("      </td>\n");
        aux.append("    </tr>\n");
        aux.append("    <tr>\n");
        aux.append("      <td><i class=\"fas fa-user\"></i> Maria Oliveira</td>\n");
        aux.append("      <td><i class=\"fas fa-phone\"></i> (21) 98888-2222</td>\n");
        aux.append("      <td><i class=\"fas fa-envelope\"></i> maria@email.com</td>\n");
        aux.append("      <td class=\"acoes\">\n");
        aux.append("        <button class=\"acao-btn edit\" title=\"Editar\"><i class=\"fas fa-pen\"></i></button>\n");
        aux.append("        <button class=\"acao-btn delete\" title=\"Excluir\"><i class=\"fas fa-trash\"></i></button>\n");
        aux.append("      </td>\n");
        aux.append("    </tr>\n");
        aux.append("    <tr>\n");
        aux.append("      <td><i class=\"fas fa-user\"></i> Pedro Santos</td>\n");
        aux.append("      <td><i class=\"fas fa-phone\"></i> (21) 97777-3333</td>\n");
        aux.append("      <td><i class=\"fas fa-envelope\"></i> pedro@email.com</td>\n");
        aux.append("      <td class=\"acoes\">\n");
        aux.append("        <button class=\"acao-btn edit\" title=\"Editar\"><i class=\"fas fa-pen\"></i></button>\n");
        aux.append("        <button class=\"acao-btn delete\" title=\"Excluir\"><i class=\"fas fa-trash\"></i></button>\n");
        aux.append("      </td>\n");
        aux.append("    </tr>\n");
        aux.append("  </table>\n");
        aux.append("</section>\n");

        
        return aux.toString();
    }   
}
