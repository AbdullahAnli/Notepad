import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notepad notepad=new Notepad();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Note");
            System.out.println("2. Display Notes");
            System.out.println("3. Edit Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: notepad.addNote();break;
                case 2: notepad.displayNotes();break;
                case 3:notepad.editNote();break;
                case 4:notepad.deleteNote();break;
                case 5:System.out.println("exit...");break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");

            }
        }while (choice!=5);
    }
}
