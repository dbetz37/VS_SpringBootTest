package de.dhbwstuttgart.wirtschaftsinformatik.springboottest;


public class Kunde {
    private long kundenNr;
    private String vorname;
    private String nachname;
    private String strasse;
    private int hausnr;
    private int plz;
    private String ort;

    public Kunde(){

    }

    public Kunde(long newKundenNr, String newVorname, String newNachname, String newStrasse, int newHausnr, int newPlz, String newOrt){
        newKundenNr = kundenNr;
        newVorname = vorname;
        newNachname = nachname;
        newStrasse = strasse;
        newHausnr = hausnr;
        newPlz = plz;
        newOrt = ort;
    }
}
