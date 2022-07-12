import java.lang.reflect.Array;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Koordinates koord1 = new Koordinates(1,4);
        Koordinates koord2 = new Koordinates(4,50);


        System.out.println("Pirmine tasko A koordinate : " + koord1);

        koord1.sukeistiVietomis();
        System.out.println( "Tasko A koordinate, sukeitus x ir y : " +koord1);

        System.out.println("Tasko B koordinate : " + koord2);

        double atstumas = Koordinates.atstumasTarpTasku(koord1, koord2);
        System.out.println("Atstumas tarp A ir B : " + atstumas);


        System.out.println("Vidurio tasko koordinates : " + Koordinates.koordVidurioTaskas(koord1,koord2));



       // System.out.println("Koordinates.pokytis(3, 2, koord2) = " + Koordinates.pokytis(3, 2, koord2));


        koord2.deltaPokytis(5, -5);
        System.out.println("delta pokytis" + koord2);

    }

}
