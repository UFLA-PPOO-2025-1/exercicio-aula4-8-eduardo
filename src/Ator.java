import java.util.List;

public interface Ator {
    /**
     * Realiza a ação do ator no campo.
     * @param novosAtores Lista onde novos atores criados devem ser adicionados.
     */
    void agir(List<Ator> novosAtores);

    /**
     * Indica se o ator está ativo (por exemplo, vivo ou presente na simulação).
     * @return true se estiver ativo, false caso contrário.
     */
    boolean estaAtivo();
}