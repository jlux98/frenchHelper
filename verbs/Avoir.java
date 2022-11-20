package verbs;
public class Avoir extends Verb{

    public Avoir(){
        super();
        String[] conjugations =  {
            "avoir  ",  // infinitive   
            "ai     ",  // 1st person sg
            "as     ",  // 2nd person sg
            "a      ",  // 3rd person sg
            "avons  ",  // 1st person pl
            "avez   ",  // 2nd person pl
            "ont    "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
