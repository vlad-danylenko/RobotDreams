package src.sql.homework2.init;

import src.sql.homework2.Diary;

import java.sql.*;


public class DiaryOperations {
    public void addNote(String note, String author, String date) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO diary (note,author,date) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, note);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, date);
            preparedStatement.executeUpdate();
            System.out.println("Новий запис успішно додано.");
        }
    }

    public void updateNote(String updatedNote, String updatedAuthor, String currentTime, int idFromUser) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "UPDATE diary SET note = ?, author = ?, date = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, updatedNote);
            preparedStatement.setString(2, updatedAuthor);
            preparedStatement.setString(3, currentTime);
            preparedStatement.setInt(4, idFromUser);
            preparedStatement.executeUpdate();
            System.out.println("Запис оновлено");
        }
    }

    public void deleteNote(int idFromUser) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM diary WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idFromUser);
            preparedStatement.executeUpdate();
            System.out.println("Запис видалено");
        }
    }

    public Diary getById(int id) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT * FROM diary WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Diary diary = new Diary();
                diary.setId(resultSet.getInt("id"));
                diary.setNote(resultSet.getString("note"));
                diary.setAuthor(resultSet.getString("author"));
                diary.setDate(resultSet.getString("date"));
                return diary;
            }

        } return null;
    }
}