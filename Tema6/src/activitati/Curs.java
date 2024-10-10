package activitati;

import basic.Persoana;
import basic.Trainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Curs implements Activitate{

    private String nume;
    private String dificultate;
    private Persoana trainer;
    private ArrayList<Persoana> exploreri;
    private LinkedHashMap<String, Activitate> activitati = new LinkedHashMap<String,Activitate>();
    private int cost;

    public Curs(String nume, String dificultate, Persoana trainer, ArrayList<Persoana> exploreri, int cost) {
        this.nume = nume;
        this.dificultate = dificultate;
        this.trainer = trainer;
        this.exploreri = exploreri;
        this.cost = cost;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDificultate(String dificultate) {
        this.dificultate = dificultate;
    }

    public void setTrainer(Persoana trainer) {
        this.trainer = trainer;
    }

    public void setExploreri(ArrayList<Persoana> exploreri) {
        this.exploreri = exploreri;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNume() {
        return nume;
    }

    public String getDificultate() {
        return dificultate;
    }

    public Persoana getTrainer() {
        return trainer;
    }

    public ArrayList<Persoana> getExploreri() {
        return exploreri;
    }

    public int getCost(Persoana persoana) {
        if(persoana instanceof Trainer){
            return 0;
        }
        return cost;
    }

    @Override
    public String getDescriere() {
        return "Activitate " + nume + " cu dificultatea " + dificultate;
    }

    @Override
    public String getDurata() {
        switch (dificultate){
            case "usor":
                return "1 luna";
            case "mediu":
                return "3 luni";
            case "dificil":
                return "5 luni";
            default:
                return "necunoscut";
        }
    }

    public LinkedHashMap<String, Activitate> getActivitati() {
        return activitati;
    }

    public void setActivitati(LinkedHashMap<String, Activitate> activitati) {
        this.activitati = activitati;
    }
}
