package verbs;
public class Vouloir extends Verb{
    public Vouloir(){
        super();
        String[] conjugations =  {
            "vouloir",  // infinitive   
            "veux   ",  // 1st person sg
            "veux   ",  // 2nd person sg
            "veut   ",  // 3rd person sg
            "voulons",  // 1st person pl
            "voulez ",  // 2nd person pl
            "veulent"   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
