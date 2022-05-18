public class Pista {
   Classifica classifica;
   long start;
   long stop;
   
   public Pista(Classifica c){
    this.classifica = c;
   }
    public void usaPista(Pilota p){
    
        System.out.println("il pilota "+ p.getnome() + " ha iniziato la gara");

        try {
              start = System.nanoTime();
              for(int i = 0; i< 15; i++){
                Thread.sleep((long)(Math.random() * 1000));
              }

              stop = System.nanoTime();
        } catch (Exception e) {}
        p.tempo=(stop-start)/1000000;
        classifica.addpunteggio(p);
        System.out.println("il pilota "+ p.getnome() + " ha concluso la gara");
    }
}
