package src.oop1.homework_9;

public class Student {

    public Student(String name, String surname, String age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String name;
    private String surname;
    private String age;

    public String getName () {
        return this.name;
    }
    public String getSurname () {
        return this.surname;
    }

    public String getAge () {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        if (isNumeric(age)) {
            this.age = age;
        } else {
            System.out.println("Use numbers");
        }
    }

    private boolean isNumeric (String str) {
        return str.matches("\\d+");
    }

}

