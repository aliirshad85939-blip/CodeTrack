public class Problem {

    String name;
    String platform;
    String difficulty;
    String topic;
    boolean solved;

    Problem(String name, String platform, String difficulty, String topic) {
        this.name = name;
        this.platform = platform;
        this.difficulty = difficulty;
        this.topic = topic;
        this.solved = false;
    }

    void displayProblem() {
        System.out.println("Problem: " + name);
        System.out.println("Platform: " + platform);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Topic: " + topic);
        System.out.println("Status: " + (solved ? "Solved" : "Unsolved"));
        System.out.println("-----------------------------");
    }
}