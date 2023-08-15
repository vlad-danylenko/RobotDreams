package src.generics;

public class Human <H> {

    private H name,surname,age,country;

    public Human(H name, H surname, H age, H country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    public Human() {
    }

    public H getName() {
        return name;
    }

    public void setName(H name) {
        this.name = name;
    }

    public H getSurname() {
        return surname;
    }

    public void setSurname(H surname) {
        this.surname = surname;
    }

    public H getAge() {
        return age;
    }

    public void setAge(H age) {
        this.age = age;
    }

    public H getCountry() {
        return country;
    }

    public void setCountry(H country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
