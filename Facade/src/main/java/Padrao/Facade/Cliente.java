package Padrao.Facade;

public class Cliente {

    public boolean finalizarCompra() {
        return Compra.verificarPendenciasCompra(this);
    }
}