public class Robogo extends Jarmu implements KisGepJarmu{
    private int maxSeb;

    public Robogo(int aktuáliSebessége, String rendszam, int maxSeb) {
        super(aktuáliSebessége, rendszam);
        this.maxSeb = maxSeb;

    }

    @Override
    public boolean gyorshajtottE(int sebességkorlát) {
        return aktuáliSebessége > sebességkorlát;
    }

    @Override
    public boolean haladhatItt(int sebesség) {
        return maxSeb <= sebesség;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
}
