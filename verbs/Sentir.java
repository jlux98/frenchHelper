package verbs;

public class Sentir extends Verb {

    public Sentir() {
        super();
        String[] conjugations =  {
            "sentir ",  // infinitive   
            "sens   ",  // 1st person sg
            "sens   ",  // 2nd person sg
            "sent   ",  // 3rd person sg
            "sentons",  // 1st person pl
            "sentez ",  // 2nd person pl
            "sentent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
    
}
