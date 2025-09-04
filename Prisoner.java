public class Prisoner {
    public String name;
    public double height;
    public int sentence;

    public void think(){
        System.out.println("I'11 have my revenge.");
         //dua objek camera
        System.out.println("dua objek camera");
        Camera remote1 = new Camera();
        Camera remote2 = new Camera();

        remote1.play(); // Mengendalikan camera pertama
        remote2.play(); // Mengendalikan camera kedua
    }//end method think
}//end class Prisoner
