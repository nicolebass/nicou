package projetAca;


public class Article {
	private int numero;
	private String nom ;
	private int prix;
	
	public Article(int numero, String nom, int prix) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prix = prix; 
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	

}
