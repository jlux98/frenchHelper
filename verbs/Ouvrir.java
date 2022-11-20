package verbs;

public class Ouvrir extends Verb {

    public Ouvrir() {
        super();
        String[] conjugations =  {
            "ouvrir ",  // infinitive   
            "ouvre  ",  // 1st person sg
            "ouvres ",  // 2nd person sg
            "ouvre  ",  // 3rd person sg
            "ouvrons",  // 1st person pl
            "ouvrez ",  // 2nd person pl
            "ouvrent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
    
}
