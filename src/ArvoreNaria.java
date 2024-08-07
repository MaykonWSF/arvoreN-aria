public class ArvoreNaria {
    private No raiz;

    public ArvoreNaria() {
        this.raiz = null;
    }

    // Inicializar a árvore
    public void inicializar(No raiz) {
        this.raiz = raiz;
    }

    // Buscar um nó
    public No buscarNo(int valor, No raiz) {
        if (raiz == null) {
            return null;
        } else if (raiz.getValor() == valor) {
            System.out.println("Nó encontrado.");
            return raiz;
        }

        No aux = raiz.getPrimeiroFilho();
        while (aux != null) {
            No no = buscarNo(valor, aux);
            if (no != null) {
                return no;
            }
            aux = aux.getProximoIrmao();
        }
        return null;
    }

    // Exibir a árvore
    public void exibirArvore(No raiz) {
        if (raiz == null) {
            return;
        }

        System.out.print(raiz.getValor() + "(");
        No aux = raiz.getPrimeiroFilho();
        while (aux != null) {
            exibirArvore(aux);
            aux = aux.getProximoIrmao();
        }
        System.out.print(")");
    }

    // Inseriri um novo nó
    public boolean inserirNo(int valor, int paiValor) {
        No pai = buscarNo(paiValor, raiz);
        if (pai == null) {
            System.out.println("Pai não encontrado.");
            return false;
        }

        No novoNo = new No(valor);
        novoNo.setPai(pai);

        if (pai.getPrimeiroFilho() == null) {
            pai.setPrimeiroFilho(novoNo);
            System.out.println("Nó inserido com sucesso.");
            return true;
        } else {
            No aux = pai.getPrimeiroFilho();
            while (aux.getProximoIrmao() != null) {
                aux = aux.getProximoIrmao();
            }
            aux.setProximoIrmao(novoNo);
            System.out.println("Nó inserido com sucesso.");
            return true;
        }
    }

    // Remover um nó
    public boolean removerNo(int valor) {
        No no = buscarNo(valor, raiz);
        if (no == null) {
            System.out.println("Nó não encontrado.");
            return false;
        }

        No pai = no.getPai();
        No primeiroFilho = no.getPrimeiroFilho();
        No proximoIrmao = no.getProximoIrmao();

        if (pai != null) {
            if (pai.getPrimeiroFilho() == no) {
                pai.setPrimeiroFilho(proximoIrmao);
            } else {
                No aux = pai.getPrimeiroFilho();
                while (aux.getProximoIrmao() != no) {
                    aux = aux.getProximoIrmao();
                }
                aux.setProximoIrmao(proximoIrmao);
            }

            if (primeiroFilho != null) {
                No aux = pai.getPrimeiroFilho();
                if (aux == null) {
                    proximoIrmao.setPrimeiroFilho(primeiroFilho);
                } else {
                    while (aux.getProximoIrmao() != null) {
                        aux = aux.getProximoIrmao();
                    }
                    aux.setProximoIrmao(primeiroFilho);
                }
            }
        } else {
            raiz = primeiroFilho;
        }

        no = null;
        return true;
    }
}
