package verbs;
public class Devoir extends Verb {
    
    public Devoir(){
        super();
        String[] conjugations =  {
            "devoir ",  // infinitive   
            "dois   ",  // 1st person sg
            "dois   ",  // 2nd person sg
            "doit   ",  // 3rd person sg
            "devons ",  // 1st person pl
            "devez  ",  // 2nd person pl
            "doivent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
