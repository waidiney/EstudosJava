package javacore.Pexercicios.dominio;

public class Imposto {
    float imposto = 45 / 100f;

    @Override
    public String toString() {
        return "Imposto{" +
                "imposto=" + imposto +
                '}';
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
}
