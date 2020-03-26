package domain.model;

public class Vak implements Comparable<Vak> {
    private String naam;
    private int aantalStudiepunten;

    public Vak(String naam, int aantalStudiepunten) {
        if (naam == null || naam.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.naam = naam;

        if (aantalStudiepunten <= 2) {
            throw new IllegalArgumentException();
        }
        this.aantalStudiepunten = aantalStudiepunten;
    }

    @Override
    public int compareTo(Vak vak) {
        if (vak == null)
            return 1;
        int i = this.aantalStudiepunten - vak.aantalStudiepunten;
        if (i == 0)
            return this.naam.compareTo(vak.naam);
        else
            return i;
    }

    public String toString() {
        return this.naam + " met " + this.aantalStudiepunten + " studiepunten";
    }
}
