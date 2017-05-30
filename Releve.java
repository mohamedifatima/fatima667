/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartclimat.DonneeClasse;

public class Releve {

    private int ordre;
    private float temperateur;
    private float nebolosite;
    private float humidite;

    public Releve() {
    }

    public Releve(int ordre, float temperateur, float nebolosite, float humidite) {
        this.ordre = ordre;
        this.temperateur = temperateur;
        this.nebolosite = nebolosite;
        this.humidite = humidite;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public float getTemperateur() {
        return temperateur;
    }

    public void setTemperateur(float temperateur) {
        this.temperateur = temperateur;
    }

    public float getNebolosite() {
        return nebolosite;
    }

    public void setNebolosite(float nebolosite) {
        this.nebolosite = nebolosite;
    }

    public float getHumidite() {
        return humidite;
    }

    public void setHumidite(float humidite) {
        this.humidite = humidite;
    }

}
