package verbs;
public class Apprendre extends Verb {

    public Apprendre(){
        super();
        String[] conjugations =  {
            "apprendre  ",  // infinitive   
            "apprends   ",  // 1st person sg
            "apprends   ",  // 2nd person sg
            "apprend    ",  // 3rd person sg
            "apprenons  ",  // 1st person pl
            "apprenez   ",  // 2nd person pl
            "apprennent "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
