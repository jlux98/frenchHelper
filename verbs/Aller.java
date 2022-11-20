package verbs;
public class Aller extends Verb {
    
    public Aller(){
        super();
        String[] conjugations =  {
            "aller  ",  // infinitive   
            "vais   ",  // 1st person sg
            "vas    ",  // 2nd person sg
            "va     ",  // 3rd person sg
            "allons ",  // 1st person pl
            "allez  ",  // 2nd person pl
            "vont   "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
