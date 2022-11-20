package verbs;
public class Venir extends Verb {
    
    public Venir(){
        super();
        String[] conjugations =  {
            "venir  ",  // infinitive   
            "viens  ",  // 1st person sg
            "viens  ",  // 2nd person sg
            "vient  ",  // 3rd person sg
            "venons ",  // 1st person pl
            "venez  ",  // 2nd person pl
            "viennent"  // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
