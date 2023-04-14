public class DescuentoFijo extends Descuento{

    @Override
    public float obtenerDescuento(float valorBase) {
        return this.getValor();
    }

    @Override
    public float obtenerValorFinal(float ValorBase) {
        return ValorBase - this.obtenerDescuento(ValorBase);
    }
}
