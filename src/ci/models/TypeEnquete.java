package ci.models;

public class TypeEnquete {
    private int id;
    private String code;
    private String libelle;

    public TypeEnquete(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void afficher() {
        System.out.println("TypeEnquete (" + this.id + ", " + this.code + ", " + this.libelle + ")");
    }

}
