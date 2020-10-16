/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

public class Deposant extends Personne
{
    private String civilite;
    private String adresseMessagerie;
    private Adresse adresse;

public Deposant (String nom, String prenom, Adresse adresse)
{ 
    super(nom, prenom);
    this.adresse = adresse;
}
public String toString() 
{
    return super.toString() + " " + this.adresse;
}
}
