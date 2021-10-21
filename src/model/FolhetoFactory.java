package model;

import java.util.HashMap;
import java.util.Map;

public class FolhetoFactory {
    static Map<String, Folheto> tiposDeFolheto = new HashMap<>();

    public static Folheto getFolhetoTemplate(String nome, float largura, float altura, String imagem, int quantidade) {
        Folheto result = tiposDeFolheto.get(nome);
        if (result == null) {
            result = new Folheto(nome, altura, largura, imagem, quantidade);
            tiposDeFolheto.put(nome, result);
        }
        return result;
    }
}
