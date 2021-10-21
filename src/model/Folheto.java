package model;

public class Folheto {

    private String nome;

    private float altura;

    private float largura;

    private String imagem;

    private int quantidade;

    public String getNome() {
        return nome;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargura() {
        return largura;
    }

    public String getImagem() {
        return imagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Folheto(String nome, float altura, float largura, String imagem, int quantidade) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.imagem = imagem;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", imagem='" + imagem + '\'' +
                ", quantidade=" + quantidade;
    }
}
