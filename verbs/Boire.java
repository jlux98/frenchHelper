package verbs;
public class Boire extends Verb {
    
    public Boire(){
        super();
        String[] conjugations =  {
            "boire  ",  // infinitive   
            "bois   ",  // 1st person sg
            "bois   ",  // 2nd person sg
            "boit   ",  // 3rd person sg
            "buvons ",  // 1st person pl
            "buvez  ",  // 2nd person pl
            "boivent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
