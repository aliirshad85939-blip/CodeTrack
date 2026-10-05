 import java.util.Scanner;
 import java.util.ArrayList;

public class CodeTrack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Problem> problems = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n========== CODETRACK ==========");
            System.out.println("1. Add Problem");
            System.out.println("2. View Problems");
            System.out.println("3. Search Problem");
            System.out.println("4. Mark as Solved");
            System.out.println("5. Show Progress");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

               case 1:

    sc.nextLine();

    System.out.print("Enter problem name: ");
    String name = sc.nextLine();

    System.out.print("Enter platform: ");
    String platform = sc.nextLine();

    System.out.print("Enter difficulty: ");
    String difficulty = sc.nextLine();

    System.out.print("Enter topic: ");
    String topic = sc.nextLine();

    Problem problem = new Problem(name, platform, difficulty, topic);

    problems.add(problem);

    System.out.println("Problem added successfully!");

    break;

               case 2:

    if (problems.isEmpty()) {
        System.out.println("No problems added yet.");
    } else {

        System.out.println("\n===== YOUR PROBLEMS =====");

        for (int i = 0; i < problems.size(); i++) {

            System.out.println("\nProblem #" + (i + 1));
            problems.get(i).displayProblem();
        }
    }

    break;

                case 3:

    sc.nextLine();

    System.out.print("Enter problem name to search: ");
    String searchName = sc.nextLine();

    boolean found = false;

    for (Problem p : problems) {

        if (p.name.equalsIgnoreCase(searchName)) {
            System.out.println("\n===== PROBLEM FOUND =====");
            p.displayProblem();
            found = true;
        }
    }

    if (!found) {
        System.out.println("Problem not found.");
    }

    break;

                case 4:

    if (problems.isEmpty()) {
        System.out.println("No problems available.");
        break;
    }

    System.out.println("\n===== YOUR PROBLEMS =====");

    for (int i = 0; i < problems.size(); i++) {
        System.out.println((i + 1) + ". " + problems.get(i).name
                + " - " + (problems.get(i).solved ? "Solved" : "Unsolved"));
    }

    System.out.print("Enter problem number to mark as solved: ");
    int problemNumber = sc.nextInt();

    if (problemNumber >= 1 && problemNumber <= problems.size()) {

        problems.get(problemNumber - 1).solved = true;

        System.out.println("Problem marked as solved! ✅");

    } else {
        System.out.println("Invalid problem number.");
    }

    break;

              case 5: {
    System.out.println("\n===== PROGRESS =====");

    int total = problems.size();
    int solvedCount = 0;

    for (Problem p : problems) {
        if (p.solved) {
            solvedCount++;
        }
    }

    int unsolved = total - solvedCount;

    System.out.println("Total Problems: " + total);
    System.out.println("Solved: " + solvedCount);
    System.out.println("Unsolved: " + unsolved);

    if (total > 0) {
        double progress = (solvedCount * 100.0) / total;
        System.out.println("Progress: " + progress + "%");
    } else {
        System.out.println("Progress: 0%");
    }

    break;
}

                case 6:
                    System.out.println("Thank you for using CodeTrack!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
} 

    

