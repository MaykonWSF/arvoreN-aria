public class No {
    private No pai;
    private No primeiroFilho;
    private No proximoIrmao;
    private int valor;

    public No(int valor) {
        this.valor = valor;
        this.pai = null;
        this.primeiroFilho = null;
        this.proximoIrmao = null;
    }

    public No getPai() {
        return pai;
    }

    public No getPrimeiroFilho() {
        return primeiroFilho;
    }

    public No getProximoIrmao() {
        return proximoIrmao;
    }

    public int getValor() {
        return valor;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public void setPrimeiroFilho(No primeiroFilho) {
        this.primeiroFilho = primeiroFilho;
    }

    public void setProximoIrmao(No proximoIrmao) {
        this.proximoIrmao = proximoIrmao;
    }
}
