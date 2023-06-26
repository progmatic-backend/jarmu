public abstract class Jarmu {
    protected int aktuáliSebessége;
    private String rendszam;

    public Jarmu(int aktuáliSebessége, String rendszam) {
        this.aktuáliSebessége = aktuáliSebessége;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtottE(int sebességkorlát);

    @Override
    public String toString() {
        return rendszam + "-" + aktuáliSebessége + "km/h";
    }
}
