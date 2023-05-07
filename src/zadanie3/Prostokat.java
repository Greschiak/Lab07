package zadanie3;

public class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;
	
	public Prostokat(int wys, int szer, String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymiarach: "+szer+" x "+wys;
	}

	@Override
	public void skaluj(float skala) {
			this.wys = (int) (this.wys * skala);
			this.szer = (int) (this.szer * skala);

	}


	@Override
	public float getPowierzchnia() {
		return this.wys * this.szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return (p.x <= (punkt.x+this.szer) && p.x >= punkt.x && p.y <= punkt.y && p.y>= punkt.y-this.wys);

	}
}