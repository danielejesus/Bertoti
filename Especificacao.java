
public class Especificacao {
	
	private String marca;
	private String modelo;
	private String corMoto;
	
	
	
	public Especificacao(String marca, String modelo, String corMoto) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.corMoto = corMoto;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorMoto(String corMoto) {
		this.corMoto = corMoto;
	}
	
	public boolean comparar(Especificacao especificacao) {
		if(marca.equals(especificacao.marca) && 
				modelo.equals(especificacao.modelo) &&
				corMoto.equals(especificacao.corMoto)) {
			return true;
		} else {
			return false;
		}
	}

}
