package src.lesson_7;

public class practice_2 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("RobotDreams");
        //System.out.println(name);
        checkMethod(name);
        System.out.println(name);
    }

  private static StringBuilder checkMethod(StringBuilder name) {

        if (!name.isEmpty()) {
            checkMethod(name.deleteCharAt(name.length()-1));
        }
        return name;

    }
}
