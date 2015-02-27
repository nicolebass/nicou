package projetAca;

import java.util.ArrayList;

public class Friterie {
	private String nom ; 
	private String adresse ; 
	private ArrayList<Article>listoutArticle = new ArrayList<Article>() ;
	private ArrayList<Commande> listCommande = new ArrayList<Commande>();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Article> getListoutArticle() {
		return listoutArticle;
	}
	public void setListoutArticle(ArrayList<Article> listoutArticle) {
		this.listoutArticle = listoutArticle;
	}
	
	public ArrayList<Commande> getListCommande() {
		return listCommande;
	}
	public void setListCommande(ArrayList<Commande> listCommande) {
		this.listCommande = listCommande;
	}
	public void VoirlisteCommande(ArrayList<Commande>listCommande)
	{
	    for (Commande commande : listCommande) {
			System.out.println(commande);
		}
	}
}
