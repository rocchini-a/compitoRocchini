public class Spogliatoio {

    public void usaSpogliatoio(Pilota p){
        System.out.println("il pilota "+ p.getnome() + " è entrato nello spogliatoio");

        try {
            Thread.sleep((long)(Math.random() * 1000));
        } catch (Exception e) {}
        
        System.out.println("il pilota "+ p.getnome() + " è uscito dallo spogliatoio");
    }
}
