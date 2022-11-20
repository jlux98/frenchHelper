package verbs;
public class Prendre extends Verb {
    public Prendre(){
        super();
        String[] conjugations =  {
            "prendre",  // infinitive   
            "prends ",  // 1st person sg
            "prends ",  // 2nd person sg
            "prend  ",  // 3rd person sg
            "prenons",  // 1st person pl
            "prenez ",  // 2nd person pl
            "prennent"  // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
