package smartclimat.DonneeClasse;

import java.util.HashMap;
import java.util.Map;

public class Moins {

    private int moins;
    private Map<Integer, Jour> jours;

    public Moins(int moins) {
        this.moins = moins;
        this.jours = new HashMap<Integer, Jour>();
    }

    public int getMoins() {
        return moins;
    }

    public void setMoins(int moins) {
        this.moins = moins;
    }

    public Map<Integer, Jour> getJours() {
        return jours;
    }

    public void setJours(Map<Integer, Jour> jours) {
        this.jours = jours;
    }

    public Jour getSingleJour(int jour) {

        return this.jours.get(jour);
    }

    public Jour getCreateJour(int jour) {

        if (getSingleJour(jour) != null) {
            return getSingleJour(jour);
        } else {
            this.jours.put(jour, new Jour(jour));
            return this.jours.get(jour);
        }
    }

}
