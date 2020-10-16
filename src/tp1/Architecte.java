/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

public class Architecte extends Personne 
{

  private String conseilRegional;
  private boolean inscriptionOrdre;
  private Adresse adresse;
  private String telephone;

  public Architecte(String nom, String prenom, String conseilRegional, boolean
  inscriptionOrdre, Adresse adresse, String telephone) 
  {
    super(nom, prenom);
    this.conseilRegional = super.validate(conseilRegional, 20);
    this.inscriptionOrdre = inscriptionOrdre;
    this.adresse = adresse;
    if (telephoneValide(telephone)) 
    {
    this.telephone = telephone;
    }
    else 
    {
      this.telephone = "";
    }
    Maj_conseilRegional();
  }
  private boolean telephoneValide(String telephone) 
  {
    boolean b = true;
    return b;
  }
  public void Maj_conseilRegional() 
  {
    if (this.getConseilRegional() == null) this.setConseilRegional("Conseil regional non renseigne");
  }

  public String toString() 
  {
    String chaine = "";
    chaine = chaine + this.conseilRegional + " ";
    if (this.inscriptionOrdre) chaine = chaine + "inscrit";
    else chaine = chaine + "pas inscrit";
    chaine = chaine + " " + this.telephone;
            return chaine;
  }
}
