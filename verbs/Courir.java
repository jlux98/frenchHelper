package verbs;

public class Courir extends Verb {

    public Courir() {
        super();
        String[] conjugations =  {
            "courir ",  // infinitive   
            "cours  ",  // 1st person sg
            "cours  ",  // 2nd person sg
            "court  ",  // 3rd person sg
            "courons",  // 1st person pl
            "courez ",  // 2nd person pl
            "courent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
    
}
