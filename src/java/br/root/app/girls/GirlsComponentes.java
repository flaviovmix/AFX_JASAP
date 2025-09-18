package br.root.app.girls;

public class GirlsComponentes {
    
    public static String botoesAcion(){
        StringBuilder aux = new StringBuilder();

        aux.append("");

        return aux.toString();
    }

    public static String Girls() {
        
        StringBuilder aux = new StringBuilder();


        aux.append("<div>\n");
        aux.append("    <div class=\"container-xl\">\n");
        aux.append("\n");
        aux.append("        <script>\n");
        aux.append("\n");
        aux.append("            let config = {\n");
        aux.append("                FASE1: { linha: \"3\", coluna: \"3\" },\n");
        aux.append("                FASE2: { linha: \"4\", coluna: \"4\" },\n");
        aux.append("                FASE3: { linha: \"5\", coluna: \"5\" },\n");
        aux.append("                FASE4: { linha: \"6\", coluna: \"6\" },\n");
        aux.append("                FASE5: { linha: \"7\", coluna: \"7\" },\n");
        aux.append("                FASE6: { linha: \"8\", coluna: \"8\" }\n");
        aux.append("            };\n");
        aux.append("\n");
        aux.append("            let personagens = [\n");

        aux.append("                {\n");
        aux.append("                    nome: \"CHUN-LI\",\n");
        aux.append("                    bandeira: \"china\",\n");
        aux.append("                    altura: \"1.70 m\",\n");
        aux.append("                    busto: \"88 cm\",\n");
        aux.append("                    cintura: \"60 cm\",\n");
        aux.append("                    quadril: \"90 cm\",\n");
        aux.append("                    idade: \"26 anos\",\n");
        aux.append("                    peso: \"58 kg\",\n");
        aux.append("                    hobbie: \"Artes marciais\",\n");
        aux.append("                    origen: \"Street Fighter\",\n");
        aux.append("                    habilidade: \"Chutes poderosas\",\n");
        aux.append("                    obs: \"Protagonista feminina dos games.\",\n");
        aux.append("                    numFotos: '6'\n");
        aux.append("                },\n");
        aux.append("                {\n");
        aux.append("                    nome: \"BULMA\",\n");
        aux.append("                    bandeira: \"Brasil\",\n");
        aux.append("                    altura: \"1.65 m\",\n");
        aux.append("                    busto: \"84 cm\",\n");
        aux.append("                    cintura: \"58 cm\",\n");
        aux.append("                    quadril: \"84 cm\",\n");
        aux.append("                    idade: \"28 anos\",\n");
        aux.append("                    peso: \"49 kg\",\n");
        aux.append("                    hobbie: \"Inventar e pesquisar\",\n");
        aux.append("                    origen: \"Dragon Ball\",\n");
        aux.append("                    habilidade: \"Gênio da ciência.\",\n");
        aux.append("                    obs: \"Sempre ajudando os guerreiros Z.\",\n");
        aux.append("                    numFotos: '5'\n");
        aux.append("                },\n");
        aux.append("                {\n");
        aux.append("                    nome: \"HINATA\",\n");
        aux.append("                    bandeira: \"japao\",\n");
        aux.append("                    altura: \"1.60 m\",\n");
        aux.append("                    busto: \"83 cm\",\n");
        aux.append("                    cintura: \"58 cm\",\n");
        aux.append("                    quadril: \"86 cm\",\n");
        aux.append("                    idade: \"16 anos\",\n");
        aux.append("                    peso: \"45 kg\",\n");
        aux.append("                    hobbie: \"Treinar taijutsu\",\n");
        aux.append("                    origen: \"Naruto\",\n");
        aux.append("                    habilidade: \"Byakugan\",\n");
        aux.append("                    obs: \"Tímida, mas determinada.\",\n");
        aux.append("                    numFotos: '4'\n");
        aux.append("                },\n");

        aux.append("            ];\n");
        aux.append("\n");
        aux.append("            for (let i = 0; i < personagens.length; i++) {\n");
        aux.append("                let p = personagens[i];\n");
        aux.append("                document.write(`\n");
        aux.append("                <div class=\"card\">\n");
        aux.append("                    <div class=\"menu-bolinha btnMenuBolinhaCard amostra\">\n");
        aux.append("                        <svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" width=\"349.569px\" height=\"349.569px\" viewBox=\"0 0 349.569 349.569\" style=\"enable-background:new 0 0 349.569 349.569;\" xml:space=\"preserve\">\n");
        aux.append("                            <g>\n");
        aux.append("                                <g>\n");
        aux.append("                                    <circle cx=\"39.081\" cy=\"54.785\" r=\"39.081\" />\n");
        aux.append("                                    <circle cx=\"39.081\" cy=\"174.785\" r=\"39.081\" />\n");
        aux.append("                                    <circle cx=\"39.081\" cy=\"294.785\" r=\"39.081\" />\n");
        aux.append("                                    <g>\n");
        aux.append("                                        <path d=\"M344.569,20.535H113.581c-2.757,0-5,2.243-5,5v58.5c0,2.757,2.243,5,5,5h230.988c2.757,0,5-2.243,5-5v-58.5 C349.569,22.778,347.326,20.535,344.569,20.535z\" />\n");
        aux.append("                                        <path d=\"M344.569,140.535H113.581c-2.757,0-5,2.243-5,5v58.5c0,2.757,2.243,5,5,5h230.988c2.757,0,5-2.243,5-5v-58.5 C349.569,142.778,347.326,140.535,344.569,140.535z\" />\n");
        aux.append("                                        <path d=\"M344.569,260.535H113.581c-2.757,0-5,2.243-5,5v58.5c0,2.757,2.243,5,5,5h230.988c2.757,0,5-2.243,5-5v-58.5 C349.569,262.778,347.326,260.535,344.569,260.535z\" />\n");
        aux.append("                                    </g>\n");
        aux.append("                                </g>\n");
        aux.append("                            </g>\n");
        aux.append("                        </svg>\n");
        aux.append("                    </div>\n");
        aux.append("\n");
        aux.append("                    <div class=\"conteudo-card\">\n");
        aux.append("                        <div class=\"area-info-personagem\" id=\"areaInfoPersonagem\">\n");
        aux.append("                            <div class=\"cabecalho\">\n");
        aux.append("                                <img class=\"bandeira\" src=\"./assets/pixel_ai/${p.bandeira}.png\" alt=\"\">\n");
        aux.append("                                <div class=\"are-face\">\n");
        aux.append("                                    <img class=\"face\" src=\"./assets/pixel_ai/${p.nome}/img.png\" alt=\"\">\n");
        aux.append("                                </div>\n");
        aux.append("                                <div class=\"classificacao\">\n");
        aux.append("                                    <a href=\"#\"><img src=\"./assets/pixel_ai/ESTRELA_1-4.png\" alt=\"\"></a>\n");
        aux.append("                                    <a href=\"#\"><img src=\"./assets/pixel_ai/ESTRELA_1-4.png\" alt=\"\"></a>\n");
        aux.append("                                    <a href=\"#\"><img src=\"./assets/pixel_ai/ESTRELA_1-4.png\" alt=\"\"></a>\n");
        aux.append("                                    <a href=\"#\"><img src=\"./assets/pixel_ai/ESTRELA_1-4.png\" alt=\"\"></a>\n");
        aux.append("                                    <a href=\"#\"><img src=\"./assets/pixel_ai/ESTRELA_5.png\" alt=\"\"></a>\n");
        aux.append("                                </div>\n");
        aux.append("                            </div>\n");
        aux.append("                            <div class=\"tabela\">\n");
        aux.append("                                <table>\n");
        aux.append("                                    <tbody>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Origen:</strong></td><td>${p.origen}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Altura:</strong></td><td>${p.altura}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Busto:</strong></td><td>${p.busto}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Cintura:</strong></td><td>${p.cintura}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Quadril:</strong></td><td>${p.quadril}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Idade:</strong></td><td>${p.idade}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Peso:</strong></td><td>${p.peso}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Hobbie:</strong></td><td>${p.hobbie}</td></tr>\n");
        aux.append("                                        <tr><td class=\"chave\"><strong>Habilidade:</strong></td><td>${p.habilidade}</td></tr>\n");
        aux.append("                                        <tr class=\"obs\"><td colspan=\"2\" class=\"obs\">${p.obs}</td></tr>\n");
        aux.append("                                    </tbody>\n");
        aux.append("                                </table>\n");
        aux.append("                            </div>\n");
        aux.append("                        </div>\n");
        aux.append("                        <img class=\"img-principal\" src=\"./assets/pixel_ai/${p.nome}/img.png\" alt=\"imagem da personagem\" />\n");
        aux.append("                        <div class=\"area-titulo-da-fase mostrar\" id=\"area-titulo-da-fase\">\n");
        aux.append("                            <span id=\"areaTituloTexto\">${p.nome}</span>\n");
        aux.append("                        </div>\n");
        aux.append("                    </div>\n");
        aux.append("\n");
        aux.append("                    <div class=\"area-link-fases\">\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('1_FASE1')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE1.linha)}&coluna=${encodeURIComponent(config.FASE1.coluna)}&aleatoria=0\" data-titulo=\"FASE1\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-1.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('2_FASE2')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE2.linha)}&coluna=${encodeURIComponent(config.FASE2.coluna)}&aleatoria=0\" data-titulo=\"FASE2\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-2.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('3_FASE3')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE3.linha)}&coluna=${encodeURIComponent(config.FASE3.coluna)}&aleatoria=0\" data-titulo=\"FASE3\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-3.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('4_FASE4')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE4.linha)}&coluna=${encodeURIComponent(config.FASE4.coluna)}&aleatoria=0\" data-titulo=\"FASE4\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-4.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('5_FASE5')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE5.linha)}&coluna=${encodeURIComponent(config.FASE5.coluna)}&aleatoria=0\" data-titulo=\"FASE5\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-5.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                        <a href=\"./quebra-cabeca.html?nome=${encodeURIComponent(p.nome)}&fase=${encodeURIComponent('6_FASE6')}&numFotos=${encodeURIComponent(p.numFotos)}&linha=${encodeURIComponent(config.FASE6.linha)}&coluna=${encodeURIComponent(config.FASE6.coluna)}&aleatoria=0\" data-titulo=\"FASE6\">\n");
        aux.append("                            <img class=\"icone\" src=\"./assets/pixel_ai/emoje-6.png\" />\n");
        aux.append("                        </a>\n");
        aux.append("                    </div>\n");
        aux.append("                </div>\n");
        aux.append("                `);\n");
        aux.append("            }\n");
        aux.append("        </script>\n");
        aux.append("    </div>\n");
        aux.append("\n");
        aux.append("    <!-- <a href=\"./assets/pixel_ai/VIDEL/quebra-cabeça.html?img=TRAJES NORMAIS.png\" data-titulo=\"TRAJES NORMAIS\"><img class=\"icone\" src=\"./assets/pixel_ai/emoje-1.png\" /></a> -->\n");
        aux.append("    <script src=\"./assets/js/card/mostrarAreaInfoPersonagem.js\"></script>\n");
        aux.append("    <script src=\"./assets/js/card/alterarNomeFaseNomePersonagem.js\"></script>\n");
        aux.append("    <script src=\"./assets/js/card/mostrarMenuLateralCard.js\"></script>\n");
        aux.append("\n");
        aux.append("</div>\n");


        
        
        return aux.toString();
    }   
}
