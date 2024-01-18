public class _09_OOPIV_Modifikatoren_GoogleKonto {

    // Eigenschaften / Attribute
    private String benutzerName;
    private String passwort;


    // Konstruktor
    public _09_OOPIV_Modifikatoren_GoogleKonto(String benutzerName, String passwort) {
        this.benutzerName = benutzerName;
        this.passwort = passwort;
    }

    // Methoden

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }


}
