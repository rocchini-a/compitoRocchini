public class Pilota extends Thread{
    String nome;
    Semaforo semPista;
    Semaforo semSpogliatoio;
    Pista p;
    Spogliatoio s;
    long tempo;


    public Pilota(String nome,Semaforo semPista, Semaforo semSpogliatoio, Pista p, Spogliatoio s){
        this.nome=nome;
        this.p=p;
        this.s=s;
        this.semPista=semPista;
        this.semSpogliatoio=semSpogliatoio;

        
    }

    public Pilota(){

    }

    
    public String getnome(){
        return nome;
    }

    public void run(){
        semSpogliatoio.P();
        s.usaSpogliatoio(this);
        semSpogliatoio.V();


        semPista.P();
        p.usaPista(this);
        semPista.V();


        semSpogliatoio.P();
        s.usaSpogliatoio(this);
        semSpogliatoio.V();


    }
    public void setTempo(long t){

        this.tempo = t;

    }
    public long getTempo(){

        return tempo;

    }

}
