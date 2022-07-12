public class Koordinates {

    private double x;
    private double y;




    //konstruktorius;

    public Koordinates() {
    }

    public Koordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //getteriai ir setteriai;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    //to String;

    @Override
    public String toString() {
        return "Koordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    //metodai;

    public  void sukeistiVietomis(){
        double temp;
      temp = x;
      x = y;
      y = temp;
    }

    public static double atstumasTarpTasku (Koordinates koord1, Koordinates koord2){
        return  Math.sqrt(Math.pow((koord1.getX() - koord2.getX()) , 2) + Math.pow((koord1.getY()-koord2.getY()), 2));
    }
    public static Koordinates koordVidurioTaskas (Koordinates koord1, Koordinates koord2){

        Koordinates vidurys = new Koordinates();
        vidurys.setX((koord1.getX()+koord2.getX())/2);
        vidurys.setY((koord1.getY()+koord2.getY())/2);
           return vidurys;

   }

   public static Koordinates pokytis (double dx, double dy, Koordinates coord) {
        coord.setX(coord.x + dx);
        coord.setY(coord.y + dy);
        return coord;
   }

   public void deltaPokytis(double dx, double dy){

        x += dx;
        y += dy;

   }




}
