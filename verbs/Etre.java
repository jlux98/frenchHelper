package verbs;
public class Etre extends Verb{
    public Etre(){
        super();
        String[] conjugations = {
            "être",
            "suis",
            "es",
            "est",
            "sommes",
            "êtes",
            "sont",
        };
        super.setConjugations(conjugations);
    }
}
