package verbs;
public class Connaitre extends Verb {
    
    public Connaitre(){
        super();
        String[] conjugations =  {
            "connaître  ",  // infinitive   
            "connais    ",  // 1st person sg
            "connais    ",  // 2nd person sg
            "connait    ",  // 3rd person sg
            "connaissons",  // 1st person pl
            "connaissez ",  // 2nd person pl
            "connaissent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
