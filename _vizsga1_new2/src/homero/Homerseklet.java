package homero;

public class Homerseklet {

	public enum mertekegyseg {
		CELSIUS, KELVIN
	};

	private double homerseklet = 0;
	private mertekegyseg mertegys;

	public Homerseklet(double homerseklet, mertekegyseg mertegys) {
		super();
		this.homerseklet = homerseklet;
		this.mertegys = mertegys;
	}

	public Homerseklet(double homerseklet) {
		super();
		this.homerseklet = homerseklet;
		this.mertegys = mertekegyseg.CELSIUS;
	}

	public static void konvHomerseklet(Homerseklet h1) {
		double homok = 0;
		if (h1.getMertegys() == mertekegyseg.CELSIUS) {
			homok = h1.getHomerseklet() + 273.15;
			h1.setHomerseklet(homok);
			h1.setMertegys(mertekegyseg.KELVIN);
		} else {
			homok = h1.getHomerseklet() - 273.15;
			h1.setHomerseklet(homok);
			h1.setMertegys(mertekegyseg.KELVIN);
		}
	}

	@Override
	public String toString() {
		return "Homerseklet [homerseklet=" + homerseklet + ", mertegys=" + mertegys + "]";
	}

	public double getHomerseklet() {
		return homerseklet;
	}

	public void setHomerseklet(double homerseklet) {
		this.homerseklet = homerseklet;
	}

	public mertekegyseg getMertegys() {
		return mertegys;
	}

	public void setMertegys(mertekegyseg mertegys) {
		this.mertegys = mertegys;
	}

}
