
public class Moto {
	
	private String placa;
	private Especificacao espec;
	
	
	public Moto(String placa, Especificacao espec) {
		this.placa = placa;
		this.espec = espec;
	}

	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String novaPlaca) {
		
		placa = novaPlaca;
	}
	
	public Especificacao getEspec() {
		return espec;
	}
	
	public void setEspec(Especificacao espec){
		this.espec = espec;
	}

}
