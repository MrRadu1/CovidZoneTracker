package tema2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ZoneMap {
	Zone[] zone;
	Outgoings[] persoane;
	int height;
	int lenght;

	public ZoneMap(int height, int lenght, int dimOut, int dimZone) {
		this.height = height;
		this.lenght = lenght;
		zone = new Zone[dimZone];
		persoane = new Outgoings[dimOut];
	}

	public void afisareHarta() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < lenght; j++) {
				boolean exista = false;
				for (Zone z : zone)
					if (z.getCenterX() == j + 1 && z.getCenterY() == i + 1) {
						exista = true;
						if (z instanceof GreenZone)
							System.out.print("G");
						else if (z instanceof YellowZone)
							System.out.print("Y");
						else
							System.out.print("R");
					}
				if (!exista)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public int cazuriTotale() {
		int result = 0;
		for (Zone z : zone)
			result += z.getNrInfectati();
		return result;
	}

	public void tentativeIesire() throws IOException {
		File result = new File("result.txt");
		FileWriter outTxt = new FileWriter("result.txt");
		for (Outgoings out : persoane) {
			int random = (int) (Math.random() * 20);
			if (zone[random].getOut(out))
				outTxt.write(out.getPrenume() + " " + out.getNume() + " can go out in zone " + zone[random].getNume()
						+ " with identifier " + zone[random].getID() + "!");
			else
				outTxt.write(out.getPrenume() + " " + out.getNume() + " can NOT go out in zone "
						+ zone[random].getNume() + " with identifier " + zone[random].getID() + "!");
			outTxt.write("\n");
		}
		outTxt.close();
	}
}
