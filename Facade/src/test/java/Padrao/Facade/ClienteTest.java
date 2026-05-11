package Padrao.Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveRetornarClienteSemPendencia() {

        Cliente cliente = new Cliente();

        assertEquals(true, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarClienteComPendenciaEstoque() {

        Cliente cliente = new Cliente();

        Estoque.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarClienteComPendenciaPagamento() {

        Cliente cliente = new Cliente();

        Pagamento.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarClienteComPendenciaEntrega() {

        Cliente cliente = new Cliente();

        Entrega.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }
}