import java.util.LinkedList;
import java.util.List;

public class Estacionamento {
	
	private List<Moto> motos = new LinkedList<Moto>();
	
	public void cadastrarMoto(Moto moto) {
		motos.add(moto);
	}
	
	public List<Moto> buscarMotoPorEspecificacao(Especificacao espec){
		List<Moto> motosEncontrados = new LinkedList<Moto>();
		for(Moto moto:motos) {
			if(moto.getEspec().comparar(espec)) motosEncontrados.add(moto);
		}
		return motosEncontrados;
	}
	
	public Moto buscarmotooPorPlaca(String placa) {
		for(Moto moto:motos) {
			if(moto.getPlaca().equals(placa)) {
				return moto;
			}
		}
		return null;
	}
	
	public List<Moto> getMotos(){
		return this.motos;
	}

}
