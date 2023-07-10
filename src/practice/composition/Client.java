package src.practice.composition;

public class Client {
    private String name;
    private String surname;
    private Data data;

    public Client(String name, String surname, Data data) {
        this.name = name;
        this.surname = surname;
        this.data = data;
    }

    public String getClientInfo() {
        return "Клієнт: " + name + " " + surname + ". Дата народженя: " + data;
    }
}
