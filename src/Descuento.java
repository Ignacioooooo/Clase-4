public abstract class Descuento {
    private float valor;
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

  public abstract float obtenerDescuento(float valorBase);

   public abstract float obtenerValorFinal(float ValorBase);
}
