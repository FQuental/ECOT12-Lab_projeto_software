package 03-Lists.lab08.br.edu.unifei.ecot12.lab08;

public class Coxinha extends Salgado {
    private boolean temRequeijao;
    protected Coxinha() {}
    public boolean isTemRequeijao() {
        recheio = RecheioEnum.CALABRESA;
        return temRequeijao;
    }
    public void setTemRequeijao(boolean temRequeijao) {
        this.temRequeijao = temRequeijao;
    }
}
