package zadanie3;

public class Okrag extends  Figura implements  RuchFigury{
    int promien =0;




    public Okrag(String kolor, int promien) {
        super(kolor);
        this.promien = promien;
        this.punkt = new Punkt(0,0);

    }


    @Override
    public String opis() {
        return "To jest Okrag";
    }

    @Override
    public void skaluj(float skala) {
        this.promien = (int) (this.promien * skala);
    }
    public float getPowierzchnia() {
        return (float) (Math.PI * promien * promien);
    }

    public boolean wPolu(Punkt p) {
            return Math.pow(p.x - punkt.x, 2) + Math.pow(p.y - punkt.y, 2) <= Math.pow(promien, 2);

    }
    public void przesun(int x, int y) {
        punkt.x += x;
        punkt.y += y;

    }

}
