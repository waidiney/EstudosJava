package javacore.Pexercicios.dominio;

public class Distribuidor {
    float distribuidor = 28 / 100f;

    @Override
    public String toString() {
        return "Distribuidor{" +
                "distribuidor=" + distribuidor +
                '}';
    }

    public float getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(float distribuidor) {
        this.distribuidor = distribuidor;
    }
}
