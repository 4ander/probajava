package figuren_ariketa;

public class triangelua extends figurak{
	private int aldea1;
	private int aldea2;
	private int aldea3;
	private int oinarria;
	private int altuera;

	triangelua(String mota, int altuera, int oinarria, int aldea1, int aldea2, int aldea3) {
		super(mota, oinarria, altuera);
		this.aldea1=aldea1;
		this.aldea2=aldea2;
		this.aldea3=aldea3;
		
		
	}
	public double azalera() {
		double azalera=oinarria*altuera/2;
		return azalera;
	}
	public double perimetroa() {
		double perimetroa=aldea1+aldea2+aldea3;
		return perimetroa;
}

}
