package verbs;
public abstract class Verb {
    private String[] conjugations = new String[7];

    public String getConjugation(int index) {
        if (index < 0 || index > 6){
            throw new IllegalArgumentException("Index for conjugation out of bounds");
        }
        return conjugations[index];
    }

    public void setConjugations(String[] conjugations2) {
        conjugations = conjugations2;
    }
}
