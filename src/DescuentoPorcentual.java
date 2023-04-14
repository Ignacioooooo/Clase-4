import java.lang.invoke.VarHandle;

public class DescuentoPorcentual extends Descuento{

    @Override
    public float obtenerDescuento(float valorBase) {
        return this.getValor() * valorBase;
    }

    @Override
    public float obtenerValorFinal(float ValorBase) {
        return ValorBase - this.obtenerDescuento(ValorBase);
    }
}
