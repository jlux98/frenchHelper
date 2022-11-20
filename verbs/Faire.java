package verbs;
public class Faire extends Verb {
    public Faire(){
        super();
        String[] conjugations =  {
            "faire  ",  // infinitive   
            "fais   ",  // 1st person sg
            "fais   ",  // 2nd person sg
            "fait   ",  // 3rd person sg
            "faisons",  // 1st person pl
            "faites ",  // 2nd person pl
            "font   "   // 3rd person   
        };
        super.setConjugations(conjugations);
    }
}
