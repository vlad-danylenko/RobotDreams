package src.sql.homework2;


import src.sql.homework2.init.DatabaseCreationFacade;
import src.sql.homework2.init.DiaryOperations;


import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        databaseCreationFacade.createAndInsertDatabase(false);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Вкажіть цифрою, яку дію треба виконати. \n1. Додати новий запис\n2. Оновити запис.\n3. Видалити запис");
            int action = scanner.nextInt();
            switch (action) {
                case 1 -> addNote();
                case 2 -> updateNote();
                case 3 -> deleteNote();
                default -> System.out.println("Введіть цифру від 1 до 3");

            }

        } catch (InputMismatchException e) {
            System.out.println("Використовуйте цифри.");
        }

    }

    private static void addNote() throws SQLException {

        boolean addOneMore = true;
        while (addOneMore) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть новий запис");
            String note = scanner.nextLine();
            String author = "Vladyslav Danylenko";
            LocalDateTime getDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String currentTime = getDate.format(formatter);

            DiaryOperations diaryOperations = new DiaryOperations();
            diaryOperations.addNote(note, author, currentTime);
            System.out.println("Чи хочете додати ще один запис?\n1. Так\n2. Ні");
            int addResFromUser = scanner.nextInt();
            if (addResFromUser == 2) {
                addOneMore = false;
                scanner.close();
            }
        }
    }

    private static void updateNote() throws SQLException, ClassNotFoundException {
        System.out.println("Вкажіть ID запису який бажаєте оновити");
        Scanner scanner = new Scanner(System.in);
        int idFromUser = scanner.nextInt();
        DiaryOperations diaryOperations = new DiaryOperations();
        Diary getResult = diaryOperations.getById(idFromUser);
        if (getResult == null) {
            System.out.println("Запис не знайдено");
            scanner.close();
        } else {
            System.out.println(getResult);
            scanner.nextLine();
            System.out.print("Введіть новий текст нотатки: ");
            String updatedNote = scanner.nextLine();
            System.out.print("Введіть нового автора: ");
            String updatedAuthor = scanner.nextLine();
            scanner.close();
            LocalDateTime getDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String currentTime = getDate.format(formatter);
            diaryOperations.updateNote(updatedNote, updatedAuthor, currentTime, idFromUser);
        }
    }

        private static void deleteNote() throws SQLException {
            System.out.println("Вкажіть ID запису який бажаєте видалити");
            Scanner scanner = new Scanner(System.in);
            int idFromUser = scanner.nextInt();
            DiaryOperations diaryOperations = new DiaryOperations();
            Diary getResult = diaryOperations.getById(idFromUser);
            if (getResult == null) {
                System.out.println("Запис не знайдено");
                scanner.close();
            } else {
                System.out.println(getResult);
                scanner.nextLine();
                System.out.println("Ви впевнені що хочете видалити цей запис? Y - так, N - ні");
                String deleteResFromUser = scanner.nextLine();
                scanner.close();
                if (deleteResFromUser.equals("Y")) {
                    diaryOperations.deleteNote(idFromUser);
                }
            }
    }
}

