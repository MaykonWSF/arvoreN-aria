public class App {
    public static void main(String[] args) throws Exception {
        ArvoreNaria arvore = new ArvoreNaria();
        No raiz = new No(8);
        
        arvore.inicializar(raiz);
        
        // Inserir nós
        arvore.inserirNo(15, 8);
        arvore.inserirNo(23, 8);
        arvore.inserirNo(2, 8);
        arvore.inserirNo(20, 15);
        arvore.inserirNo(10, 15);
        arvore.inserirNo(28, 15);
        arvore.inserirNo(36, 2);
        arvore.inserirNo(7, 2);
        System.out.println('\n');
        
        // Não insere
        arvore.inserirNo(5, 13);
        System.out.println('\n');

        // Exibir árvore
        arvore.exibirArvore(raiz);
        System.out.println('\n');

        // Buscar nó
        arvore.buscarNo(20, raiz);

        // Buscar nó inexistente
        arvore.buscarNo(13, raiz);
        System.out.println('\n');

        // Remover nó
        arvore.removerNo(15);
        System.out.println('\n');

        // Exibir árvore
        arvore.exibirArvore(raiz);

    }
}
