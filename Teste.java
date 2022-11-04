import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {
		
		Estacionamento estacionamento = new Estacionamento();
		
		assertEquals(estacionamento.getCarros().size(), 0);
		
		estacionamento.cadastrarCarro(new Carro("ABC1111", new Especificacao("vw", "variant", "azul")));
		estacionamento.cadastrarCarro(new Carro("ABC2222", new Especificacao("fiat", "uno", "branco")));
		
		assertEquals(estacionamento.getCarros().size(), 2);
		
		Carro carroEncontrado = estacionamento.buscarcarroPorPlaca("ABC2222");
		
		assertEquals(carroEncontrado.getEspec().getModelo(), "uno");
		
		List<Carro> carrosEncontrados = estacionamento.buscarCarroPorEspecificacao(new Especificacao("vw", "variant", "azul"));
		
		assertEquals(carrosEncontrados.get(0).getEspec().getModelo(), "variant");
		
	}

}
