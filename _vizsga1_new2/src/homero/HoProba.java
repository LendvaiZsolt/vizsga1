package homero;

import java.util.Scanner;

import homero.Homerseklet.mertekegyseg;
import homero.Homerseklet;

public class HoProba {

	public static void main(String[] args) {
		System.out.print("Adj meg egy tömb méretet! (Most csak a 4-et fogadom el, mert az a feladat! )");
		int i = beolvas();
		Homerseklet[] hom1 = new Homerseklet[i];
		letrehoz(hom1);
		kiiras(hom1);
		System.out.println("**********************");
		Homerseklet.konvHomerseklet(hom1[0]);
		kiiras(hom1);
		System.out.println("**********************");
		Homerseklet.konvHomerseklet(hom1[1]);
		kiiras(hom1);
		System.out.println("**********************");
		atlaghom(hom1);
		kiiras(hom1);
	}

	private static void atlaghom(Homerseklet[] hom1) {
		double ossz = 0;
		int count = 0;
		for (int i = 0; i < hom1.length; i++) {
			if (hom1[i].getMertegys() == mertekegyseg.CELSIUS) {
				Homerseklet.konvHomerseklet(hom1[i]);
				ossz = ossz + hom1[i].getHomerseklet();
			} else {
				ossz = ossz + hom1[i].getHomerseklet();
			}
			count++;
		}
		double atlhom = ossz / count;
		System.out.println("Az átlaghomerseklet KELVINBEN: " + atlhom);

	}

	public static void kiiras(Homerseklet[] hom1) {
		for (Homerseklet homerseklet : hom1) {
			System.out.println(homerseklet);
		}
	}

	public static void letrehoz(Homerseklet[] hom1) {
		double ho = 0;
		mertekegyseg me = mertekegyseg.CELSIUS;
		for (int i = 0; i < hom1.length; i++) {

			switch (i) {
			case 0:
				ho = 15;
				me = mertekegyseg.CELSIUS;
				hom1[i] = new Homerseklet(ho, me);
				break;
			case 1:
				ho = 300;
				me = mertekegyseg.KELVIN;
				hom1[i] = new Homerseklet(ho, me);
				break;
			default:
				ho = (Math.random() * 101) + 0;
				hom1[i] = new Homerseklet(ho);
				break;
			}
		}
	}

	public static int beolvas() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean ok = false;

		do {
			try {
				System.out.println("Adj meg egy számot a kért módon!");
				i = sc.nextInt();
				ok = true;
			} catch (Exception e) {
				System.out.println("Ez nem szám");
				sc.nextLine();
				ok = false;
			}
		} while (!ok || i < 4 || i > 4);
		return i;
	}
}
