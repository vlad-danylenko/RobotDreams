package src.lesson_9;

public class Student {
    public Student (String name, String ticketNumber, int avgScore) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.avgScore = avgScore;
    }

    private String name;
    private String ticketNumber;
    private int avgScore;

    public String getName () {
        return name;
    }
    public String getTicketNumber () {
        return ticketNumber;
    }

    public int getAvgScore () {
        return avgScore;
    }

    public void setName (String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name is empty");
        }
    }

    public void setTicketNumber (String ticketNumber) {
        if (isNumeric(ticketNumber)) {
            this.ticketNumber = ticketNumber;
    } else {
            System.out.println("Use numbers");
        }
}

    public void setAvgScore (int avgScore) {
        if (avgScore>0 && avgScore<=100) {
            this.avgScore = avgScore;
        } else {
            System.out.println("Enter from 1 to 100");
        }
    }

    private boolean isNumeric (String str) {
        return str.matches("\\d+");
    }
}