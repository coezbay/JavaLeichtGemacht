import java.util.Scanner;

public class Z_JavaQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String[] questions = {
                "Was ist Java?",
                "Welches Konzept ist NICHT Teil von Java?",
                "Was bedeutet OOP?"
        };
        String[][] options = {
                {"1. Eine Insel", "2. Eine Programmiersprache", "3. Ein Getränk"},
                {"1. Vererbung", "2. Kapselung", "3. Mehrfachvererbung"},
                {"1. Objekt orientierte Programmierung", "2. Out Of Print", "3. Offizieller olympischer Partner"}
        };
        int[] answers = {2, 3, 1};

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". Frage: " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Deine Antwort (1, 2, 3): ");
            int answer = scanner.nextInt();
            if (answer == answers[i]) {
                System.out.println("Richtig!");
                score++;
            } else {
                System.out.println("Falsch!");
            }
            System.out.println();
        }

        System.out.println("Du hast " + score + " von " + questions.length + " Fragen richtig beantwortet.");
        scanner.close();
    }
}