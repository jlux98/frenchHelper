package verbs;

public class Finir extends Verb {

    public Finir() {
    super();
        String[] conjugations =  {
            "finir      ",  // infinitive   
            "finis      ",  // 1st person sg
            "finis      ",  // 2nd person sg
            "finit      ",  // 3rd person sg
            "finissons  ",  // 1st person pl
            "finissez   ",  // 2nd person pl
            "finissent  "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
