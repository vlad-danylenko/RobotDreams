package src.streamapi2;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String email;
    private Cat cat;

    public Human(String name, String surname, String email, Cat cat) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(email, human.email) && Objects.equals(cat, human.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, cat);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", cat=" + cat +
                '}';
    }
}
