import java.lang.reflect.Array;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Koordinates koord1 = new Koordinates(1,4);
        Koordinates koord2 = new Koordinates(4,8);
        Koordinates koord3 = new Koordinates();


        System.out.println("Pirmine tasko A koordinate : " + koord1);

        koord1.sukeistiVietomis();
        System.out.println( "Tasko A koordinate, sukeitus x ir y : " +koord1);

        System.out.println("Tasko B koordinate : " + koord2);

        double atstumas = Koordinates.atstumasTarpTasku(koord1, koord2);
        System.out.println("Atstumas tarp A ir B : " + atstumas);

        double vidurys = Koordinates.koordVidurioTaskas(koord1,koord2,koord3);
        System.out.println("vidurys = " + vidurys);




    }

}
