package verbs;

public class Envoyer extends Verb {

    public Envoyer() {
        super();
        String[] conjugations =  {
            "envoyer    ",  // infinitive   
            "envoie     ",  // 1st person sg
            "envoies    ",  // 2nd person sg
            "envoie     ",  // 3rd person sg
            "envoyons   ",  // 1st person pl
            "envoyez    ",  // 2nd person pl
            "envoient   "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
    
}
