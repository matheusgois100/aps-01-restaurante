import java.util.Scanner;

public class Prato {

	
	String nomePrato;
	double precoPrato;
	String descricaoPrato;
	
	public Prato(String nomePrato, double precoPrato) {
		super();
		this.nomePrato = nomePrato;
		this.precoPrato = precoPrato;
	}
	
	public String getNomePrato() {
		return nomePrato;
	}

	
	public double getPrecoPrato() {
		return precoPrato;
	}

	public void setPrecoPrato(double precoPrato) {
		this.precoPrato = precoPrato;
	}

	public String getDescricaoPrato() {
		return descricaoPrato;
	}

	public void setDescricaoPrato(String descricaoPrato) {
		this.descricaoPrato = descricaoPrato;
	}

}
	
	

