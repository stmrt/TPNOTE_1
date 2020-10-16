/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

public abstract class Personne 
{
    private String prenom;
    private String nom;


public Personne (String nom, String prenom)
{
    this.prenom = validate (prenom, 50);
    this.nom = validate(nom, 50);
    

}
private String validate (String chaine, Integer taille)
{
    
    return chaine;
}
public String toString()
{
    return this.nom + " " + this.prenom;
}
}
