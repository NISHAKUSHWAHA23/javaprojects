import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[]=new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "your lang-------------", "c", "c++", "java", "python", "java");
        questions[1] = new Question(2, "your projects-------------", "c", "c++", "java", "python", "java");
        questions[2] = new Question(3, "your choice-------------", "c", "c++", "java", "python", "java");
        questions[3] = new Question(4, "your learning-------------", "c", "c++", "java", "python", "java");
        questions[4] = new Question(5, "your interest-------------", "c", "c++", "java", "python", "java");
    }

    public void playQuiz() {
        int i=0;
        for (Question q : questions) {

            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.println("put your answer: ");
           selection[i]= sc.nextLine();
           i++;


        }
        System.out.println("user Answers are: ------------------");
        for(String s:selection){
            System.out.println(s);
        }

    }


    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String Actualans=que.getAnswer();
            String UserAns=selection[i];
            if(Actualans.equals(UserAns)){
                score++;
            }

        }
        System.out.println("your score is: "+score);
    }
}
