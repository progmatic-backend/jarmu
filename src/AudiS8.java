public class AudiS8 extends Jarmu{
    private boolean lezerblokkolo;

    public AudiS8(int aktuáliSebessége, String rendszam, boolean lezerblokkolo) {
        super(aktuáliSebessége, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebességkorlát) {
        return !(aktuáliSebessége > sebességkorlát || lezerblokkolo);
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
