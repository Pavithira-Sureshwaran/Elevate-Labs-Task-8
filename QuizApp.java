import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctOption; 

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which of the following is not a Java primitive data type?",
                new String[]{"1. int", "2. float", "3. boolean", "4. String"}, 4));
        questions.add(new Question("Which language is used for Android development?",
                new String[]{"1. Python", "2. Java", "3. C#", "4. Swift"}, 2));
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"1. this", "2. extends", "3. implments", "4. inherits"}, 2));
        questions.add(new Question("Which method is the entry point of Java program",
                 new String[]{"1.start()","2. main()","3. run()","4. init()"}, 2));
        questions.add(new Question("What is the default value of a boolean variable in Java?",
        new String[]{"1.true","2. false","3. null","4. 0"},2));

        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);

            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: " + q.correctOption);
            }
        }

        System.out.println(" Your final score: " + score + "/" + questions.size());
        sc.close();
    }
}
