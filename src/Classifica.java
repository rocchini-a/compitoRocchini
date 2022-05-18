import java.util.ArrayList;

public class Classifica {
    Pilota primaposizione = null;
    Pilota secondaposizione = null;
    Pilota terzaposizione = null;


    
public void addpunteggio(Pilota p){



    if(primaposizione == null){
        primaposizione = p;
   }else if(secondaposizione==null){
       secondaposizione=p;
   }else if(terzaposizione == null){
       terzaposizione=p;
   }else{

    if(primaposizione.getTempo()> p.getTempo()){
        terzaposizione=secondaposizione;
        secondaposizione=primaposizione;
        primaposizione=p;
    }else if(secondaposizione.getTempo()>p.getTempo()){
        terzaposizione=secondaposizione;
        secondaposizione=p;
    }else if(terzaposizione.getTempo()>p.getTempo()){
        terzaposizione=p;
    }

   }



}

   

    public void restituisci(){
        System.out.println("il primo classificato è: " + primaposizione + "con punteggio: " + primaposizione.getTempo());
        System.out.println("il secondo classificato è: " + secondaposizione + "con punteggio: " + secondaposizione.getTempo());
        System.out.println("il terzo classificato è: " + terzaposizione + "con punteggio: " + terzaposizione.getTempo());
        }
       
    }

