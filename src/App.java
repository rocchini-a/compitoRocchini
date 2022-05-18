import java.net.SocketTimeoutException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //computer 17
        Classifica c = new Classifica();
       Semaforo semPista = new Semaforo(4);
       Semaforo semSpogliatoio = new Semaforo(2);
       Pista p = new Pista(c);
       Spogliatoio s = new Spogliatoio();

        Pilota p1 = new Pilota("p1", semPista, semSpogliatoio, p, s);
        Pilota p2 = new Pilota("p2", semPista, semSpogliatoio, p, s);
        Pilota p3 = new Pilota("p3", semPista, semSpogliatoio, p, s);
        Pilota p4 = new Pilota("p4", semPista, semSpogliatoio, p, s);
        Pilota p5 = new Pilota("p5", semPista, semSpogliatoio, p, s);
        Pilota p6 = new Pilota("p6", semPista, semSpogliatoio, p, s);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();

        
        System.out.println("tutti i piloti hanno finito la gara e sono usciti dallo spogliatoio");
        System.out.println("la classifica è la seguente: ");
        p.classifica.restituisci();
       
    }
}
