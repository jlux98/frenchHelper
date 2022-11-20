package verbs;

public class Recevoir extends Verb {

    public Recevoir() {
        super();
        String[] conjugations =  {
            "recevoir   ",  // infinitive   
            "reçois     ",  // 1st person sg
            "reçois     ",  // 2nd person sg
            "reçoit     ",  // 3rd person sg
            "recevons   ",  // 1st person pl
            "recevez    ",  // 2nd person pl
            "reçoivent  "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
    
}
