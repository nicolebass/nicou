package projetAca;

import java.util.ArrayList;

public class Commande {
	private int numero;
	private String nomClient ;
	private ArrayList<Article> listeArticle=new ArrayList<Article>();
	private String etat;
	
	
    
	public Commande(int numero, String nomClient, String etat) {
		super();
		this.numero = numero;
		this.nomClient = nomClient;
		this.etat = etat;
	}
	
	final static String  ENCOURS = "en cours";
	final static String  PAYEE = "payee";
	final static String  EMPORTE = "emporte";



	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
			
		this.etat = etat;
	}
	
	public void AjouterArticle(Article a ){
	    listeArticle.add(a);
	    
	}
	
	
	public void enregPaiment()
	
	{
	etat=PAYEE ;
		
	}
public void enregEmporter()
	
	{
	etat=EMPORTE ;
	}
@Override
public String toString() {
	return "Commande [getNumero()=" + getNumero() + ", getNomClient()="
			+ getNomClient() + ", getEtat()=" + getEtat() + "]";
}

}
