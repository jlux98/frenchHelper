import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import verbs.*;

public class Dialogue {

    Console input;
    List<Verb> verbList;

    public Dialogue(){
        verbList = new ArrayList<>();
        input = System.console();
    }
    public void start(){
        System.out.println("Choose Loadout");
        switch (input.readLine()){
            case "1":
                loadout1();
                break;

            case "2":
                loadout2();
                break;

            default:
                fillYourself();
                break;
        }
        for (int i = 0; i < 42; i++){
            if (!askForConjugation(verbList, i)){
                i--; // force the learner to type in the correct answer
            }
        }
    }
    private void loadout1() {
        addToVerbList("avoir");
        addToVerbList("être");
        addToVerbList("prendre");
        addToVerbList("faire");
        addToVerbList("aller");
        addToVerbList("mettre");
        addToVerbList("vouloir");
    }
    private void loadout2() {
        addToVerbList("apprendre");
        addToVerbList("essayer");
        addToVerbList("pouvoir");
        addToVerbList("devoir");
        addToVerbList("boire");
        addToVerbList("venir");
        addToVerbList("connaître");
    }


    private void fillYourself() {
        for (int i = 1; i < 8; i++){
            System.out.println("Bitte geben Sie das "+i+". Verb ein.");
            if (!addToVerbList(input.readLine())) {
                i--;
            }
        }
    }
    private boolean addToVerbList(String verb) {
        switch (verb) {
            case "aller":
                verbList.add(new Aller());
                return true;
            case "apprendre":
                verbList.add(new Apprendre());
                return true;
            case "avoir":
                verbList.add(new Avoir());
                return true;
            case "boire":
                verbList.add(new Boire());
                return true;
            case "connaître":
                verbList.add(new Connaitre());
                return true;
            case "devoir":
                verbList.add(new Devoir());
                return true;
                case "essayer":
                verbList.add(new Essayer());
                return true;
            case "être":
                verbList.add(new Etre());
                return true;
            case "faire":
                verbList.add(new Faire());
                return true;
            case "mettre":
                verbList.add(new Mettre());
                return true;
             case "pouvoir":
                verbList.add(new Pouvoir());
                return true;
            case "prendre":
                verbList.add(new Prendre());
                return true;
            case "venir":
                verbList.add(new Venir());
                return true;
            case "vouloir":
                verbList.add(new Vouloir());
                return true;

            default:
                System.out.println("Error: Verb not recognized or supported");
                return false;
        }
    }
    private boolean askForConjugation(List<Verb> verbList, int i) {
        int verb = i % 7;
        System.out.println(verbList.get(verb).getConjugation(0));
        int person = i % 6 + 1;
        printPerson(person);
        String givenAnswer = input.readLine();
        String correctAnswer = verbList.get(verb).getConjugation(person);
        if (givenAnswer.equals(correctAnswer)){
            System.out.println("Correct!\n");
            return true;
        } else {
            System.out.println("Wrong! The correct answer is "+correctAnswer+
                ", not " + givenAnswer + "!\n");
            return false;
        }
    }

    private void printPerson(int person) {
        String result = "";
        switch (person){
            case 1:
                result = "1st Person Singular:\nje ";
                break;
            case 2:
                result = "2nd Person Singular:\ntu ";
                break;
            case 3:
                result = "3rd Person Singular:\nil/elle/iel ";
                break;
            
            case 4:
                result = "1st Person Plural:\nnous ";
                break;
            case 5:
                result = "2nd Person Plural:\nvous ";
                break;
            case 6:
                result = "3rd Person Plural:\nils/elles/ielles ";
                break;

            default:
                throw new IllegalArgumentException("Person not recognized");
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        new Dialogue().start();
    }
}