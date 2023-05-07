package zadanie2;

public class Wieloryb extends Zwierze{

    @Override
    public void lec() {
        System.out.println("Wieloryb nie lata");
    }

    @Override
    public void wyladuj() {
        System.out.println("Nie ląduje");

    }

    @Override
    public void plyn() {
        System.out.println("Wieloryb sobie pływa");

    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb się zanurza");
    }
}
