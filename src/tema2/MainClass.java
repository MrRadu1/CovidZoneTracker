package tema2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {
	public static boolean toBoolean(String string) {
		int x = Integer.parseInt(string);
		if (x == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File myObj = new File("F:\\Tema2\\zones.txt");
		Scanner inZone = new Scanner(myObj);

		File myObj2 = new File("F:\\Tema2\\outgoings.txt");
		Scanner inPers = new Scanner(myObj2);

		String line = inZone.nextLine();
		String[] dimensiuni = line.split(" ");
		int height = Integer.parseInt(dimensiuni[0]);
		int lenght = Integer.parseInt(dimensiuni[1]);

		line = inZone.nextLine();
		int nrZone = Integer.parseInt(line);

		line = inPers.nextLine();
		int nrPers = Integer.parseInt(line);

		ZoneMap Harta = new ZoneMap(height, lenght, nrPers, nrZone);

		for (int i = 0; i < nrPers; i++) {
			line = inPers.nextLine();
			String[] Pers = line.split(" ");
			boolean mask = toBoolean(Pers[2]);
			boolean vaccin = toBoolean(Pers[3]);
			int ora = Integer.parseInt(Pers[4]);
			Harta.persoane[i] = new Outgoings(Pers[0], Pers[1], mask, vaccin, ora);
		}

		for (int i = 0; i < nrZone; i++) {
			line = inZone.nextLine();
			String[] zona = line.split(" ");
			int nrInfectati = Integer.parseInt(zona[4]);
			int CenterY = Integer.parseInt(zona[2]);
			int CenterX = Integer.parseInt(zona[3]);
			Zone zonaNoua;
			if (nrInfectati <= 500)
				zonaNoua = new GreenZone(zona[0], zona[1], CenterX, CenterY, nrInfectati);
			else if (nrInfectati <= 2000)
				zonaNoua = new YellowZone(zona[0], zona[1], CenterX, CenterY, nrInfectati);
			else
				zonaNoua = new RedZone(zona[0], zona[1], CenterX, CenterY, nrInfectati);
			Harta.zone[i] = zonaNoua;
		}

		Harta.afisareHarta();

		System.out.println("Nr cazuri totale astazi: " + Harta.cazuriTotale());

		Harta.tentativeIesire();

	}
}
