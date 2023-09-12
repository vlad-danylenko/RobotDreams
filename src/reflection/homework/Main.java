package src.reflection.homework;

public class Main {
    public static void main(String[] args) {
        LengthNameInterceptor lengthNameInterceptor = new LengthNameInterceptor();
        Student vlad = new Student("Vladyslav Danylenko", 26);
        Student vlad1 = new Student("Vladyslav Danylenko fdsfsfwevdv", 26);
        lengthNameInterceptor.checkForNameValidation(vlad);
        lengthNameInterceptor.checkForNameValidation(vlad1);
    }
}
