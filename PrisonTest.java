public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        Prisoner twitch = new Prisoner();

        System.out.println(bubba == twitch);//
         //dua objek camera
        System.out.println("dua objek camera");
        Camera remote1 = new Camera();
        Camera remote2 = new Camera();

        remote1.play(); // Mengendalikan camera pertama
        remote2.play(); // Mengendalikan camera kedua
    }//end method main
}//end class PrisonTest
