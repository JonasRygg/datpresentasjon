package no.hvl.dat100.prosjekt.modell;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;




import java.util.Random;
import java.util.Arrays;




public class KortUtils {


	//Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.

	//@see Kort
	//@param samling
	//samling av kort som skal sorteres. *//

	public static void sorter(KortSamling samling) {

		for (int i = samling.getAntalKort()-1; i >= 0; i--) {
            int minPos = 0;
            Kort a = samling.getAllekort()[0];
            for (int j = 1; j <= i; j++) {
                if (samling.getAllekort()[j].compareTo(samling.getAllekort()[minPos]) < 0) {
                    minPos = j;
                }
            }
            a = samling.getAllekort()[minPos];
            samling.fjern(a);
            samling.leggTil(a);
		}
	}




	//Stokkar en kortsamling.
	//@param samling//
	//samling av kort som skal stokkes.
			//
	public static void stokk(KortSamling samling) {
		if (samling.erTom() || samling.getAntalKort() == 1) {
            return;
        }
        Kort dummy = new Kort(Kortfarge.Hjerter, 1);
        int rand = 1;
        for (int i = 0; i < samling.getAntalKort()*25; i++) {
            rand = (int) (Math.random()* samling.getAntalKort());
            dummy = samling.getAllekort()[rand];
            samling.fjern(dummy);
            samling.leggTil(dummy);

        }
	}
	}

