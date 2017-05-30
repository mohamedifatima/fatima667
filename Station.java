
package smartclimat.DonneeClasse;

import java.util.HashMap;
import java.util.Map;

public class Station {
        private int id;
        private String nom;
        private Map<Integer,Annee> annees;

    public Station(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.annees = new HashMap<>();
    }

      public Annee getCreateAnne(int annee){  
          
          
        if(getSingleAnnee(annee)!=null){        
            return getSingleAnnee(annee);
        }else {
            
            Annee n=new Annee(annee);
            int an=annee;
            annees.put(an, n);
            return annees.get(an);
            
        }
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Integer, Annee> getAnnees() {
        return annees;
    }

    public void setAnnees(Map<Integer, Annee> annees) {
        this.annees = annees;
    }
    
    public Annee getSingleAnnee(int annee){
        
                    
        return this.annees.get(annee) ;
    }
       
        
}
