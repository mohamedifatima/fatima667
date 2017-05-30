package smartclimat.DonneeClasse;

import java.util.HashMap;
import java.util.Map;

public class Annee {

    private int annee;
    private Map<Integer, Moins> moins;

    public Annee(int annee) {

        this.annee = annee;
        this.moins = new HashMap<>();
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Map<Integer, Moins> getMoins() {
        return moins;
    }

    public void setMoins(Map<Integer, Moins> moins) {
        this.moins = moins;
    }

    public Moins getSingleMoins(int moins) {

        return this.moins.get(moins);
    }

    public Moins getCreateMois(int moins) {
        if (getSingleMoins(moins) != null) {
            return getSingleMoins(moins);
        } else {
            Moins m = new Moins(moins);
            
            int mo=moins;
            this.moins.put(mo, m);
            return this.moins.get(mo);
        }
    }

}
