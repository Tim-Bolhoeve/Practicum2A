public class Zwembad {
    double Breedte;
    double Lengte;
    double Diepte;

    public Zwembad(double Breedte, double Lengte, double Diepte){
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }

    public Zwembad(){

    }

    public double getBreedte() {
        return Breedte;
    }

    public double getLengte() {
        return Lengte;
    }

    public double getDiepte() {
        return Diepte;
    }

    public void setBreedte(double breedte) {
        Breedte = breedte;
    }

    public void setLengte(double lengte) {
        Lengte = lengte;
    }

    public void setDiepte(double diepte) {
        Diepte = diepte;
    }

    public double inhoud() {
        double inh = Breedte*Lengte*Diepte;
        return inh;
    }
    public String toString(){
        String tekst = "Dit zwembad is "+ Breedte +" meter breed, "+ Lengte +" meter lang, en "+ Diepte +" meter diep";
        return tekst;
    }

}