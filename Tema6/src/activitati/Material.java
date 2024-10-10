package activitati;

public class Material implements Activitate{
    @Override
    public String getDescriere() {
        return "Activitate de studiu individual";
    }

    @Override
    public String getDurata() {
        return "5d";
    }
}
