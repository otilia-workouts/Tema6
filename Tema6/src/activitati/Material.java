package activitati;

public class Material implements Activitate{
    @Override
    public String GetDescriere() {
        return "Activitate de studiu individual";
    }

    @Override
    public String GetDurata() {
        return "5d";
    }
}
