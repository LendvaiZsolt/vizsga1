package homero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import homero.Homerseklet.mertekegyseg;

public class HoProbaDin {

	public static void main(String[] args) {
		ArrayList<Homerseklet> hom2 = new ArrayList<Homerseklet>();
		createlist(hom2);
		kiirasdint(hom2);
		System.out.println("************************");
		Homerseklet[] hom3 = new Homerseklet[hom2.size()];
		konvert(hom2, hom3);
		kiirastomb(hom3);
		System.out.println("************************");
		konv(hom3, mertekegyseg.CELSIUS);
		kiirastomb(hom3);
		System.out.println("************************");
	}

	public static void konv(Homerseklet[] hom3, mertekegyseg me) {
		for (int i = 0; i < hom3.length; i++) {
			Homerseklet.konvHomerseklet(hom3[i], me);
		}
	}

	public static void konvert(ArrayList<Homerseklet> hom2, Homerseklet[] hom3) {
		int i = 0;
		for (Homerseklet hom : hom2) {
			double fok = hom.getHomerseklet();
			mertekegyseg me = hom.getMertegys();
			hom3[i] = new Homerseklet(fok, me);
			i++;
		}
	}

	public static ArrayList<Homerseklet> createlist(ArrayList<Homerseklet> hom2) {

		Homerseklet h = null;
		String line;

		try {
			FileReader filein = new FileReader("data.txt");
			BufferedReader bufin = new BufferedReader(filein);
			while ((line = bufin.readLine()) != null) {
				String[] row = line.split(",");
				double fok = Double.parseDouble(row[0]);
				mertekegyseg me = mertekegyseg.valueOf(row[1]);
				h = new Homerseklet(fok, me);
				hom2.add(h);
			}
		} catch (Exception e) {
			System.out.println("Rossz a file, nem konvertálható.");
		}
		return null;
	}

	public static void kiirasdint(ArrayList<Homerseklet> hom2) {
		for (Homerseklet h : hom2) {
			System.out.println(h);
		}
	}

	public static void kiirastomb(Homerseklet[] hom3) {
		for (Homerseklet h : hom3) {
			System.out.println(h);
		}
	}
}
