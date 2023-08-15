package src.abstractclass.homework_13;

public class Student extends Person {
    private String ticketNumber;

    public Student(String name, String surname, int age, String ticketNumber) {
        super(name, surname, age);
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public void getPersonInfo() {
        System.out.println("Student: " + getName().concat(" ").concat(getSurname()) + ". Age: " + getAge() + ". Ticket ID: " + getTicketNumber());
    }
}
