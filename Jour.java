package smartclimat.DonneeClasse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jour {

    private int jour;
    private Map<Integer, Releve> releve;

    public Jour(int jour) {
        this.jour = jour;
        this.releve = new HashMap<>();
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public Map<Integer, Releve> getReleve() {
        return releve;
    }

    public void setReleve(Map<Integer, Releve> releve) {
        this.releve = releve;
    }

    public Releve getSingleReleve(int ordre) {

        return this.releve.get(ordre);
    }

    public Releve getCreateReleve(int order, float temp, float nebo, float hum) {

        if (getSingleReleve(order) != null) {
            return getSingleReleve(order);
        } else {
            this.releve.put(order, new Releve(order, temp, nebo, hum));
            return releve.get(order);
        }
    }
    
    public Releve calculMoyenne(){
              
              float temp=0;
              float neb=0;
              float hum=0;
              
             for(Releve r: releve.values()){
                
                 temp= temp+r.getTemperateur();
                 neb= neb+r.getNebolosite();
                 hum= hum+r.getHumidite();
             }
               temp=temp/releve.size();
               neb=neb/releve.size();
               hum=hum/releve.size();
               
                     
                     
        return new Releve(10, temp, neb, hum);
           
             
              

        
        
    }

}
