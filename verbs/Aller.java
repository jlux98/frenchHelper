package verbs;
public class Aller extends Verb {
    
    public Aller(){
        super();
        String[] conjugations =  {
            "aller",
            "vais",
            "vas",
            "va",
            "allons",
            "allez",
            "vont"
        };
        super.setConjugations(conjugations);
    }
}
