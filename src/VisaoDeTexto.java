import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {
    private EstatisticasCampo estatisticas;

    public VisaoDeTexto() {
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        int numRaposas = estatisticas.obterContagemPopulacao(campo, Raposa.class);
        int numCoelhos = estatisticas.obterContagemPopulacao(campo, Coelho.class);
        System.out.println("Passo " + passo + " - Raposas: " + numRaposas + " Coelhos: " + numCoelhos);
    }

    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    @Override
    public void reabilitarOpcoes() {
    }

    @Override
    public void definirCor(Class<?> tipo, Color cor) {
    }
}