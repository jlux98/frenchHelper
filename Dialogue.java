import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import verbs.*;

public class Dialogue {

    private final static String line =
"--------------------------------------------------------------------------------\n";


    private Console input;
    private List<Verb> verbList;
    private List<String> errorList;
    private int errorCount;

    private String[] loadout1 = {
        "avoir"  ,
        "être"   ,
        "prendre",
        "faire"  ,
        "aller"  ,
        "mettre" ,
        "vouloir"
    };
    private String[] loadout2 = {
        "essayer"  ,
        "apprendre",
        "pouvoir"  ,
        "devoir"   ,
        "boire"    ,
        "venir"    ,
        "connaître"
    };

    private String[][] loadouts = {
        null,
        loadout1,
        loadout2
    };


    public Dialogue(){
        verbList = new ArrayList<>();
        errorList = new ArrayList<>();
        input = System.console();
    }
    public void start(){
        System.out.println("Please type in loadout number\n");

        for (int i = 1; i < loadouts.length; i++){
            System.out.println("Loadout " + i);
            printLoadout(loadouts[i]);
            System.out.println();
        }

        boolean inputRecognized = false;
        while (!inputRecognized){
            switch (input.readLine()){
                case "1":
                    applyLoadout(loadout1);
                    System.out.println("Loadout 1 chosen.\n");
                    inputRecognized = true;
                    break;
    
                case "2":
                    applyLoadout(loadout2);
                    System.out.println("Loadout 2 chosen.\n");
                    inputRecognized = true;
                    break;
    
                // case "1 & 2":
                //     applyLoadout(loadout1);
                //     applyLoadout(loadout2);
                //     System.out.println("Loadout 1 and 2 chosen.\n");
                //     break;
    
                default:
                    // fillYourself();
                    System.out.println("Loadout not recognized");
                    break;
            }
        }
        

        Collections.shuffle(verbList);
        for (int i = 0; i < verbList.size() * 6; i++){
            if (!askForConjugation(verbList, i)){
                i--; // force the learner to type in the correct answer
            }
        }

        System.out.println(line + "Errors: " + errorCount + "\n");
        for (String error : errorList){
            System.out.println(error);
        }

        System.out.println("\nPress enter to close");
        input.readLine();
    }
    private void applyLoadout(String[] loadout) {
        for (String verb : loadout){
            addToVerbList(verb);
        }
    }

    private void printLoadout(String[] loadout) {
        for (String verb : loadout){
            System.out.print(verb+", ");
        }
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
        int verb = i % verbList.size();
        String infinitive = verbList.get(verb).getConjugation(0);
        System.out.println((i+1) + "." + infinitive);
        int person = i % 6 + 1;
        System.out.print("  " + printPerson(person));
        String givenAnswer = input.readLine();
        String correctAnswer = verbList.get(verb).getConjugation(person);
        if (answerIsCorrect(givenAnswer, correctAnswer)){
            System.out.println("  Correct!\n");
            return true;
        } else {
            System.out.println("  Wrong! The correct answer is \'"+correctAnswer+
                "\', not \'" + givenAnswer + "\'!\n");
                errorCount++;
                String errorString = "- " + infinitive + "\n  " +
                    printPerson(person) + correctAnswer + "\n" +
                    "  Your answer: " + givenAnswer;
                errorList.add(errorString);
            return false;
        }
    }

    private boolean answerIsCorrect(String givenAnswer, String correctAnswer) {
        if (correctAnswer.contains("/")){
            String[] correctAnswers = correctAnswer.split("/");
            List<String> correctAnswerList = Arrays.asList(correctAnswers);
            return correctAnswerList.contains(givenAnswer);
        } else {
            return givenAnswer.equals(correctAnswer);
        }
    }
    private String printPerson(int person) {
        String result = "";
        switch (person){
            case 1:
                result = "1st Person Singular:\n  je/j' ";
                break;
            case 2:
                result = "2nd Person Singular:\n  tu ";
                break;
            case 3:
                result = "3rd Person Singular:\n  il/elle/iel ";
                break;
            
            case 4:
                result = "1st Person Plural:\n  nous ";
                break;
            case 5:
                result = "2nd Person Plural:\n  vous ";
                break;
            case 6:
                result = "3rd Person Plural:\n  ils/elles/ielles ";
                break;

            default:
                throw new IllegalArgumentException("Person not recognized");
        }
        return result;
    }

    public static void main(String[] args) {
        new Dialogue().start();
    }
}