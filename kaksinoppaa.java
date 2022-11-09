public class kaksinoppaa {
    public static void main(String[] args) {
    
        System.out.println("Aloitetaan nopan heitto\n");

        //eka heitto kerta
    
        int ekaHeitto =(int)(Math.random() * 6)+1;
        int tokaHeitto = (int)(Math.random() * 6)+1;
    
        while (ekaHeitto != tokaHeitto) {
            System.out.println("Heitto #1: " + ekaHeitto);
            System.out.println("Heitto #2: " + tokaHeitto);
            System.out.println("Ei paria");

            //jos eka heitto ei ole pari, niin arvotaan uudet numerot ja heitetään nopat uudelleen

            ekaHeitto = (int) (Math.random() * 6)+1;
            tokaHeitto = (int)(Math.random() * 6)+1;
        }

        //Jos while lausekkeen sisällä arvottiin pari, niin tulostetaan "Pari"

        System.out.println("Heitto #1: " + ekaHeitto);
        System.out.println("Heitto #2: " + tokaHeitto);
        System.out.println("Pari!");
    }
    }
