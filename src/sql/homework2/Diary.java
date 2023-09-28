package src.sql.homework2;

import java.util.Objects;

public class Diary {
    private int id;
    private String note;
    private String author;
    private String date;

    public Diary() {
    }

    public Diary(int id, String note, String author, String date) {
        this.id = id;
        this.note = note;
        this.author = author;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diary diary = (Diary) o;
        return id == diary.id && Objects.equals(note, diary.note) && Objects.equals(author, diary.author) && Objects.equals(date, diary.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, note, author, date);
    }

    @Override
    public String toString() {
        return "ID: " + id + ". Note: " + note + ". Author: " + author + ". Date: " + date + "\n";
    }
}
