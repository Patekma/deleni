package deleni.model;

public class PrikladDeleni {
    private int delenec;
    private int delitel;
    private int vysledek;

    public PrikladDeleni(int delenec, int delitel) {
        this.delenec = delenec;
        this.delitel = delitel;
        vysledek = delenec / delitel;
    }

    public PrikladDeleni() {
    }

    public int getDelenec() {
        return delenec;
    }

    public void setDelenec(int delenec) {
        this.delenec = delenec;
    }

    public int getDelitel() {
        return delitel;
    }

    public void setDelitel(int delitel) {
        this.delitel = delitel;
    }

    public int getVysledek() {
        return vysledek;
    }

    public void setVysledek(int vysledek) {
        this.vysledek = vysledek;
    }

    @Override
    public String toString() {
        return "PrikladDeleni{" +
                "delenec=" + delenec +
                ", delitel=" + delitel +
                ", vysledek=" + vysledek +
                '}';
    }
}
