package zadanie3;

public class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;

	public Trojkat(int wys, int podst, String kolor){

		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}

	public String opis(){
		return "Trojkat o wymaiarach: "+wys+"  "+podst;
	}

	@Override
	public void skaluj(float skala) {
		this.wys = (int) (this.wys * skala);
		this.podst = (int) (this.podst * skala);

	}


	@Override
	public float getPowierzchnia() {
		return (this.wys * this.podst)/2;
	}

	//
	@Override
	public boolean wPolu(Punkt p) {
		if(p.x < punkt.x ) return false;
		if (p.y < punkt.y) return false;
		float a,b;
		a = ((punkt.y + this.wys) -punkt.y)/(punkt.x - (punkt.x + this.podst));
		b = (punkt.y+ this.wys)- (a* punkt.x);
		float YnaProstej;
		YnaProstej = a * p.x +b;
		if(YnaProstej<p.y) return false;
		return true;

	}
}
