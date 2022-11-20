package verbs;
public class Essayer extends Verb{
    
    public Essayer(){
        super();
        String[] conjugations =  {
            "essayer            ",  // infinitive   
            "essaie/essaye      ",  // 1st person sg
            "essaies/essayes    ",  // 2nd person sg
            "essaie/essaye      ",  // 3rd person sg
            "essayons           ",  // 1st person pl
            "essayez            ",  // 2nd person pl
            "essaient/essayent  "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
