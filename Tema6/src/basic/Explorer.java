package basic;

public class Explorer extends Persoana{
    public Explorer(String nume, String prenume, String oras, Integer varsta, boolean casatorita) {
        super(nume, prenume, oras, varsta, casatorita);
    }

    @Override
    public String getResponsabilitati() {
        return "Parcurgerea materialelor, rezolvarea temelor, participarea la activitati";
    }
}
