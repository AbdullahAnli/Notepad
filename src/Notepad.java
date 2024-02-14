import java.util.ArrayList;
import java.util.Scanner;

    public class Notepad {
        private ArrayList<Note> notes;
        private Scanner scanner;

        public Notepad() {
            notes = new ArrayList<>();
            scanner = new Scanner(System.in);

        }

        public void addNote() {
            System.out.println("Enter note title:");
            String title = scanner.nextLine();
            System.out.println("Enter note content");
            String content = scanner.nextLine();
            Note newNote = new Note(title, content);
            notes.add(newNote);
            System.out.println("mote added successfully");
        }

        public void displayNotes() {
            if (notes.isEmpty()) {
                System.out.println("no notes avaible.");
                return;
            }
            System.out.println("-----notes----");
            for (Note note : notes) {
                System.out.println("title: " + note.getTitle());
                System.out.println("content: " + note.getContent() + "------");
            }
        }

        public void editNote() {
            System.out.println("Enter the title of the note you want toedit:");
            String title = scanner.nextLine();
            for (Note note : notes) {
                if (note.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Enter new content for the notes");
                    String newContent = scanner.nextLine();
                    note.setContent(newContent);
                    System.out.println("note edited successfully");
                    return;
                }
            }
            System.out.println("note with title" + title + "not found");
        }

        public void deleteNote() {
            System.out.println("enter delete  title");
            String title = scanner.nextLine();
            for (Note note : notes){
                if (note.getTitle().equalsIgnoreCase(title)) {
                    notes.remove(note);
                    System.out.println("NOTE DELETE");
                    return;
                }
            }
            System.out.println("note with title" + title + "not found");
        }
    }



