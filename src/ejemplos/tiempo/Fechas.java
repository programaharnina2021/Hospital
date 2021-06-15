package ejemplos.tiempo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class Fechas {
	public static void main(String[] args) throws InterruptedException {
		// Este me da la fecha actual
		LocalDate mi = LocalDate.now();
		Date fecha = new Date();
		// El constructor no es accesible
		//LocalDate otra=new LocalDate(0, 0, 0);
		LocalDate otra = LocalDate.of(1998, 2, 12);
		System.out.println(otra);
		System.out.println(otra.isBefore(mi));
		System.out.println(otra.isAfter(mi));
		System.out.println(otra.isEqual(mi));
		// En febrero
		System.out.println(otra.range(ChronoField.DAY_OF_MONTH));
		// En mayo 31
		System.out.println(mi.range(ChronoField.DAY_OF_MONTH));
		System.out.println(mi.range(ChronoField.EPOCH_DAY));
//		Duration d = Duration.between(otra.of(23, 11, 12), mi.of(23, 11, 12));
		Duration d1 = Duration.between(LocalTime.of(23, 30), LocalTime.of(12, 10));
		System.out.println("uso duration"+d1);
		
		//Periodo
		Period p = Period.of(2, 5, 10);
        System.out.println(p);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        Temporal t = p.addTo(d);
        System.out.printf("temporal Class: %s%n", t.getClass());
        System.out.printf("temporal value: %s%n", t);
        
        //Entre dos fechas
        Period p1 = Period.between(LocalDate.now(), LocalDate.of(2020, 1, 1));
        System.out.println("uso de period "+p1);
        Period p2 = Period.between(otra, mi);
        System.out.println(p2);
        System.out.println(p2.getYears());
        //El periodo es para fecha
        LocalTime ahora=LocalTime.now();
        for (int i = 0; i < 10; i++) {
			System.out.println("hola");
			Thread.sleep(10);
		}
        LocalTime luego=LocalTime.now();
        System.out.println(Duration.between(ahora,luego).getNano());
	}
}
