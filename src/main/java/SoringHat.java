import java.util.Scanner;

public class SoringHat {


    public String sort() {

        String question1 = "Ты предпочитаешь работать в команде?(Да/Нет)";
        String question2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
        String question3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
        String question4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";

        Scanner scanner = new Scanner(System.in);
        System.out.println(question1);
        String answer1 = scanner.nextLine();

        System.out.println(question2);
        String answer2 = scanner.nextLine();

        System.out.println(question3);
        String answer3 = scanner.nextLine();

        System.out.println(question4);
        String answer4 = scanner.nextLine();

        if (answer1.equals("Да")) {
            if (answer3.equals("Да")) {
                return "Grif";
            } else if (answer4.equals("Да")){
                return "Puf";
            }
        } else if (answer2.equals("Да")) {
            if (answer1.equals("Да")){
                return "Kogt";
            } else if (answer3.equals("Да")) {
                return "Kogtevran";
            } else {
                return "Sliserin";
            }
        } else if (answer3.equals("Да")) {
            return "Slis";
        } else {
            return "Puffendui";
        }
        return "Oh...";
    }
}