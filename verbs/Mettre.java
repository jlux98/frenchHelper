package verbs;
public class Mettre extends Verb {
    
    public Mettre(){
        super();
        String[] conjugations =  {
            "mettre ",  // infinitive   
            "mets   ",  // 1st person sg
            "mets   ",  // 2nd person sg
            "met    ",  // 3rd person sg
            "mettons",  // 1st person pl
            "mettez ",  // 2nd person pl
            "mettent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
