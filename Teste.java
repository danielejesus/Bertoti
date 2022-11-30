import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {
		
		Estacionamento estacionamento = new Estacionamento();
		
		assertEquals(estacionamento.getMotos().size(), 0);
		
		estacionamento.cadastrarMoto(new Moto("ABC1111", new Especificacao("vw", "variant", "azul")));
		estacionamento.cadastrarMoto(new Moto("ABC2222", new Especificacao("fiat", "uno", "branco")));
		
		assertEquals(estacionamento.getMotos().size(), 2);
		
		Moto motoEncontrado = estacionamento.buscarmotoPorPlaca("ABC2222");
		
		assertEquals(motooEncontrado.getEspec().getModelo(), "uno");
		
		List<Moto> motosEncontrados = estacionamento.buscarMotoPorEspecificacao(new Especificacao("vw", "variant", "azul"));
		
		assertEquals(motosEncontrados.get(0).getEspec().getModelo(), "variant");
		
	}

}
