package src.reflection.lecturep;

public class Main {
    public static void main(String[] args) {
        Person vlad = new Person("Vladyslav","Danylenko",26);
        CheckForAgeInterceptor checkForAgeInterceptor = new CheckForAgeInterceptor();

        checkForAgeInterceptor.checkForAgeValidation(vlad);
    }
}
