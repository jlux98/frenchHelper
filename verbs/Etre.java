package verbs;
public class Etre extends Verb{
    public Etre(){
        super();
        String[] conjugations = {
            "être   ",  // infinitive   
            "suis   ",  // 1st person sg
            "es     ",  // 2nd person sg
            "est    ",  // 3rd person sg
            "sommes ",  // 1st person pl
            "êtes   ",  // 2nd person pl
            "sont   "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
