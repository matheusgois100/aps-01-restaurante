import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalestraCreator {
	public static void palestra() {
	Scanner c;
	
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/palestras.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo n�o encontrado.");
		return;
	}
	System.out.println("\nPALESTRAS");
	while (c.hasNext()) {
		Evento.palestra = new Palestra(c.next(),c.next(),c.next(),c.next());
		System.out.print("T�tulo: "+Evento.palestra.getTitulo()+
				"\nDescri��o: "+Evento.palestra.getResumo()+
				"\nPalestrante: "+Evento.palestra.getPalestrante()+
				" - Sala: "+Evento.palestra.getSala());;
				System.out.println("");
	}
	
	c.close();
}
}
