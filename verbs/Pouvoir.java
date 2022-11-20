package verbs;
public class Pouvoir extends Verb {
    
    public Pouvoir(){
        super();
        String[] conjugations =  {
            "pouvoir",  // infinitive   
            "peux   ",  // 1st person sg
            "peux   ",  // 2nd person sg
            "peut   ",  // 3rd person sg
            "pouvons",  // 1st person pl
            "pouvez ",  // 2nd person pl
            "peuvent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
