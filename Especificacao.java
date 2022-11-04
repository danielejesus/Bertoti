
public class Especificacao {
	
	private String marca;
	private String modelo;
	private String corCarro;
	
	
	
	public Especificacao(String marca, String modelo, String corCarro) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.corCarro = corCarro;
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

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	
	public boolean comparar(Especificacao especificacao) {
		if(marca.equals(especificacao.marca) && 
				modelo.equals(especificacao.modelo) &&
				corCarro.equals(especificacao.corCarro)) {
			return true;
		} else {
			return false;
		}
	}

}
