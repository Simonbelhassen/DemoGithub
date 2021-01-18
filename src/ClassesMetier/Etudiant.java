/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author simonbelhassen
 */
public class Etudiant
{
    private int numeroEtudiant;
    private String prenomEtudiant;
    private int ageEtudiant;
    
    
    // constructeur
    
    public Etudiant ( int unNumero,String unPrenom, int unAge)
    {
        this.numeroEtudiant = unNumero ;
        prenomEtudiant = unPrenom ;
        ageEtudiant = unAge ;
    }
                                  
    /**
     * @return the numeroEtudiant
     */
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    /**
     * @return the prenomEtudiant
     */
    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    /**
     * @return the ageEtudiant
     */
    public int getAgeEtudiant() {
        return ageEtudiant;
    }

    /**
     * @param numeroEtudiant the numeroEtudiant to set
     */
    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    /**
     * @param prenomEtudiant the prenomEtudiant to set
     */
    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    /**
     * @param ageEtudiant the ageEtudiant to set
     */
    public void setAgeEtudiant(int ageEtudiant) {
        this.ageEtudiant = ageEtudiant;
    }
   
}